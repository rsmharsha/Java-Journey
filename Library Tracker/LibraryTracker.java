import java.util.ArrayList;
import java.util.Scanner;

public class LibraryTracker {
    public static void showBooks(ArrayList<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            System.out.print("[" + i + "] ");
            books.get(i).displayDetails();
        }
    }
    public static void main(String[] args) {
        // Creating ArrayList of Books
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Do it Today", "Darius Foroux"));
        books.add(new Book("Sapiens", "Yuval Noah Harari"));
        books.add(new Book("The Rainmaker", "John Grisham"));
        books.add(new Book("The Motorcycle Diaries", "Che Guevera"));
        books.add(new Book("Meditations", "Marcus Aurelius (trans.G Hayes)"));
        books.add(new Book("When Breath Becomes Air", "Paul Kalanithi"));
        books.add(new Book("The Mountain Is You", "Brianna Wiest"));
        books.add(new Book("Deep Work", "Cal Newport"));

        Scanner scanner = new Scanner(System.in);
        int choice;

        // Menu Loop
        do {
            System.out.println("\n📚 Library Book Tracker");
            System.out.println("1. Show all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                   showBooks(books);
                    break;

                case 2:
                    showBooks(books);
                    System.out.print("Enter book index to borrow: ");
                    int index = scanner.nextInt();

                    if(index >= 0 && index < books.size()){
                        books.get(index).borrowBook();
                    } else {
                        System.out.println("Enter valid Index!");
                    }
                    break;

                case 3:
                    showBooks(books);
                    System.out.print("Enter book index to return: ");
                    int returnIndex = scanner.nextInt();

                    if(returnIndex >= 0 && returnIndex < books.size()){
                        books.get(returnIndex).returnBook();
                    } else {
                        System.out.println("Enter valid Index!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Bye!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 4);
    }
}
