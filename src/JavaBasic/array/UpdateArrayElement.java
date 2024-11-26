package JavaBasic.array;

import java.util.Arrays;
import java.util.Scanner;

public class UpdateArrayElement {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        for (int i=0;i<numbers.length;i++){
            System.out.println("[+] Insert number :");
            numbers[i] = new Scanner(System.in).nextInt();
        }
        while (true){
            System.out.println(Arrays.toString(numbers));
            System.out.println("[+] Insert element position to update :");

            int index= new Scanner(System.in).nextInt();
            if (index<0 || index>numbers.length){
                System.out.println("[+] Invalid index");
            }else {
                System.out.println("[+] Insert value to update on element at index - " + index + ": ");
                int newNumber = new Scanner(System.in).nextInt();
                numbers[index] =  newNumber;
                System.out.println("=".repeat(20));
                System.out.println("New Array update : \n" + Arrays.toString(numbers));
            }
        }
    }
}
