package classwork;

public class CreditCardAccount implements Account{
    private Double showDeposit = 0.0;
    @Override
    public void withdraw(Double amountOfCash) {
        if (amountOfCash<0){
            System.out.println("Amount of cash be greater than 0");
            return;
        }else if (amountOfCash>showDeposit){
            System.out.println("The account balance is not enough");
            return;
        }
        showDeposit = showDeposit-amountOfCash;
        System.out.println("You have withdraw " + amountOfCash +"$ to your saving account.");
    }

    @Override
    public void deposit(Double amountOfCash) {
        if (amountOfCash<0){
            System.out.println("Amount of Cash must be greater than 0");
            return;
        }else {
            showDeposit = showDeposit+amountOfCash;
            System.out.println("You have been deposited " + amountOfCash + "$ to your saving account");
        }

    }

    @Override
    public void showBalance() {
        System.out.println("Your saving account balance " + showDeposit + "$");

    }
}
