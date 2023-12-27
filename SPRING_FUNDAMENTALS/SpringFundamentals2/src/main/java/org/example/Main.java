package org.example;

import org.example.config.AppConfig;
import org.example.controllers.ProductController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        var c = context.getBean(ProductController.class);
        c.addProduct();
    }
}