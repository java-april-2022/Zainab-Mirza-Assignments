import java.util.ArrayList; 


public class TestOrders {
    public static void main(String[] args) {
        
        Item item1 = new Item(); 
        item1.name = "mocha"; 
        item1.price = 3.25; 

        Item item2 = new Item(); 
        item2.name = "latte"; 
        item2.price = 4.25;
        
        Item item3 = new Item(); 
        item3.name = "drip coffee"; 
        item3.price = 2.00;
        
        Item item4 = new Item(); 
        item4.name = "cappucino"; 
        item4.price = 3.50;
        
        
        Order order1 = new Order(); 
        order1.name = "Cindhuri"; 
        order1.ready = true;
        
        Order order2 = new Order(); 
        order1.name = "Jimmy"; 
        order1.ready = false; 

        Order order3 = new Order(); 
        order1.name = "Noah"; 
        order1.ready = true;

        Order order4 = new Order(); 
        order1.name = "Sam"; 
        order1.ready = true;

        System.out.println(order1);


        // add item1 to order2's item list and increment the order's total 

        order2.items.add(item1);
        order2.total += item1.price;
        System.out.println(order2.total);

        // order3 got a cappucino 
        order3.items.add(item4); 
        order3.total += item4.price; 
        System.out.println(order3.total);

        order4.items.add(item2); 
        order4.total += item4.price; 
        System.out.println(order4.total); 

        order1.ready = false; 
    }
        

}
