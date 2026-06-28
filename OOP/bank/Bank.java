package bank;

public class Bank {
    public static void main(String[] args) {

        /*
         * POLYMORPHISM (Upcasting):
         * - Reference Type (Account) determines what methods the compiler lets you
         * call.
         * - Object Type (SavingsAccount) determines what version runs at runtime.
         */
        Account savings = new SavingsAccount();
        Account current = new CurrentAccount();

        savings.deposit(100);
        current.deposit(100);

        /*
         * POLYMORPHISM (Runtime/Dynamic Polymorphism):
         * Even though both variables are of type 'Account', the JVM automatically runs
         * SavingsAccount's addInterest() for the first, and CurrentAccount's for the
         * second.
         */
        savings.addInterest();
        current.addInterest();

        /*
         * While compiling the code; compiler checks that getBalance is present in
         * Account hence compiles
         * savings.getInterestAmount() will throw compile time error
         */
        System.out.println("Savings account balance " + savings.getBalance());
        System.out.println("Current account balance " + current.getBalance());

        /*
         * SavingsAccount is the Reference Type hance getInterestAmount() function is
         * visible
         */
        SavingsAccount savingsAccount = new SavingsAccount();
        System.out.println("savings account interest amount " + savingsAccount.getInterestAmount());

    }
}
