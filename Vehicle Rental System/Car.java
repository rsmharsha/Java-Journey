public class Car extends Vehicle {
    public Car(String brand, String model, double baseRate) {
        super(brand, model, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return getBaseRate() * days + 500; // additional service fee
    }
}