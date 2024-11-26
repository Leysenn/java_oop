package HomeWork;

import java.util.Scanner;

public class Week1Day1 {
    public static void main(String[] args) {
        System.out.print("Insert Your ProductCode    :");
        String productCode = new Scanner(System.in).next();

        System.out.print("Insert Your ProductName    :");
        String productName = new Scanner(System.in).next();

        System.out.print("Insert Your ProductQuantity:");
        int productQuantity = new  Scanner(System.in).nextInt();

        System.out.print("Insert Your Price  :");
        double productPrice = new Scanner(System.in).nextDouble();

        System.out.println("\n--- Product Information ---");
        System.out.println("Product Code: " + productCode);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Quantity: " + productQuantity);
        System.out.println("Product Price per one: $" + productPrice);
        System.out.println("Total Price: $" + (productPrice * productQuantity));
        System.out.println("\n--- Product Information ---");


    }
}
