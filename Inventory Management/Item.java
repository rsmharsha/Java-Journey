public class Item {
    private int id;
    private String name;
    private int quantity;
    private double price;

    public Item(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative!");
        }else{
            this.quantity = quantity;
        }


        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative!");
        } else {
            this.price = price;
        }
    }


    public void addStock(int qty) {
        if (qty > 0) {
            quantity += qty;
        } else {
            System.out.println("Invalid quantity! Please enter a positive number.");
        }
    }

    public void removeStock(int qty){
        if(qty <= quantity){
            quantity = quantity - qty;
        } else{
            System.out.println("Not enough quantity, Available Quantity is: "+quantity);
        }
    }

    // Update price safely
    public void updatePrice(double newPrice) {
        if (newPrice >= 0) {
            this.price = newPrice;
            System.out.println("Price updated successfully.");
        } else {
            System.out.println("Invalid price! Price must be non-negative.");
        }
    }

    // Set quantity safely (overwrite existing quantity)
    public void updateQuantity(int newQuantity) {
        if (newQuantity >= 0) {
            this.quantity = newQuantity;
            System.out.println("Quantity updated successfully.");
        } else {
            System.out.println("Invalid quantity! Quantity must be non-negative.");
        }
    }


    public void displayItem(){
        System.out.printf("ID: %d\tName: %s\tQuantity: %d\tPrice: %.2f%n", id, name, quantity, price);
    }

    public int getId(){
        return id;
    }
}
