package TaskSixth;

public class Vehicle {
    private String manufacturer;
    private String model;
    private int year;
    private double baseRentalPrice;
    private int rentalDays;

    public Vehicle(String manufacturer, String model, int year, double baseRentalPrice) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.baseRentalPrice = baseRentalPrice;
        this.rentalDays = 0;
    }
    public double calculateRentalCost() {
        return this.baseRentalPrice * this.rentalDays;
    }

    public double calculateRentalCost(double discount) {
        return this.calculateRentalCost()-(this.calculateRentalCost()*discount);
    }

    public void setRentalDays(int rentalDays) {
        //
        this.rentalDays = rentalDays;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }
    public double getBaseRentalPrice(){
        return this.baseRentalPrice;
    }

}
