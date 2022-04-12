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
            return "Your Order is Ready.";
        } 
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal(){
        int sum = 0;
        for(int i =0; i < this.items.size(); i++){
            sum += this.items.get(i).getPriceOfItem(); 
        }
        return sum; 
    }

    public void display(){
        System.out.printf("Customer name: %s\n", this.name); 
        for(int i =0; i<this.items.size(); i++){
            System.out.printf("%s -- %s\n", this.items.get(i).getNameOfItem(), this.items.get(i).getPriceOfItem()); 
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }
}


