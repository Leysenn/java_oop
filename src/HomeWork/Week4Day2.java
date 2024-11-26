package HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Product {
    int id;
    String name;
    String category;
    double price;

    List<String> objects = new ArrayList<>(
            List.of("Iphone", "Asus","Dell","Lenovo","Mac"));
    List<Product> products = new ArrayList<>();

    @Override
    public String toString() {
        return "ID of Product:" + id + '\n' +
                " Name  of Product:" + name + '\n' +
                "Category of Product:" + category + '\n' +
                "Object of Product: " + objects + '\n' + products;
    }
}

    public class Week4Day2 {

    public static void main(String[] args) {
        Product product = new Product();
        product.id = new Random(9999).nextInt();
        System.out.print("Insert name of product:");
        product.name = new Scanner(System.in).next();
        System.out.print("Product of category:");
        product.category= new Scanner(System.in).next();
        System.out.print("Total of price :");
        product.price=new Scanner(System.in).nextDouble();
        System.out.println("=".repeat(30));
        System.out.println(product);


    }
}
