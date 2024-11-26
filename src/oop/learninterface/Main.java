package oop.learninterface;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl();
        productService.getProductById(1);
        productService.listAllProducts();
    }


}
