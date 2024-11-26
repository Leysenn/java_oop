package classwork;

public class Main {
    public static void main(String[] args) {
//        Account savingAccount = new SavingAccount();
        Account creditAccount = new CreditCardAccount();
        creditAccount.deposit(100.0);
        creditAccount.withdraw(10.0);
        creditAccount.showBalance();

    }
}
