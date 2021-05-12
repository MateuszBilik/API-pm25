package api;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pollution {

    private String type;
    private double value;
    private String date;
    private String location;
    private String unit;


    @Override
    public String toString() {
        return String.format("%1s %4s %3s %22s %3s %13s %3s %4s %3s %1s",
                "\n| ", type, " | ", location, " | ", getDateShorter(), " | ", value, unit, " |");
    }

    private String getDateShorter() {
        return date.substring(0, 16);
    }
}
