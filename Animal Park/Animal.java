// Base class
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound...");
    }
}

// Subclasses
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
    public void fetch() {
        System.out.println("Dog is fetching the ball");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
    public void scratch() {
        System.out.println("Cat is scratching the sofa");
    }
}

class Cow extends Animal {
    public void makeSound() {
        System.out.println("Moo! Moo!");
    }
    public void giveMilk() {
        System.out.println("Cow gives fresh milk");
    }
}
