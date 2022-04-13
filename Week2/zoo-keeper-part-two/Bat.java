public class Bat extends Mammal {
    private int energy = 300; 


    public Bat(){
        this.energy = 300; 
    }

    public void fly(){
        this.energy -= 50; 
        System.out.println("Wooossssssh"); 
    }

    public void eatHumans(){
        this.energy += 25;
    }
    
    public void attackTown(){
        this.energy -= 100; 
        System.out.println("Ahhhh, doossssh. Plunk."); 
    }

    public void displayEnergy(){
        System.out.printf("Energy Level: %s", this.energy);
    }
}
