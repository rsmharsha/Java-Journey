# 🛒 Inventory Management System (Java Mini Project)

## 📌 Project Overview
This is a **simple Inventory Management System** built in Java.  
It allows you to manage products in a small store using **classes, ArrayList, constructors, and validation checks**.

Users can:
- Add new items to inventory
- Display all items
- Add or remove stock
- Update price
- Search items by ID
- Delete items completely
- Exit the program safely

---

## 🏗️ Concepts Used
- **Object-Oriented Programming (OOP)**
  - Encapsulation (fields with private access + getters/setters)
  - Constructors with validation
  - Methods for stock management
- **Java Collections**
  - `ArrayList<Item>` to store items dynamically
- **Exception Handling**
  - Prevents invalid values like negative quantity or price
- **Scanner Class**
  - For user input in the console

---

## ⚙️ How It Works
1. The system shows a **menu** with options.  
2. User selects an operation (e.g., add item, update stock).  
3. Input is validated (no negative quantity or price).  
4. Operations update the **ArrayList<Item>** dynamically.
