package BankAccountSimulation;


public class BankSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ram");

        account.deposit(10000);
        account.withdraw(250);
        account.deposit(500);
        account.withdraw(2000); // should fail

        account.printAccountSummary();
    }
}



