public class Truck extends Vehicle {
    public Truck(String brand, String model, double baseRate) {
        super(brand, model, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return getBaseRate() * days + (days * 200); // extra charge per day
    }
}