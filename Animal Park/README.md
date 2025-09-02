# 🐾 Animal Park – Learning Upcasting & Downcasting in Java

This mini project demonstrates **Upcasting** and **Downcasting** in Java using a simple `Animal` class hierarchy.  
It’s designed for learners who want to **see polymorphism in action** and understand why **upcasting is safe** while **downcasting is risky**.  

---

## 📖 Concepts

### 1. Upcasting
- Casting a **subclass** object to a **superclass** reference.  
- Done **automatically** by the compiler.  
- **Safe** because every `Dog` **is an** `Animal`.  

```java
Animal a = new Dog();   // Upcasting
a.makeSound();          // Calls Dog’s overridden method: "Woof! Woof!"
// a.fetch();           // ❌ Not allowed, reference is Animal
```

### 2. Downcasting

- Casting a superclass reference back to a subclass.
- Done manually using (Subclass) cast.
- Risky because not every Animal is necessarily a Dog.

```java
Animal a = new Dog();
Dog d = (Dog) a;  // Downcasting
d.fetch();        // ✅ Works, because 'a' is actually a Dog
```
#### Unsafe Example 

```java
Animal a2 = new Animal();
Dog d2 = (Dog) a2;  // Compiles fine, but at runtime → ClassCastException
```

### 3. Polymorphism

- Even when upcasted, Java uses the actual object’s method implementation at runtime.

``` java
List<Animal> zoo = new ArrayList<>();
zoo.add(new Dog());
zoo.add(new Cat());
zoo.add(new Cow());

for (Animal a : zoo) {
    a.makeSound(); // Dog → Woof! | Cat → Meow! | Cow → Moo!
}
```
