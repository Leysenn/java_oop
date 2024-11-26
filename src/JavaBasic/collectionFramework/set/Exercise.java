package JavaBasic.collectionFramework.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise {
    public static void main(String[] args) {
        Set<String> stringHashSet = new HashSet<>(
                Set.of()
        );
        stringHashSet.add("Tida");
        stringHashSet.add("Tola");
        stringHashSet.add("Bona");
        System.out.println("Insert  your name:");
        String name = new Scanner(System.in).nextLine();
        stringHashSet.stream()
                .filter(e-> e.contains(name))
                .filter(e-> e.equalsIgnoreCase(name))
                .forEach(e-> System.out.println(e));

    }
}
