import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercise {
    static private List<String> accountNames = new ArrayList<>();
    static String creditCardNumberGenerator(){
        int bound = 9999;
        int condition= 1000;
        int digit1 = new Random().nextInt(bound);
        int digit2 = new Random().nextInt(bound);
        int digit3 = new Random().nextInt(bound);
        int digit4 = new Random().nextInt(bound);
        while (digit1<condition || digit2<condition || digit3<condition || digit4<condition){
            digit1 = new Random().nextInt(bound);
            digit2 = new Random().nextInt(bound);
            digit3 = new Random().nextInt(bound);
            digit4 = new Random().nextInt(bound);

        }
        return digit1+ "-" + digit2 + "-" + "-" + digit3 + "-"+ digit4;
    }
    static void createBankingAccount(String accountName){
        accountNames.add(accountName);
        System.out.println("=".repeat(40));
        System.out.println("=> Your account :");
        System.out.println("=>" + accountName + "<=");
        String cardNumber = creditCardNumberGenerator();
        accountNames.add(cardNumber);
        System.out.println("[+] Virtual credit card number :" + creditCardNumberGenerator());
    }
    static void updateAccountName(String oldName){
        int index = accountNames.indexOf(oldName);
                if(index>=0){
                    System.out.println("[+] Insert new account name :");;
                    String newName = new Scanner(System.in).nextLine();
                    accountNames.set(index, newName);
                    System.out.println("[+] Account name updated successfully");
                    System.out.println(accountNames);
                }else {
                    System.out.println("[!] No account to update :");
                }
    }
    static void deleteAccountName(String oldName){
        int index = accountNames.indexOf(oldName);
        if (index>=0){
            System.out.print("Insert to delete account :");
            String newName = new Scanner(System.in).nextLine();
            accountNames.remove(index+1);
            accountNames.remove(newName);
            System.out.println("Delete account success");

        }else {
            System.out.println("No account to delete");

        }

    }
    public static void main(String[] args) {
       while (true){
           System.out.println("=".repeat(30));
           System.out.println("""
                   0. Display all account
                   1. Create account 
                   2. Update account
                   3. Delete account 
                   4. Exit 
                   """);
           System.out.println("=".repeat(30));
           System.out.print("Choose option :");
           int number = new Scanner(System.in).nextInt();
           switch (number){
               case 0->{
                   System.out.println(accountNames);
               }
               case 1->{
                   System.out.print("[+] Insert account name :");
                   String name = new Scanner(System.in).nextLine();
                   createBankingAccount(name);
                   break;
               }
               case 2->{
                   System.out.print("[+] Insert name to update:");
                   String oldName= new Scanner(System.in).nextLine();
                   updateAccountName(oldName);
                   break;
               }
               case 3->{
                   System.out.print("Insert account name to delete: ");
                   String newName= new Scanner(System.in).nextLine();
                   deleteAccountName(newName);
                   


               }
               case 4->{
                   System.out.println("Bye Bye .............");
                   System.exit(0);


               }

           }
       }


    }
}
