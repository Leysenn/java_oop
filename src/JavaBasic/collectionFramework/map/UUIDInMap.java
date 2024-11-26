package JavaBasic.collectionFramework.map;

import java.util.HashMap;
import java.util.UUID;

public class UUIDInMap {
    public static void main(String[] args) {
        HashMap<String, String> usernames = new HashMap<>();
        usernames.put(UUID.randomUUID().toString(),"Dara");
        usernames.put(UUID.randomUUID().toString(),"Tola");
        System.out.println(usernames);
    }
}
