package JavaBasic.collectionFramework.list.Vector.vector;

import java.util.Scanner;
import java.util.Vector;

public class Exercise {
    public static void main(String[] args) {
        Vector<String> account = new Vector<>();
        System.out.print("[+] Insert number of account :");
        int number = new Scanner(System.in).nextInt();
        for (int i=0;i<number;i++){
            System.out.print("Insert  account at index["+i+"]");
            account.add(new Scanner(System.in).nextLine());

        }
        System.out.println("All account here :"+account);
        //remove for ignoring case
        System.out.println("Insert account name to delete :");
        String  name = new Scanner(System.in).nextLine();
       for (String n : account){
           if(n.equalsIgnoreCase(name)){
              account.remove(n);
           }
       }
        System.out.println("Account after delete :"+account);
    }
}
