package TaskSixth;

public class Car extends Vehicle{
    private int numberOfSeats;
    public Car(String manufacturer, String model, int year, double baseRentalPrice, int numberOfSeats) {
        super(manufacturer, model, year, baseRentalPrice);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }
}
