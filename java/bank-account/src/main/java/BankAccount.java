public class BankAccount {

    private int balance;
    private boolean isOpen;

    public BankAccount() {
    }

    public void open() {
        isOpen = true;
        balance = 0;
    }

    public int getBalance() throws BankAccountActionInvalidException {

        if (!isOpen) { throw new BankAccountActionInvalidException("Account closed"); }
        return balance;
    }

    public synchronized void deposit(int amount) throws BankAccountActionInvalidException {

        if (!isOpen)    { throw new BankAccountActionInvalidException("Account closed"); }
        if (amount < 0) { throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount"); }

        balance += amount;
    }

    public synchronized void withdraw(int amount) throws BankAccountActionInvalidException {

        if (!isOpen)           { throw new BankAccountActionInvalidException("Account closed"); }
        if (balance == 0)      { throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account"); }
        if (amount > balance ) { throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account"); }
        if (amount < 0)        { throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount"); }

        balance -= amount;
    }

    public synchronized void close() {
        isOpen = false;
    }
}
