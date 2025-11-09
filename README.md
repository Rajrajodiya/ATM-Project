# 🏦 ATM Simulation System (Java Console Application)

# ATM-Project
A simple Java-based ATM simulation program that allows users to perform basic banking operations such as PIN verification, balance inquiry, withdrawal, and deposit. This project demonstrates the use of loops, conditionals, and user input handling in Java — a great beginner-level console application for learning core Java concepts.


## 📘 Overview
This is a simple **ATM (Automated Teller Machine)** simulation program built using **Core Java**.  
It allows users to **authenticate using a PIN**, and then perform basic banking operations such as:
- 🔑 Password change  
- 💸 Withdrawal  
- 💰 Deposit  
- 📊 Balance inquiry  
- 🚪 Exit  

If the user enters the wrong password three times, the account is **locked for 24 hours**.

---

## ⚙️ Features
✅ Secure PIN-based authentication  
✅ Password validation (numeric & 4 digits only)  
✅ Real-time balance update  
✅ Menu-driven operation  
✅ Input validation & user-friendly prompts  

---

## 🧩 Technologies Used
| Component | Description |
|------------|-------------|
| **Language** | Java |
| **Concepts Used** | Loops, Conditionals, Switch-case, Scanner Class, Input Validation |
| **Execution Type** | Console-based Application |

---

## 💻 How to Run
1. Open a terminal or command prompt.  
2. Compile the file:
   ```bash
   javac ATM.java
   ```
3. Run the program:
   ```bash
   java ATM
   ```

---

## 🧾 Sample Output Design (Updated for Professional Look)

### 🔐 Login Section
```
========================================
          WELCOME TO ATM SYSTEM
========================================

Attempt 1 - Enter the four digit password: 1234

----------------------------------------
Login Successful ✅
----------------------------------------
```

### 🏠 Main Menu
```
========================================
        AUTOMATED TELLER MACHINE
========================================

1️⃣  Change Password
2️⃣  Withdraw Money
3️⃣  Deposit Money
4️⃣  Check Balance
5️⃣  Exit

👉 Choose the operation you want to perform: 2
```

### 💸 Withdraw Example
```
Enter money to be withdrawn: 2000

💵 Please collect your money.
✅ Remaining Balance: 98,000
----------------------------------------
```

### 💰 Deposit Example
```
Enter money to be deposited: 5000

✅ Your money has been successfully deposited.
💰 Updated Balance: 103,000
----------------------------------------
```

### 🔑 Password Change Example
```
Enter New Password: 5678
::::: Password changed successfully ::::: 
----------------------------------------
```

### 🚪 Exit Example
```
========================================
        THANK YOU FOR USING ATM
========================================
```

### ❌ Invalid Login Example
```
Attempt 3 - Enter the four digit password: 4567
Invalid password ❌
Your Account is locked for 24 Hours 🔒
```

---

## 🧠 Key Learnings
- Implementation of authentication and retry mechanisms  
- Proper input validation using Java’s Scanner  
- Console UI design for user interaction  
- Use of `while` loops and `switch-case` structures  

---

## 👤 Author
**Raj Rajodiya**  
📧 rajrajodiya022.com  
💼 GitHub: [https://github.com/Rajrajodiya](https://github.com/Rajrajodiya)
🔗 LinkedIn:[www.linkedin.com/in/raj-rajodiya](www.linkedin.com/in/raj-rajodiya)

