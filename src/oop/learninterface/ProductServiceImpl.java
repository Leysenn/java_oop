package oop.learninterface;

public class ProductServiceImpl implements ProductService {

    @Override
    public void getProductById(Integer id) {
        System.out.println("This is product ID:"+id);
    }

    @Override
    public void listAllProducts() {
        System.out.println("These are all product");
    }
}
