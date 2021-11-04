package Week6;

import java.util.Scanner;

public class Arrays {
    


    public static void main(String[] args) {
        int[] anArray;
        anArray = new int[10];
        
        System.out.println(anArray[0]);
        //[?,?,?,?,?,?,?,?,?,?,?]
        
        System.out.println(anArray[0]);
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        

        System.out.println(anArray[9]);

        int[] shortArray = {
            0,1,200,3,4,5,6,7,8,9
        };
        
        for (int i : shortArray){
            System.out.println(i);
        }

        String[] name = {"Appa","Momo","Jack"};
        System.out.println(name[0]);

        for(int i = 0; i <name.length; i++){
            System.out.println(name[i]);
        }

        System.out.println("For Each");
        
        for(String string : name){
            System.out.println(string);
        }

        String[] nameUnknown = new String[10];
        nameUnknown[0] = "Greg";
        nameUnknown[1] = "George";
        nameUnknown[2] = "Ryan";
        nameUnknown[3] = "Ryan";

        System.out.println(nameUnknown[2]);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Word");
        String str = keyboard.next();

        nameUnknown[4] = str;

        for(String string : nameUnknown){
            System.out.println(string);
        }

        char[] ch = new char[str.length()];

        for(int i = 0; i < str.length(); i++){
            ch[i] = str.charAt(i);
        }

        System.out.println(ch);

        for(char c : ch){
            System.out.println("Char: " + c);
        }

        
    }

}
