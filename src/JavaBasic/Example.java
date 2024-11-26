package JavaBasic;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        System.out.print("Insert Your name  :");
        String name  = new Scanner(System.in).next();

        System.out.print("Insert Your day   :");
        int day = new  Scanner(System.in).nextInt();

        System.out.print("Insert your month :");
        int month = new  Scanner(System.in).nextInt();

        System.out.print("Insert Your year  :");
        int year = new  Scanner(System.in).nextInt();

//        System.out.println("This is Your name:"+name);
//        System.out.println("This is Your name:"+day);
//        System.out.println("This is Your name:"+month);
//        System.out.println("This is Your name:"+year);

        System.out.printf("Name: %d,  Day : %d,   Month: %d, Year: %d",name, day, month, year);
    }

}
