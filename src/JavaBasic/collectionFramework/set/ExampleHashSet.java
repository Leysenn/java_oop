package JavaBasic.collectionFramework.set;

import java.util.HashSet;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String[] args) {
        Set<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(3);
        integerHashSet.add(3);

        System.out.println(integerHashSet);

    }
}
