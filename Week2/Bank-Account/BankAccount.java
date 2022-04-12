public class BankAccount {
    private double checkings; 
    private double savings; 
    public static int numOfAccts = 0; 
    public static double totalBalance = 0; 

    public BankAccount() {
        this.checkings = 0;
        this.savings = 0;
        BankAccount.numOfAccts += 1; 
    }

    public static int totalAccts(){
        return numOfAccts; 
    }
    public double getCheckingBalance(){
        return this.checkings; 
    }

    public double getSavingBalance(){
        return this.savings; 
    }

    public void deposit(double amount, String account){
        if(account.equals("checkings")){
            this.checkings+=amount; 
        }
        else if(account.equals("savings")){
            this.savings+=amount; 
        }
        BankAccount.totalBalance+=amount; 
        }
    
    public void withdraw(double amount, String account){
        if(account.equals("checkings")){
            if(this.checkings - amount >= 0){
                this.checkings -= amount;  
                BankAccount.totalBalance-=amount;
            }
        else if(account.equals("savings")){
            if(this.savings - amount >= 0){
                this.savings -= amount; 
                BankAccount.totalBalance-=amount; 
            } 
        } 
        else {
            System.out.println("Insufficient Funds.");
        }
        }
    }
    
    public void display() {
		// %.2f formats decimal to the 10s place (like for moniez)
		System.out.println(String.format("Savings: %.2f, Checking: %.2f", this.savings, this.checkings));
    }

}
