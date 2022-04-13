public class Mammal {
	protected int energyLevel = 100; 
	
	
	public int getEnergyLevel() {
		return energyLevel;
	}


	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}


	public void displayEnergy() {
		System.out.printf("Energy Level: %s", this.energyLevel); 
		return;  
	}
}
