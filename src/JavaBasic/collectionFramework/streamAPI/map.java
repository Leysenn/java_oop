package JavaBasic.collectionFramework.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class map {
    public static void main(String[] args) {
        List<String > studentNames = new ArrayList<>(List.of("Dara", "Bora","Tida"));
        System.out.println("[+] Insert Name to search :");
        String name = new Scanner(System.in).nextLine();
        studentNames.stream()
                .map(e->e.toUpperCase())
                .forEach(e-> System.out.println(e));
    }
}
