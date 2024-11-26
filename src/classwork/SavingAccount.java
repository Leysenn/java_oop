package classwork;

public class SavingAccount implements Account{
    private  Double balance = 0.0;
    @Override
    public void withdraw(Double amountOfCash) {
        if (amountOfCash<0){
            System.out.println("Show Amount of Cash");
        }else if (amountOfCash>balance){
            System.out.println("The account deposit is not enough");
            return;
        }
        balance = balance-amountOfCash;
        System.out.println("You have deposit" + amountOfCash +"$ to your saving account");

    }

    @Override
    public void deposit(Double amountOfCash) {
        if (amountOfCash<0){
            System.out.println("Show Amount of Cash");
            return;
        }else {
            balance = balance + amountOfCash;
            System.out.println("You have been deposited "+ amountOfCash + "$ to your saving account");
        }

    }

    @Override
    public void showBalance() {
        System.out.println("Your saving account balance " + balance + "$");

    }
}
