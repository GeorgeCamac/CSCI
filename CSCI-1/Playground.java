import Week2.Access;

public class Playground {
    public static void main(String[] args) {
        String name = "George";
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.replace("g","L"));

        // Method playground 
        Counter count = new Counter();
        System.out.println(count.getValue());
        count.click();
        System.out.println(count.getValue());
        count.click();
        System.out.println(count.getValue());
        count.click();
        count.click();
        count.click();
        System.out.println(count.getValue());
        count.minusClick();
        System.out.println(count.getValue());
        count.reset();
        System.out.println(count.getValue());
        // Method with Void
        Access test = new Access();
        System.out.println(test.getCat1());;

        addExclamationPoint(name);
        // Method without Void
        newAddExclamationPoint(name);
    
        String eclaimName = newAddExclamationPoint(name);
        System.out.println(eclaimName);

        
        Friend newFriend = new Friend();
        String FriendName = newFriend.myFriendName();
        
        System.out.println(FriendName);

        String validateFriend = newFriend.validateFriend(name);
        System.out.println(validateFriend);
        System.out.println(newFriend.validateFriend("jake"));

        
    }




    // make a method
    // method addExclamationPoint
    public static void addExclamationPoint(String s){
        System.out.println(s + "!");
    }

    // make a method that returns a string
    public static String newAddExclamationPoint(String s) {
            
        return s + "!";
    }



}
