public class Friend {
    
    public String myFriendName() {
        return "My name is Bob";
    }

    public static String validateFriend(String name) {
        if (name.contains("George")){
            return "Oh Hey " + name + " how are you today?"; 
        }
        else if (name.matches("[a-z]+")){
            return "I don't believe we have met... It's nice to meet you " + name;
        }
        else{
            return "Get away from me creep";
        }
    }
    
}
