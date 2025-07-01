package CreationalPatterns.BuilderPattern;

public class Car {
    private String engine;
    private Integer wheels;
    private Integer seats;
    private Boolean sunRoof;

    public Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.seats = builder.seats;
        this.sunRoof = builder.sunRoof;
    }

    @Override
    public String toString() {
        return "Engine: " + engine + ", Wheels: " + wheels + ", Seats: " + seats + ", Sunroof: " + (sunRoof ? "Yes" : "No");
    }

    public static class CarBuilder {
        private String engine;
        private Integer wheels = 4;
        private Integer seats = 7;
        private Boolean sunRoof = false;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setWheels(Integer wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setSeats(Integer seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setSunRoof(Boolean sunRoof) {
            this.sunRoof = sunRoof;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}