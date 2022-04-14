package empPackage;

public class Developer extends Employee {
	
	private String project;

	public Developer(String email, double pay, String project) {
		super(email, pay);
		this.project = project;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
	
	
	@Override 
	public void empDetails() {
		super.empDetails();
		System.out.printf("\nDev's Project: %s", this.project);
	
	}
	
	
	

}
