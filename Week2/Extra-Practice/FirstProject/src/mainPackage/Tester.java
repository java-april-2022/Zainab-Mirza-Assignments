package mainPackage;
import empPackage.Employee;
import empPackage.Developer;

public class Tester {

	public static void main(String[] args) {
		System.out.println("Hello");
		Employee zainab= new Employee("zainah@dojotech", 250000); 
		zainab.empDetails();
		
		Developer sarah= new Developer("sarah@dojotech", 250000, "World Hunger"); 
		sarah.empDetails(); 

	}

}

