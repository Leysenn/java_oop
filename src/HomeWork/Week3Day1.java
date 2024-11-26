package HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Week3Day1 {
    public static void main(String[] args) {
        List<Double> price = new ArrayList<>();
        System.out.println("[+] Insert number of price :");
        int number = new Scanner(System.in).nextInt();
        for (int i=0;i<number;i++){
            System.out.println("Insert price at index :["+ i +" ]");
            price.add(new Scanner(System.in).nextDouble());
        }
        // sort
        Collections.sort(price);
        System.out.println("All price here :" + price);
        System.out.println("[+] Insert index to delete :");
        int index = new Scanner(System.in).nextInt();
        price.remove(index);
        System.out.println("All price here :" + price);

    }
}
