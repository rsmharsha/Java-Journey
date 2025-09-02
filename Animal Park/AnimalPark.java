import java.util.*;

public class AnimalPark {
    public static void main(String[] args) {
        // Upcasting: treat all animals as Animal
        List<Animal> zoo = new ArrayList<>();
        zoo.add(new Dog());  // upcasts automatically
        zoo.add(new Cat());
        zoo.add(new Cow());

        // Polymorphism in action
        System.out.println("All animals making sounds:");
        for (Animal a : zoo) {
            a.makeSound(); // Calls overridden method
        }

        System.out.println("\n Downcasting to specific animals:");
        for (Animal a : zoo) {
            if (a instanceof Dog) {
                Dog d = (Dog) a;  // downcasting
                d.fetch();
            } else if (a instanceof Cat) {
                Cat c = (Cat) a;
                c.scratch();
            } else if (a instanceof Cow) {
                Cow c = (Cow) a;
                c.giveMilk();
            }
        }

        // Dangerous downcasting
        System.out.println("\n Demonstrating unsafe downcast:");
        Animal justAnimal = new Animal();
        try {
            Dog d = (Dog) justAnimal; // ClassCastException
            d.fetch();
        } catch (ClassCastException e) {
            System.out.println("Runtime error: Not every Animal is a Dog!");
        }
    }
}
