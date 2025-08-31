# 📚 Library Book Tracker

This is a simple **Java console application** that simulates a basic **library management system**.  
It allows users to:  
- View a list of books in the library.  
- Borrow books (if available).  
- Return borrowed books.  
- Exit the system.  

The program demonstrates the use of:  
- **`ArrayList`** to store book objects.  
- **Custom `Book` class** with attributes and methods.  
- **Menu-driven console interaction** with loops and switch-case.  

---

## ⚙️ Features
- **Show all books**: Displays each book’s title, author, and availability status.  
- **Borrow a book**: Marks the book as borrowed if it’s available, otherwise shows an error message.  
- **Return a book**: Marks the book as available again.  
- **Exit**: Gracefully exits the program.  

---

## 📖 Book Class
Each `Book` object has:  
- `title` (String)  
- `author` (String)  
- `isAvailable` (boolean)  

With methods:  
- `borrowBook()` → Changes status to borrowed.  
- `returnBook()` → Changes status to available.  
- `displayDetails()` → Prints book info with availability.  

---

## 🖥️ Example Output
📚 Library Book Tracker
1. Show all books
2. Borrow a book
3. Return a book
4. Exit

Enter your choice: 
