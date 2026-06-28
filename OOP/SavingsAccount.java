//INHERITANCE: 'extends' allows SavingsAccount to reuse fields and methods from Account.
public class SavingsAccount extends Account {

    /*
     * POLYMORPHISM (Method Overriding): Implementing the abstract method from the
     * parent.
     */
    void addInterest() {
        deposit(20);
    }

    /*
     * POLYMORPHISM (Method Overriding): Modifying the parent's getBalance behavior.
     *
     * Overriding getBalance is illogical; just writing this for understanding
     * concepts like compile time and runtime executions and super keyword
     */
    @Override // Writing overrride is optional here
    public double getBalance() {
        System.out.println("Inside SavingsAccount class");
        // 'super' refers to the parent class object, bypassing the local override.
        return super.getBalance();
    }

    public double getInterestAmount() {
        return 20;
    }
}