package JavaBasic.collectionFramework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExampleMap {
    public static void main(String[] args) {
        HashMap<Integer, String > username = new HashMap<>();
        username.put(1,"Dara");
        username.put(2,"Tida");
        System.out.println("All element in HashMap:");
        for (Map.Entry<Integer, String > map: username.entrySet()){
            System.out.println(map.getKey() + "." + map.getValue());
        }
        System.out.println("[+] Insert key to delete:");
        int key = new Scanner(System.in).nextInt();
        username.remove(key);
        System.out.println("ALl elements after deleted in HashMap:");
        System.out.println(username);

    }
}
