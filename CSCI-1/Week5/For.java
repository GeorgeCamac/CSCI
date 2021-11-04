package Week5;

import java.util.Scanner;
public class For {
public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    
        for(int i = 10; i <= 0; i-= 2){
            System.out.println(i);
        }
        System.out.println("Happy New Year");

        Scanner keyboard = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = keyboard.nextInt();
        System.out.println("Enter # of columns:");
        columns = keyboard.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = keyboard.next();

        System.out.println(rows + "" + columns + symbol);
        
        for (int j = 1; j <= columns; j++){
            System.out.println(symbol);
        }
    }


}
