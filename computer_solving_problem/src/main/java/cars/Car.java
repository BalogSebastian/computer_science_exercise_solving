package cars;

import java.io.Serializable;

    public record Car(
            String brand,
            String model,
            int year,
            int horsepower
    ) implements Serializable{}
