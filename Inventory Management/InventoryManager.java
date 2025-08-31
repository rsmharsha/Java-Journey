import java.util.ArrayList;
import java.util.Scanner;

public class InventoryManager {
    public static void main(String[] args) {
        ArrayList<Item> inventory = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Display Inventory");
            System.out.println("3. Add Stock");
            System.out.println("4. Remove Stock");
            System.out.println("5. Update Price");
            System.out.println("6. Search Item by ID");
            System.out.println("7.Delete Item");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Add item
                    try {
                        System.out.print("Enter Item ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Item Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Quantity: ");
                        int qty = sc.nextInt();

                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble();

                        Item newItem = new Item(id, name, qty, price);
                        inventory.add(newItem);
                        System.out.println("Item added successfully!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2: // Display
                    if (inventory.isEmpty()) {
                        System.out.println("No items in inventory yet.");
                    } else {
                        for (Item item : inventory) {
                            item.displayItem();
                        }
                    }
                    break;

                case 3: // Add Stock
                    System.out.print("Enter Item ID: ");
                    int addId = sc.nextInt();
                    Item addItem = findItemById(inventory, addId);
                    if (addItem != null) {
                        System.out.print("Enter quantity to add: ");
                        int qty = sc.nextInt();
                        addItem.addStock(qty);
                        System.out.println("Stock updated.");
                    } else {
                        System.out.println("Item not found!");
                    }
                    break;

                case 4: // Remove Stock
                    System.out.print("Enter Item ID: ");
                    int remId = sc.nextInt();
                    Item remItem = findItemById(inventory, remId);
                    if (remItem != null) {
                        System.out.print("Enter quantity to remove: ");
                        int qty = sc.nextInt();
                        remItem.removeStock(qty);
                    } else {
                        System.out.println("Item not found!");
                    }
                    break;

                case 5: // Update Price
                    System.out.print("Enter Item ID: ");
                    int priceId = sc.nextInt();
                    Item priceItem = findItemById(inventory, priceId);
                    if (priceItem != null) {
                        System.out.print("Enter new price: ");
                        double newPrice = sc.nextDouble();
                        priceItem.updatePrice(newPrice);
                    } else {
                        System.out.println("Item not found!");
                    }
                    break;

                case 6: // Search Item
                    System.out.print("Enter Item ID: ");
                    int searchId = sc.nextInt();
                    Item searchItem = findItemById(inventory, searchId);
                    if (searchItem != null) {
                        searchItem.displayItem();
                    } else {
                        System.out.println("Item not found!");
                    }
                    break;

                case 7: // Exit
                    System.out.print("Enter Item ID to delete: ");
                    int delId = sc.nextInt();
                    Item delItem = findItemById(inventory, delId);
                    if (delItem != null) {
                        inventory.remove(delItem);
                        System.out.println("✅ Item deleted successfully!");
                    } else {
                        System.out.println("❌ Item not found!");
                    }
                    break;

                case 8: // Delete Item
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // Helper method to find Item by ID
    private static Item findItemById(ArrayList<Item> inventory, int id) {
        for (Item item : inventory) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
