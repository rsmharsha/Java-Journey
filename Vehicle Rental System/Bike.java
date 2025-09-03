public class Bike extends Vehicle {
    public Bike(String brand, String model, double baseRate) {
        super(brand, model, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return getBaseRate() * days; // no extra charges
    }
}