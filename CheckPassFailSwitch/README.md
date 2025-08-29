# 🎓 Check Pass/Fail with Switch & GUI (Java)

A simple Java program that checks student marks using a `switch` statement and shows the result in a **GUI pop-up** (using Swing).  

This project demonstrates:
- Using `switch` for range-based logic
- Splitting **logic** and **UI** into separate classes
- Handling **user input** via GUI (`JOptionPane`)

---

## 🖥️ How It Works
1. `Main.java` pops up a dialog asking the user to **enter marks**.  
2. Input is passed to `CheckPassFailSwitch.check(mark)`.  
3. Logic decides the grade based on given ranges:
   - **91–100** → Excellent  
   - **86–90** → Very Good  
   - **81–85** → Good  
   - **79–80** → Satisfactory  
   - **75–78** → Fair  
   - **< 75** → Fail  
   - Anything else → Invalid mark  
4. The **final result** (grade + `"DONE"`) is shown in another GUI pop-up.

---

## 📸 Example Run
👉 Input: `83`  
👉 Output Pop-up:
Good
DONE
