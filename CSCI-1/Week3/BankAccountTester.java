package Week3;



public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount georgeChecking = new BankAccount();
        BankAccount bobChecking = new BankAccount(10000);

        System.out.println(georgeChecking.getBalance());
        

        System.out.println("Starting Balance");
        System.out.println(bobChecking.getBalance());
        bobChecking.withdraw(500);
        System.out.println("Balance After Withdraw");
        System.out.println(bobChecking.getBalance());
        bobChecking.deposit(100);
        System.out.println("Balance After Deposit");
        System.out.println(bobChecking.getBalance());
        
        georgeChecking.monthlyFee();
        System.out.println(georgeChecking.getBalance());
    }
}
