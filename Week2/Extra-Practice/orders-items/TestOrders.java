import java.util.ArrayList; 


public class TestOrders {
    public static void main(String[] args) {
        
        Item item1 = new Item("latte", 2.25); 
        Item item2 = new Item("drip coffee", 2.00); 
        Item item3 = new Item("cappucino", 3.25); 
        Item item4 = new Item("mocha", 3.20); 


        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");
        Order order5 = new Order(); 
        Order order6 = new Order(); 

        order1.addItem(item1); 
        order1.addItem(item2); 

        System.out.println(order1.getStatusMessage()); 
    }

}
