package org.example;

import org.example.config.AppConfig;
import org.example.controllers.ProductController;
import org.example.service.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductController p = c.getBean(ProductController.class);
    }
}