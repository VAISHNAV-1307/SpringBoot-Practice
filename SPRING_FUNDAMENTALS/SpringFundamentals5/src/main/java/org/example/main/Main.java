package org.example.main;

import org.example.config.AppConfig;
import org.example.controller.ProductController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(AppConfig.class);

        var p1 = c.getBean(ProductController.class);
        var p2 = c.getBean(ProductController.class);
        var p3 = c.getBean(ProductController.class);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


    }
}