public class SavingsAccount extends Account {
    void addInterest() {
        deposit(20);
    }

    /*
     * Overriding getBalance is illogical; just writing this for understanding
     * concepts
     * Like compile time and runtime executions
     * Also super keyword - otherwise local getBalance will form an infinite loop
     */
    @Override // Writing overrride is optional here
    public double getBalance() {
        System.out.println("Inside SavingsAccount class");
        return super.getBalance();
    }

    public double getInterestAmount() {
        return 20;
    }
}