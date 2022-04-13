public class Gorilla extends Mammal {
    public void throwSomething(){
		this.energyLevel -= 5; 
		System.out.println("Your energy level just went down 5 points. Stop throwing things."); 
	}
	
	public void eatBananas() {
		this.energyLevel += 10; 
		System.out.println("Yum. Just gained 10 energy level points."); 
	}
	
	public void climb() {
		this.energyLevel -= 10; 
		System.out.println("Lost 10 point for all the climbing!"); 
	}
}
