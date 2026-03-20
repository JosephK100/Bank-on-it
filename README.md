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

Next week I'll get to add the whole pin, add user, and admin systems.
