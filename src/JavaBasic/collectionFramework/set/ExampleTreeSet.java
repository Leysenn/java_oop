package JavaBasic.collectionFramework.set;

import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(-20);
        treeSet.remove(-20);
        System.out.println(treeSet);
    }
}
