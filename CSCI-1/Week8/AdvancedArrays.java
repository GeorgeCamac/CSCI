package Week8;

public class AdvancedArrays {
    
    public static boolean frontEnd(int[] nums){
        // if()
         return nums[0] == 9 || nums[nums.length - 1] == 9;
     }

    
     public static String call911(int[] nums){
         for(int i = 0; i < nums.length - 1; i++){
             if(nums[i] == 9 && nums[i + 1] == 1){
                 if(nums[i + 2] == 1){
                     return "The police are on their way";
                 }
                 else if (nums[i + 2] != 1){
                     return "Dialing the number";
                 }
                 break;
             }
         }
         return "Have a good day";
     }


     public static void main(String[] args) {
        int [] x = {1,2,3,9}; 
        System.out.println(frontEnd(x));
        int[] phoneNumber = {2,1,3,9,1,1,3,4};
        System.out.println(call911(phoneNumber));
    }

}

