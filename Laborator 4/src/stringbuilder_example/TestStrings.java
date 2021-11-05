package stringbuilder_example;

import java.time.Duration;
import java.time.Instant;

public class TestStrings {
    private static final int SIZE = 50000;

    public static void main(String [] args) {
        String s = "POO";
        Instant start = Instant.now();

        for (int i = 0; i < SIZE; ++i) {
            s += "e cea mai tare materie";
        }
        Instant end = Instant.now();
        System.out.println("Append-ul pe string a durat: " + Duration.between(start, end).toMillis() / 1000.f + "s");

        StringBuilder sb = new StringBuilder("POO");
        start = Instant.now();

        for (int i = 0 ; i < SIZE; ++i) {
            sb.append("e cea mai tare materie");
        }
        end = Instant.now();
        System.out.println("Append-ul pe StringBuilder a durat: " + Duration.between(start, end).toMillis() / 1000.f + "s");
    }
}