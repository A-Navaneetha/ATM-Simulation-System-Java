# 🏧 ATM Simulation System

A simple ATM Simulation System developed using Java. This console-based application allows users to perform basic banking operations such as depositing money, withdrawing funds, and checking account balance through a menu-driven interface.

## Features

-  Deposit Money
-  Withdraw Money
-  Check Account Balance
-  Menu-Driven Interface
-  Input Validation for Insufficient Balance
-  Exit Option

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Scanner Class for User Input

## Project Structure

```
ATM-Simulation/
│
├── ATM.class
├── ATM.java
└── README.md
```

## Sample Output

```text
PS C:\ATM-Simulation> javac ATM.java
PS C:\ATM-Simulation> java ATM

===== ATM MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter Choice: 3
Current Balance: 1000.0

===== ATM MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter Choice: 1
Enter Amount: 0
Invalid Amount! Please enter a positive value.

===== ATM MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter Choice: 1
Enter Amount: -200
Invalid Amount! Please enter a positive value.

===== ATM MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter Choice: 2
Enter Amount: 0
Invalid Amount! Please enter a positive value.

===== ATM MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter Choice: 200
Invalid Choice

===== ATM MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter Choice: 1
Enter Amount: 2000
Deposited: 2000.0

===== ATM MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter Choice: 2
Enter Amount: 1000
Withdrawn: 1000.0

===== ATM MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter Choice: 3
Current Balance: 2000.0

===== ATM MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter Choice: 4
Thank You!
```

## Learning Outcomes

This project demonstrates:

- Java Classes and Objects
- Methods and Method Calls
- Conditional Statements
- Loops (do-while)
- Switch Case
- User Input Handling
- Basic Banking Logic

## Future Enhancements

- PIN Authentication
- Multiple User Accounts
- Transaction History
- Fund Transfer Feature
- GUI using Java Swing/JavaFX
- Database Integration using MySQL
  
