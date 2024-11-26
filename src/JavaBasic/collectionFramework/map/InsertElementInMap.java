package JavaBasic.collectionFramework.map;

import java.util.HashMap;
import java.util.Scanner;

public class InsertElementInMap {
    public static void main(String[] args) {
        HashMap<Integer, String > usernames = new HashMap<>();
        System.out.println("[+] Insert number of name:");
        int n = new Scanner(System.in).nextInt();
        for (int i=0;i<n;i++){
            System.out.println("[+] Insert key for username:");
            int key = new Scanner(System.in).nextInt();
            System.out.println("[+] Insert username:");
            String name = new Scanner(System.in).nextLine();
            usernames.put(key,name);
        }
        System.out.println(usernames);
    }
}
