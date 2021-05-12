package api;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;

public class Pm25 {

    public void getPm25() throws IOException, InterruptedException {
        JSONArray results = new JSONObject(getBody()).getJSONArray("results");
        if (results.isEmpty()) {
            System.out.println("For today, we don't have data yet - come back later");
        }
        List<Pollution> list = listOfDataPollution(results);
        list.sort(Comparator.comparing(Pollution::getDate)
                .thenComparing(Comparator.comparing(Pollution::getLocation)));
        System.out.println(list);
    }

    private List<Pollution> listOfDataPollution(JSONArray results) {
        List<Pollution> list = new ArrayList<>();
        for (int i = 0; i < results.length(); i++) {
            list.add(new Pollution(
                    results.getJSONObject(i).getString("parameter"),
                    results.getJSONObject(i).getDouble("value"),
                    results.getJSONObject(i).getJSONObject("date").getString("local"),
                    results.getJSONObject(i).getString("location"),
                    results.getJSONObject(i).getString("unit")
            ));
        }
        return list;
    }

    private String getBody() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(buildUri())
                .build();
        return client.send(request, HttpResponse.BodyHandlers.ofString()).body();
    }

    private URI buildUri() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/pollution.properties"));
        String uri = new StringBuilder(props.getProperty("main.url"))
                .append("date_from=" + getDateTime()[0] + "T00%3A00%3A00%2B00%3A00")
                .append("&date_to=" + getDateTime()[0] + "T" + getDateTime()[1] + "%3A" + getDateTime()[2] + "%3A00%2B00%3A00")
                .append(props.getProperty("limit.page"))
                .append(props.getProperty("sort"))
                .append(props.getProperty("parameter"))
                .append(props.getProperty("radius"))
                .append(props.getProperty("city"))
                .append(props.getProperty("order"))
                .toString();
        return URI.create(uri);
    }

    private String[] getDateTime() {
        LocalTime timeNow = LocalTime.now();
        LocalDate dateToday = LocalDate.now();
        return new String[]{
                dateToday.toString(),
                String.valueOf(timeNow.getHour()),
                String.valueOf(timeNow.getMinute())};
    }
}
