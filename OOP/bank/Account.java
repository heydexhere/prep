package bank;

/*
ABSTRACTION
An abstract class serves as a template. It cannot be instantiated directly (cannot do `new Account()`).

Benefits:
**Code Reuse (Share common behavior)**: Unlike interfaces, abstract classes can have implemented methods 
(like deposit() and getBalance()) and instance variables (balance). This avoids duplicating code in 
SavingsAccount and CurrentAccount.
**Contract Enforcement (Define required behavior)**: By declaring abstract void addInterest(), you force 
every developer who creates a new type of Account to write an addInterest method. They cannot forget 
to implement it, otherwise, their code won't compile.
*/
abstract class Account {

    /*
     * ENCAPSULATION - Hiding data by making fields 'private'.
     * It prevents direct modification (like `savings.balance = -500;`).
     */
    private double balance = 0;

    // ENCAPSULATION (Continued): Providing controlled access via methods.
    void deposit(double amount) {
        balance += amount;
    }

    // ENCAPSULATION (Continued): Getter method allows read-only access to private
    // data.
    public double getBalance() {
        return balance;
    }

    /*
     * ABSTRACTION (Continued): Abstract method. It has no body here;
     * it forces subclasses to provide their own specific implementation of adding
     * interest
     */
    abstract void addInterest();

}