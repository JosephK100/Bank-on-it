# Bank-on-it
Algorithm/Pseudocode
```
Create a CheckingAccount object with a default balance of 0.0.
    Start the main loop for the menu
    Create the menu that the user with use to initialize commands.
    Read the user choice as a string.
        If the user selects 0:
            Quit the program and end the loop. 
        else if the user enters 1:
            Check the balance (Currently just a mutable double.)
            Format the balance using getBalanceString()
            Print the current balance.
        else if user enters 2:
            Print ("Making a deposit")
            System.out.print ("How much would you like to deposit?")
            Use getDouble() to read the number.
            Add that amount from the current balance.
        else if the user enters 3:
            Print ("Making a withdrawal")
            System.out.print ("How much would you like to withdrawal?")
            Use getDouble() to read the number.
            Subtract that amount from the current balance.
        else:
            print ("Invalid choice, please try agian.")
    Loop until the user enters 0 to exit the loop.

---Admin Menu---
    Print the admin menu:
        0) Exit admin menu
        1) Full customer report
        2) Add new customer 
        3) Apply interest to all savings accounts
    If admin selects 1:
        Loop through all customers and print thier info.
    If admin selects 2:
        Ask for new customer's name and PIN.
        Create a customer object.
        Add it to the CustomerList.
    If the admin selects 3:
        For each customer:
            Call savings.applyInterest()
    Loop unti admin selects 0.

---Customer Menu---
    Print the customer menu:
        0) Exit customer menu
        1) Deposit into checking
        2) Deposit into savings
        3) Change PIN
        4) Get account report 

    If the customer selects 1:
        Call checking.makeDeposit ()
    If customer selects 2:
        Call savings.makeDeposit()
    If customer selects 3:
        Ask for a new PIN.
        Replace the old one.
    If the customer selects 4:
        Print both the checking and savings account balance.
    Loop until the customer selects 0.

---Checking/Savings Account---
    CheckingAccount:
        Balance starts at 0.0
        makeDeposit():
            Ask for amount.
            Add that amount to the balance.
        getBalanceString():
            Format balance as $0.00
    SavingsAccount:
        Inherits CheckingAccount
        Has interestRate (default 0.01)
        applyInterest():
            interest = balance * interestRate
            deposit(interest)

---Saving/Loading data---
    saveData():  
        Write CustomerList to a data file (customers.dat) using ObjectOutputStream.
    loadData():
        Try to read "customers.dat"
        If the file exists:
            Load CustomerList
        Else:
            Print an error message like "No save data found."
```
