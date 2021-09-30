package Week3;

import java.util.Scanner;

public class BankAccountTester {
    public static void main(String[] args) {
        // BankAccount georgeChecking = new BankAccount();
        // BankAccount bobChecking = new BankAccount(10000);

        // System.out.println(georgeChecking.getBalance());
        

        // System.out.println("Starting Balance");
        // System.out.println(bobChecking.getBalance());
        // bobChecking.withdraw(500);
        // System.out.println("Balance After Withdraw");
        // System.out.println(bobChecking.getBalance());
        // bobChecking.deposit(100);
        // System.out.println("Balance After Deposit");
        // System.out.println(bobChecking.getBalance());
        
        // // georgeChecking.monthlyFee();

        // System.out.println(georgeChecking.getBalance());

        // georgeChecking.deposit(50000);
        // georgeChecking.calcInterest(georgeChecking.getBalance(), 10, .01 ,12);

        //BankAccount.menu();
        Scanner keyboard = new Scanner(System.in);  

        System.out.println("Hello... Welcome.. How much money would you like to" + 
        "start an account with?");
        
        double startingBalance = keyboard.nextDouble();

        System.out.println("WOW $" + startingBalance + " thats a great start.. Let me get" +
         "the account started for you");

        BankAccount userBank = new BankAccount(startingBalance);

        System.out.println("Great the account is started");

        int menuSelection = BankAccount.menu();
        
        if (menuSelection == 1){
            System.out.println("Getting Account Balance...");
            System.out.println("Total Balance: $" + userBank.getBalance());
        }
        else if(menuSelection == 2){
            System.out.println("Please enter the amount to Deposit:\n");
            double depositAmount = keyboard.nextDouble();
            userBank.deposit(depositAmount);
            System.out.println("Amount: $" + depositAmount + " Was Deposited");
            System.out.println("Total Balance: $" + userBank.getBalance());
        }
        else if (menuSelection == 3){
            System.out.println("Please enter the amount to Withdraw:\n");
            double withdrawAmount = keyboard.nextDouble();
            userBank.withdraw(withdrawAmount);
            System.out.println("Amount: $" + withdrawAmount + " Was Withdrawn");
            System.out.println("Total Balance: $" + userBank.getBalance());
        }
        else if (menuSelection ==0){
            System.out.println("Have a good day...");
        }
        else {
            System.out.println("Error: NO VALID SELECTION");
        }
    }
}
