# Bank Account Simulation

This is a simple **Java console application** that simulates a bank account system with the ability to:  
- Create bank accounts (with or without an initial deposit).  
- Deposit money.  
- Withdraw money (with error handling).  
- View account numbers and balances.  

⚠️ **Disclaimer:**  
This is **not real banking software**. It uses `double` for money, which introduces rounding issues in real-world finance. For production-grade banking code, you’d use `BigDecimal` or store amounts in cents as `long`.

---

**Example Output**
1234567890123
10000.0
4999.232
9876543210987
12000.0
12001.0
Account #1234567890123 | Balance: 4999.232
Account #9876543210987 | Balance: 12001.0
