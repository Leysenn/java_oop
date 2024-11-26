package JavaBasic.collectionFramework.list.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
       // arrayList.add(1,4); // add by using index
        for (Integer n :arrayList) {
            System.out.println(n);
        }
        arrayList.set(2,10); // update by using index
        for (Integer n : arrayList){
            System.out.println(n);
        }

        arrayList.remove(2); //remove by using index
        //arrayList.addLast(10);
        //arrayList.addFirst(30);
        System.out.println("Old element ");
        arrayList.forEach(e-> System.out.println(e));
        //arrayList.clear();
        System.out.println("New element");
        arrayList.forEach(e-> System.out.println(e));
    }
}
