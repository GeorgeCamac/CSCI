package Week3;

public class MathPlayground {
    static double balance = 10.2;
    static int intbal = (int) balance;
 
    
    public static void main(String[] args) {
        System.out.println(balance);
        System.out.println(intbal);
        System.out.println(Math.round(balance));
        System.out.println(Math.ceil(balance));
    }
}
