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
        String response = getBody();
//        JSONArray results = new JSONObject(response).getJSONArray("results");
        JSONArray results = new JSONObject("{\n" +
                "    \"meta\": {\n" +
                "        \"name\": \"openaq-api\",\n" +
                "        \"license\": \"CC BY 4.0d\",\n" +
                "        \"website\": \"https://u50g7n0cbj.execute-api.us-east-1.amazonaws.com/\",\n" +
                "        \"page\": 1,\n" +
                "        \"limit\": 100,\n" +
                "        \"found\": 129\n" +
                "    },\n" +
                "    \"results\": [\n" +
                "        {\n" +
                "            \"locationId\": 10750,\n" +
                "            \"location\": \"Warszawa-Bajkowa\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 5.92,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T18:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T20:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.188474,\n" +
                "                \"longitude\": 21.176233\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 10775,\n" +
                "            \"location\": \"Warszawa-Chrościckiego\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 5.64,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T18:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T20:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.207742,\n" +
                "                \"longitude\": 20.906073\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 10776,\n" +
                "            \"location\": \"Warszawa-Komunikacyjna\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 7.79,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T18:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T20:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.219298,\n" +
                "                \"longitude\": 21.004724\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 6386,\n" +
                "            \"location\": \"Warszawa-Ursynów\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 4.97,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T18:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T20:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.160772,\n" +
                "                \"longitude\": 21.033819\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 10775,\n" +
                "            \"location\": \"Warszawa-Chrościckiego\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 5.59,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T17:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T19:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.207742,\n" +
                "                \"longitude\": 20.906073\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 10776,\n" +
                "            \"location\": \"Warszawa-Komunikacyjna\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 6.88,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T17:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T19:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.219298,\n" +
                "                \"longitude\": 21.004724\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 6381,\n" +
                "            \"location\": \"Warszawa-Tołstoja\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 6.1,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T17:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T19:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.285073,\n" +
                "                \"longitude\": 20.933018\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 6386,\n" +
                "            \"location\": \"Warszawa-Ursynów\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 4.41,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T17:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T19:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.160772,\n" +
                "                \"longitude\": 21.033819\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 10750,\n" +
                "            \"location\": \"Warszawa-Bajkowa\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 5.26,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T17:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T19:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.188474,\n" +
                "                \"longitude\": 21.176233\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 10776,\n" +
                "            \"location\": \"Warszawa-Komunikacyjna\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 7.28,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T16:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T18:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.219298,\n" +
                "                \"longitude\": 21.004724\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 10750,\n" +
                "            \"location\": \"Warszawa-Bajkowa\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 4.78,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T16:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T18:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.188474,\n" +
                "                \"longitude\": 21.176233\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 10775,\n" +
                "            \"location\": \"Warszawa-Chrościckiego\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 5.78,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T16:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T18:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.207742,\n" +
                "                \"longitude\": 20.906073\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 6386,\n" +
                "            \"location\": \"Warszawa-Ursynów\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 4.66,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T16:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T18:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.160772,\n" +
                "                \"longitude\": 21.033819\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 10775,\n" +
                "            \"location\": \"Warszawa-Chrościckiego\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 6.48,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T15:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T17:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.207742,\n" +
                "                \"longitude\": 20.906073\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 10776,\n" +
                "            \"location\": \"Warszawa-Komunikacyjna\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 7.87,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T15:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T17:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.219298,\n" +
                "                \"longitude\": 21.004724\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 6386,\n" +
                "            \"location\": \"Warszawa-Ursynów\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 4.92,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T15:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T17:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.160772,\n" +
                "                \"longitude\": 21.033819\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 10750,\n" +
                "            \"location\": \"Warszawa-Bajkowa\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 5.29,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T15:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T17:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.188474,\n" +
                "                \"longitude\": 21.176233\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 10750,\n" +
                "            \"location\": \"Warszawa-Bajkowa\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 5.54,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T14:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T16:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.188474,\n" +
                "                \"longitude\": 21.176233\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 10776,\n" +
                "            \"location\": \"Warszawa-Komunikacyjna\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 8.79,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T14:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T16:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.219298,\n" +
                "                \"longitude\": 21.004724\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 6386,\n" +
                "            \"location\": \"Warszawa-Ursynów\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 5.74,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T14:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T16:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.160772,\n" +
                "                \"longitude\": 21.033819\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 10775,\n" +
                "            \"location\": \"Warszawa-Chrościckiego\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 6.48,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T14:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T16:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.207742,\n" +
                "                \"longitude\": 20.906073\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 10750,\n" +
                "            \"location\": \"Warszawa-Bajkowa\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 5.87,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T13:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T15:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.188474,\n" +
                "                \"longitude\": 21.176233\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 6381,\n" +
                "            \"location\": \"Warszawa-Tołstoja\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 7.37,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T13:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T15:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.285073,\n" +
                "                \"longitude\": 20.933018\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 10775,\n" +
                "            \"location\": \"Warszawa-Chrościckiego\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 6.39,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T13:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T15:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.207742,\n" +
                "                \"longitude\": 20.906073\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 10776,\n" +
                "            \"location\": \"Warszawa-Komunikacyjna\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 8.75,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T13:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T15:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.219298,\n" +
                "                \"longitude\": 21.004724\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 6386,\n" +
                "            \"location\": \"Warszawa-Ursynów\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 5.57,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T13:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T15:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.160772,\n" +
                "                \"longitude\": 21.033819\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 6386,\n" +
                "            \"location\": \"Warszawa-Ursynów\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 5.26,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T12:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T14:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.160772,\n" +
                "                \"longitude\": 21.033819\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 10776,\n" +
                "            \"location\": \"Warszawa-Komunikacyjna\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 7.85,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T12:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T14:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.219298,\n" +
                "                \"longitude\": 21.004724\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 10775,\n" +
                "            \"location\": \"Warszawa-Chrościckiego\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 6.55,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T12:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T14:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.207742,\n" +
                "                \"longitude\": 20.906073\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"locationId\": 10750,\n" +
                "            \"location\": \"Warszawa-Bajkowa\",\n" +
                "            \"parameter\": \"pm25\",\n" +
                "            \"value\": 5.43,\n" +
                "            \"date\": {\n" +
                "                \"utc\": \"2021-05-11T12:00:00+00:00\",\n" +
                "                \"local\": \"2021-05-11T14:00:00+02:00\"\n" +
                "            },\n" +
                "            \"unit\": \"µg/m³\",\n" +
                "            \"coordinates\": {\n" +
                "                \"latitude\": 52.188474,\n" +
                "                \"longitude\": 21.176233\n" +
                "            },\n" +
                "            \"country\": \"PL\",\n" +
                "            \"city\": \"Warszawa\",\n" +
                "            \"isMobile\": false,\n" +
                "            \"isAnalysis\": false,\n" +
                "            \"entity\": \"government\",\n" +
                "            \"sensorType\": \"reference grade\"\n" +
                "        }\n" +
                "    ]\n" +
                "}").getJSONArray("results");
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
        list.sort(Comparator.comparing(Pollution::getDate)
                .thenComparing(Comparator.comparing(Pollution::getLocation)));
        System.out.println(list);
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
