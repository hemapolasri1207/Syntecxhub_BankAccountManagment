# 🏦 Bank Account Management System (Java)

## 📌 Project Overview

This is a simple **Bank Account Management System** developed using **Java Collections (HashMap)**.
It allows users to perform basic banking operations like creating accounts, depositing money, withdrawing money, and checking account balance.

This project is designed for **beginners** to understand how Java collections can be used in real-world applications.

---

## 🚀 Features

* Create a new bank account
* Deposit money into an account
* Withdraw money from an account
* View account details and balance
* Prevent duplicate account creation
* Basic validation for secure transactions

---

## 🛠️ Technologies Used

* Java
* HashMap (Java Collections Framework)
* Scanner (User Input Handling)

---

## 📂 Project Structure

```
BankManagement.java
```

---

## ⚙️ How It Works

* Each bank account is represented using a `BankAccount` class.

* All accounts are stored in a `HashMap`:

  * **Key** → Account Number
  * **Value** → BankAccount Object

* The system provides a menu-driven interface where users can:

  1. Create an account
  2. Deposit money
  3. Withdraw money
  4. View balance

---

## ▶️ How to Run the Project

1. Install Java (JDK 8 or above)
2. Save the file as `BankManagement.java`
3. Open terminal/command prompt
4. Compile the program:

   ```
   javac BankManagement.java
   ```
5. Run the program:

   ```
   java BankManagement
   ```

---

## 🧪 Sample Output

```
--- Bank Management System ---
1. Create Account
2. Deposit
3. Withdraw
4. View Balance
5. Exit
Choose option: 1

Enter Account Number: 101
Enter Account Holder Name: John
Account Created Successfully!
```

---

## 🔒 Basic Validation

* Prevents duplicate accounts
* Ensures sufficient balance before withdrawal
* Validates deposit amount

---

## 🎯 Learning Outcomes

* Understanding of Java Classes and Objects
* Usage of HashMap for data storage
* Implementation of CRUD-like operations
* Building menu-driven console applications

---

## 📈 Future Improvements

* Add password/PIN authentication
* Store data using files or database
* Create GUI using Java Swing
* Add transaction history

---

## 🙌 Conclusion

This project is a great starting point for beginners to learn how to build **real-world Java applications** using collections and object-oriented programming concepts.

---
