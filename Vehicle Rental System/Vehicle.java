abstract class Vehicle {
    private String brand;
    private String model;
    private double baseRate; // rent per day

    public Vehicle(String brand, String model, double baseRate) {
        this.brand = brand;
        this.model = model;
        this.baseRate = baseRate;
    }

    // Encapsulation → getters
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public double getBaseRate() { return baseRate; }

    // Abstract method → each vehicle calculates rent differently
    public abstract double calculateRent(int days);

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Base Rate: " + baseRate);
    }
}
