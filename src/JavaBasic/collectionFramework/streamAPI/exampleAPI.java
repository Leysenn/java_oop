package JavaBasic.collectionFramework.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class exampleAPI {
    public static void main(String[] args) {
        List<Integer> studentAges = new ArrayList<>(
                List.of(15,16,17,18,19,20,20));
//        System.out.println("[+] Insert Age to search :");
//        Integer age = new Scanner(System.in).nextInt();
        studentAges.stream()
                .filter(e->e>=18)
                .distinct()
                .forEach(e-> System.out.println(e));
    }
}
