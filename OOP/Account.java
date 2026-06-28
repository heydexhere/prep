abstract class Account {
    private double balance = 0;

    void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    abstract void addInterest();

}