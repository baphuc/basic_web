package com.example.demo.controller;

import com.example.demo.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/products")
    public String getProducts(Model model) {
        // 1. Mocking a list of products (In a real app, this comes from a database/service)
        List<Product> productList = Arrays.asList(
                new Product(1L, "Laptop", 999.99),
                new Product(2L, "Smartphone", 699.99),
                new Product(3L, "Wireless Headphones", 149.99)
        );

        // 2. Add the list to the UI model framework
        model.addAttribute("products", productList);

        // 3. Return the name of the Thymeleaf HTML template file (product-list.html)
        return "product-list";
    }
}
