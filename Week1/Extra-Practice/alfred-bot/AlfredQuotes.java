import java.util.Date; 
import java.util.ArrayList;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    
    public String guestGreeting(String name)  {
        return "Hello " + name + ". Lovely to see you.";
    }
    
    public String guestGreeting(String dayPeriod, String name) {
        return "Good " + dayPeriod +", " + name + ". Lovely to see you.";

    }


    public String dateAnnouncement() {
        Date date = new Date(); 
        return "The current date is: " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (conversation.indexOf("Alfred") > -1) {
            return "At your service. As you wish, naturally."; 
        }
        else {
            return "Right. And with that I shall retire."; 
        }
    }

    public void arrayList() {
        ArrayList<String> myArray = new ArrayList<String>();
        myArray.add("Zainab"); 
        myArray.add("Reena"); 
        myArray.add("Sana"); 
        myArray.add("Adam"); 
        System.out.println(myArray);
    }

}

