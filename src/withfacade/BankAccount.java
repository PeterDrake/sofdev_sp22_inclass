package withfacade;

public class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void reduceBy(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
