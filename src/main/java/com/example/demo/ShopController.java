package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ShopController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products")
    List<Product> getAllProducts() {
        return List.of(Product.builder()
                .id(1L)
                .name("jakis")
                .price(BigDecimal.TEN)
                .build());
    }

    @PostMapping("/product")
    void saveProduct(Product product) {
        productRepository.save(product);
    }
}
