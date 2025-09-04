public class Main {
    public static void main(String[] args) {
        // Upcasting - treating Cars, Bikes, Trucks as just Vehicles
        Vehicle[] garage = { new Car(), new Bike(), new Truck() };

        // Polymorphic calling site
        for (Vehicle v : garage) {
            v.start();  // JVM decides which "start()" to call at runtime
        }

        // Compare this with a non-polymorphic version:
        // you’d need if (v instanceof Car) ... else if (v instanceof Bike)...,
        // which is a mess.
        /*
        for (Vehicle v : garage) {
            if (v instanceof Car) {
                ((Car) v).startCar();
            } else if (v instanceof Bike) {
                ((Bike) v).startBike();
            } else if (v instanceof Truck) {
                ((Truck) v).startTruck();
            } else {
                v.start(); // fallback
            }
        }
        */
    }
}
