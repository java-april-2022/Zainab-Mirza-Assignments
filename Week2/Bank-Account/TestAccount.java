public class TestAccount {
    public static void main(String[] args) {
        BankAccount zainab = new BankAccount(); 

        zainab.deposit(120.00, "checkings");
        zainab.deposit(325.50, "checkings"); 
        zainab.deposit(400.00, "savings"); 
        zainab.deposit(300.00, "savings"); 

        zainab.display(); 

        zainab.withdraw(1000, "checkings");
    }
}
