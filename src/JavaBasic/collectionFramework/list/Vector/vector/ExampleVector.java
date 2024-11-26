package JavaBasic.collectionFramework.list.Vector.vector;

import java.util.Vector;

public class ExampleVector {
    public static void main(String[] args) {
        Vector<String > names = new Vector<>();
        names.add("Bona");
        names.add("Tola");
        names.add("Bora");
        System.out.println(names);
        names.remove("Tola");
        System.out.println(names);
        names.set(0,"Dara");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.capacity());
    }
}
