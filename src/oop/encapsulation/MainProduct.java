package oop.encapsulation;

import java.time.LocalDateTime;
import java.util.UUID;

public class MainProduct {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setUuid(UUID.randomUUID().toString());
        product.setProductName("Coca");
        product.setPrice(2.2);
        product.setImage("https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Coca_Cola_Flasche_-_Original_Taste.jpg/800px-Coca_Cola_Flasche_-_Original_Taste.jpg");
        product.setDescription("");
        product.setReleasedDate(LocalDateTime.now());
        product.setExpiredDate(LocalDateTime.of(2026,11,8,2,2));
        product.setNew(true);
        product.setDeleted(false);
        product.setIncludedVat(true);
        System.out.println(product);

    }
}
