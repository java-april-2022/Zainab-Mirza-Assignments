import java.util.ArrayList;


public class CafeUtil {

    public int getStreakGoal(int sumWeeks){
        int sum = 0; 
        for(int i=1; i<sumWeeks; i++){
            sum += i; 
        }
        return sum;
        
    }
    
    public double getOrderTotal(double[] prices){
        double sum = 0;
        for(int i=0; i < prices.length; i++){
            sum+=prices[i];
        }
        return sum; 
    }

    public void displayMenu(ArrayList<String>menuItems){
        for(int i =0; i<menuItems.size(); i++){
            System.out.printf("%s %s", i, menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String>customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName); 
        System.out.printf("There are %s people in front of you", customers.size());
        customers.add(userName); 
        System.out.println(customers); 
    }

    // max quantity ninja bonus 
    public double printPriceChart(String product, double price, int maxQuantity){
        for(double i=price; i<=price*maxQuantity; i=i+price){
            System.out.println(i);
        } 
        return price;
    }

}