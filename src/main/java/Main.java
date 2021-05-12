import api.Pm25;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new Pm25().getPm25();
        } catch (IOException | InterruptedException e ) {
            e.printStackTrace();
            System.out.println("It's problem with API");
        }
    }
}
