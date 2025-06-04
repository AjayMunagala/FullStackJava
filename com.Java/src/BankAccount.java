/*
 * Create a BankAccount class (BLC Class)

Attributes:

Names    Return Type
accountNumber    
balance    
Access Modifier: private (for all variables)

Implement the following methods:

Setter Methods:

Purpose: Initialize the values of accountNumber and balance.
Method Signatures:
public void setAccountNumber(int accountNumber)
public void setBalance(double balance)
Getter Methods:

Purpose: Retrieve the values of accountNumber and balance.
Method Signatures:
public int getAccountNumber()
public double getBalance()
deposit() Method:

Purpose: Add the specified amount to the balance.
Return Type: void
Access Modifier: public
Parameters:
double amount
Functionality: Use getBalance() to retrieve the current balance, add the
amount, and update the balance using setBalance().
withdraw() Method:

Purpose: Subtract the specified amount from the balance if sufficient
funds are available.
Return Type: void
Access Modifier: public
Parameters:
double amount
Functionality: Use getBalance() to retrieve the current balance,
subtract the amount if sufficient, and update the balance using setBalance().
checkBalance() Method:

Purpose: Print the current balance.
Return Type: void
Access Modifier: public
Parameters: None
Functionality: Use getBalance() to retrieve and print the balance.
transfer() Method:

Purpose: Transfer money between two accounts if sufficient funds are available.
Return Type: void
Access Modifier: public static
Parameters:
BankAccount sourceAccount
BankAccount destinationAccount
double amount
Functionality: Use withdraw() on the source account and deposit() on
the destination account, after verifying sufficient funds in the source
account using getBalance().
Implement a separate Tester class (ELC Class) with a main method to
demonstrate the following scenarios:

Test Case 1:
Scenario: Valid Deposit
Input:
Set accountNumber: 1001
Set initialBalance: 5000.00 using setBalance()
depositAmount: 2000.00
Expected Output:
After depositing, the balance should be updated to 7000.00.
Print the updated balance using checkBalance(): 7000.00.

Test Case 2:
Scenario: Valid Withdrawal
Input:
Set accountNumber: 1002
Set initialBalance: 8000.00 using setBalance()
withdrawAmount: 3000.00
Expected Output:
After withdrawal, the balance should be updated to 5000.00.
Print the updated balance using checkBalance(): 5000.00.

Test Case 3:
Scenario: Invalid Withdrawal (Insufficient Funds)
Input:
Set accountNumber: 1003
Set initialBalance: 1500.00 using setBalance()
withdrawAmount: 2000.00
Expected Output:
Print an error message indicating insufficient funds (e.g., "Insufficient funds. Withdrawal failed.").
Balance remains 1500.00.

Test Case 4:
Scenario: Checking Balance
Input:
Set accountNumber: 1004
Set initialBalance: 2500.00 using setBalance()
Expected Output:
Print the current balance using checkBalance(): 2500.00.

Test Case 5:
Scenario: Valid Transfer Between Two Accounts
Input:
Set Source Account: 1005, Balance: 10000.00 using setBalance()
Set Destination Account: 1006, Balance: 5000.00 using setBalance()
transferAmount: 3000.00
Expected Output:
After transfer, the source account balance should be updated to 7000.00.
Destination account balance should be updated to 8000.00.
Print the updated balances using checkBalance():
Source Account Balance: 7000.00
Destination Account Balance: 8000.00.

Test Case 6:
Scenario: Invalid Transfer (Insufficient Funds)
Input:
Set Source Account: 1007, Balance: 2000.00 using setBalance()
Set Destination Account: 1008, Balance: 3000.00 using setBalance()
transferAmount: 4000.00
Expected Output:
Print an error message indicating insufficient funds for transfer
(e.g., "Insufficient funds. Transfer failed.").
Source account balance remains 2000.00.
Destination account balance remains 3000.00.
 */
public class BankAccount {
    private int accountNumber;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public  void deposit(double amount){
      balance = balance + amount;
      System.out.println("After deosit totaa Amount in aCCOUNT IS :"+balance);  
}
    public  void withdraw(double amount){
        if(amount < balance){
            balance-=amount;
            System.out.println("After withdraw or send Remaining Balance id :"+ balance);
        }else{
            System.out.println("poi ra raiii balance check chasko poooo!!!");
        }
    }
    public void currrentBalance(){
        System.out.println("Current balance in the Account is :"+balance);
    }
    public static void transfer(BankAccount sourceAccount, BankAccount  destinationAccount,double amount){
        System.out.println("");
        System.out.println("Money Transfer From Source Account t DestinationAccount");
         sourceAccount.withdraw(amount);
         destinationAccount.deposit(amount);

    }
}
