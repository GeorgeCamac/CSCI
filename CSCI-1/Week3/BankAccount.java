package Week3;

import java.util.Scanner;

public class BankAccount{
    private double balance;

    public BankAccount(){
        balance = 0;
    }

    public BankAccount(double initalBalance) {
        balance = initalBalance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }

    public double getBalance(){
        return balance;
    }

    public void monthlyFee(){
        withdraw(10);
    }
    // P(1 + R/n)^(nt) - P
    // P = principle
    // t = years
    // r = annual interest rate
    // n = # of times its compounded
    public void calcInterest(double p, int t, double r, int n){
        double amount = p * Math.pow(1 + (r/n), n*t);
        double compinterst = amount - p;
        System.out.println("Compound interest after " + t + " years: " + compinterst);
        System.out.println("Amount after " + t + " years: " + amount);
    }

    public static int menu(){
        
        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println("Please select an option:");
        System.out.println("------------------------\n");
        System.out.println("1: Get balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("0: Quit");
        System.out.println("\n------------------------");

        selection = input.nextInt();

        return selection;
    } 


}