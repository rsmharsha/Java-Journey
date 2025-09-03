# 🚗 Vehicle Rental System (Java Mini Project)

## 📌 Overview
This mini project demonstrates the core Object-Oriented Programming (OOP) principles in Java:
- **Abstraction**
- **Encapsulation**
- **Inheritance**
- **Polymorphism**

The project simulates a simple vehicle rental system where different types of vehicles (Car, Bike, Truck) have different rent calculation rules.

---

## 🏗️ OOP Concepts Used

### 1. Abstraction
- Implemented using the **abstract class** `Vehicle`.
- It contains abstract method `calculateRent(int days)` which is **implemented differently** in each child class.

### 2. Encapsulation
- Vehicle properties (`brand`, `model`, `baseRate`) are declared as **private**.
- Access is given only through **getters**, preventing direct modification.

### 3. Inheritance
- Classes `Car`, `Bike`, and `Truck` **extend** the `Vehicle` class.
- They inherit its fields and methods, and override the rent calculation method.

### 4. Polymorphism
- The `calculateRent` method behaves differently for Car, Bike, and Truck.
- Example: Car adds a fixed service fee, Truck adds extra charge per day, Bike is simple base rate.

---

## ✅ Sample Output
```
Brand: Toyota, Model: Camry, Base Rate: 2000.0
Rent for 3 days: 6500.0

Brand: Yamaha, Model: FZ, Base Rate: 500.0
Rent for 5 days: 2500.0

Brand: Tata, Model: HeavyDuty, Base Rate: 5000.0
Rent for 2 days: 10400.0
```

---

## 🎯 Learning Outcome
- I understood **how abstraction hides details**, **encapsulation secures data**, **inheritance reuses code**, and **polymorphism changes behavior dynamically**.
