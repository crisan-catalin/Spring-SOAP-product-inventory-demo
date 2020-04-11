package com.example.demo.repository;

import com.example.demo.ws.Currency;
import com.example.demo.ws.Product;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.*;

@Component
public class ProductRepository {

    private static final List<Product> products = new ArrayList<>();

    @PostConstruct
    public void initData() {
        try {
            Product p1 = new Product();
            p1.setCode("IP-0008");
            p1.setName("iPhone 8");
            p1.setBase64Image("data:image/jpeg;base64," + Base64.getEncoder().encodeToString(IOUtils.toByteArray(getClass().getResource("/assets/iphone8.jpg"))));
            p1.setStock(10);
            p1.setPrice(1000);
            p1.setCurrency(Currency.EUR);
            p1.setDescription("The selfies are now next level.");

            Product p2 = new Product();
            p2.setCode("IP-000X");
            p2.setName("iPhone X");
            p2.setBase64Image("data:image/jpeg;base64," + Base64.getEncoder().encodeToString(IOUtils.toByteArray(getClass().getResource("/assets/iphonex.jpg"))));
            p2.setStock(40);
            p2.setPrice(2000);
            p2.setCurrency(Currency.EUR);
            p2.setDescription("The selfies are now next level.");

            Product p3 = new Product();
            p3.setCode("SM-00010");
            p3.setName("Samsung Galaxy S10");
            p3.setBase64Image("data:image/png;base64," + Base64.getEncoder().encodeToString(IOUtils.toByteArray(getClass().getResource("/assets/samsung_s10.png"))));
            p3.setStock(50);
            p3.setPrice(1700);
            p3.setCurrency(Currency.EUR);
            p3.setDescription("Better performances than iPhone anyway.");

            products.addAll(Arrays.asList(p1, p2, p3));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error while trying to read the file.");
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public boolean removeProduct(String code) {
        Optional<Product> product = products.stream()
                .filter(p -> code.equals(p.getCode()))
                .findFirst();
        if (product.isPresent()) {
            products.remove(product.get());
            return true;
        }
        return false;
    }

    public boolean updateProduct(Product productUpdated) {
        if (productUpdated.getCode() == null) {
            return false;
        }

        Optional<Product> product = products.stream()
                .filter(p -> productUpdated.getCode().equals(p.getCode()))
                .findFirst();
        if (product.isPresent()) {
            Product productToUpdate = product.get();
            productToUpdate.setName(productUpdated.getName());
            productToUpdate.setDescription(productUpdated.getDescription());
            productToUpdate.setStock(productUpdated.getStock());
            productToUpdate.setPrice(productUpdated.getPrice());
            productToUpdate.setCurrency(productUpdated.getCurrency());
            return true;
        }

        return false;
    }
}
