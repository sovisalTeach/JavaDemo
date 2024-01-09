package TaskSixth;

public class Motorcycle extends Vehicle{
    private boolean needHelmet;

    public Motorcycle(String manufacturer, String model, int year, double baseRentalPrice, boolean needHelmet) {
        super(manufacturer, model, year, baseRentalPrice);
        this.needHelmet = needHelmet;
    }

    public boolean hasInsurance() {
        return this.needHelmet;
    }
}
