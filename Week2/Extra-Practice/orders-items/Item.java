public class Item {
    private String name; 
    private double price; 

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getNameOfItem() {
        return name; 
    }

    public void setNameOfItem(){
        this.name = name; 
    }

    public double getPriceOfItem(){
        return price; 
    }

    public void setPriceOfItem(){
        this.price = price; 
    }
    
}
