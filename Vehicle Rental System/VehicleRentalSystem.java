public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Toyota", "Camry", 2000);
        Vehicle v2 = new Bike("Yamaha", "FZ", 500);
        Vehicle v3 = new Truck("Tata", "HeavyDuty", 5000);

        v1.displayInfo();
        System.out.println("Rent for 3 days: " + v1.calculateRent(3));

        v2.displayInfo();
        System.out.println("Rent for 5 days: " + v2.calculateRent(5));

        v3.displayInfo();
        System.out.println("Rent for 2 days: " + v3.calculateRent(2));
    }
}
