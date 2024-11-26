//package HomeWork;
//
//
//
//import java.util.*;
//
//
//
//class Product{
//    int id;
//    String name;
//    String category;
//    double price;
//
//    List<String> objects  =new ArrayList<>(
//            List.of("SmartPhone" , "Laptop"));
//    List<Product> products = new ArrayList<>();
//
//    @Override
//    public String toString() {
//        return "Input  ID of Teacher:" + id + '\n' +
//                "Input  Name  of Teacher:" + name + '\n' +
//                "Input  Gender of Teacher:" + category + '\n' +
//                "Input Your Subject " + objects+ '\n' +
//                "Type of Product:" + products
//                ;
//    }
//    public class Week4 {
//
//    public static void main(String[] args) {
//
//        Product product = new Product();
//        product.id = new Random(9999).nextInt();
//        System.out.print("Insert name of product:");
//        product.name = new Scanner(System.in).next();
//        System.out.print("Product of category:");
//        product.category= new Scanner(System.in).next();
//        System.out.print("Total of price :");
//        product.price=new Scanner(System.in).nextDouble();
//        System.out.println("=".repeat(30));
//        System.out.println(product);
//
//
//
//    }
//}
//}
