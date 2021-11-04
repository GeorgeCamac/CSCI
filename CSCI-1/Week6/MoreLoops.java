package Week6;

public class MoreLoops {
    public static String everyNth(String str, int n){
        String result = "";

        for(int i = 0; i < str.length(); i = i + n){
            System.out.println(i +  "     " + str.charAt(i));
            result = result + str.charAt(i);

        }

        return result;
    }


    public static int countXX(String str){
        int count = 0;

        for(int i = 0; i < str.length() - 1; i++){
            if(str.substring(i, i + 2).equals("xx")){
                count ++;
            }
        }

        return count;
    }

    public static String oneTwo(String str){
        String result = "";
        for(int i = 0; i< str.length() - 2; i +=3){
            System.err.println("i = " + i);
            System.out.println(i + 1);
            System.out.println(i + 3);
            result = result + str.substring(i+1, i+3) + str.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;

        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            System.out.println("i = " + str.charAt(i) + " index = " + i);
            System.out.println("j = " + str.charAt(j) + " index = " + j);
            i++;
            j--;
        
        }
        return true;
    }

    public static void main(String[] args) {
       // System.out.println(oneTwo("Haxxppxxy Bixxrthday"));   
       System.out.println(isPalindrome("camac"));
    }


}
