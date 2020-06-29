public class BankAccount {

    private int balance;

    public BankAccount() {
    }

    public void open() {
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {

        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
    }

    public void close() {
    }
}
