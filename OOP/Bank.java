public class Bank {
    public static void main(String[] args) {

        /*
         * Account - Reference Type - compiler sees this
         * SavingsAccount - Object Type - JVMexecutes at runtime
         */
        Account savings = new SavingsAccount();
        Account current = new CurrentAccount();

        savings.deposit(100);
        current.deposit(100);

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
