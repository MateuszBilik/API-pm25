package api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Pm25 {

    public void getPm25() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(buildUri())
                .build();

        String response = client.send(request, HttpResponse.BodyHandlers.ofString())
                .body();
    }

    private URI buildUri() {
        String uri = new StringBuilder("https://u50g7n0cbj.execute-api.us-east-1.amazonaws.com/v2/")
                .append()

        return URI.create(uri);
    }
}
