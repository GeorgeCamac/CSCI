package Week4;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {
        
    
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your First name");
        String first = in.next();
        System.out.println("Enter your significant others First name");
        String second = in.next();

        String initials = first.substring(0,1) + " & " + second.substring(0,1) + " <3";
        System.out.println(initials);
        

    }
}
