package JavaBasic.array;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        String names []= new String[2];
        for (int i=0;i<names.length;i++){
            System.out.println("[+] Insert name [" + i +"] :");
            names[i] = new Scanner(System.in).nextLine();
        }
        for (int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}
