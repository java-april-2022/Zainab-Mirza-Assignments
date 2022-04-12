import java.util.ArrayList; 

public class Order {
    private String name; 
    private boolean ready; 
    private ArrayList<Item> items = new ArrayList<Item>();; 

    // constructor
    public Order(){
        this.name = "Guest";
        this.ready = false;
    }
    // overloaded constructor that takes name as an argument 
    public Order(String name){
        this.name = name; 
        this.ready = false; 
    }

    // getters and setters 
    public String getOrderName(){
        return this.name; 
    }

    public void setOrderName(){
        this.name = name; 
    }

    public boolean getOrderStatus(){
        return this.ready; 
    }

    public void setOrderStatus(){
        this.ready = ready; 
    }

    public ArrayList<Item> getItems(){
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items; 
    }

    // methods 
    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage(){
        if (this.ready == true){
            System.out.println("Your Order is Ready.");
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal(){
        double total = 0.0;
        for(Item i: this.items){
            total += i.PriceOfItem(); 
        }
        return total; 
    }

    public void display(){
        System.out.printf("Customer name: %s", this.name); 
        for(Item item: this.items){
            System.out.println(i.getNameOfItem() + " - $" + i.PriceOfItem()); 
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }

}

