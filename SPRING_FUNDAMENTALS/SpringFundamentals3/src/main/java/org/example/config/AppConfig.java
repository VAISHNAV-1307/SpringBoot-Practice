package org.example.config;

import org.example.controllers.ProductController;
import org.example.service.ProductService;
import org.example.service.serviceImpl.AmazonProductService;
import org.example.service.serviceImpl.FlipcartProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ProductController productController(){
        return new ProductController();
    }

    @Bean
    @Qualifier("amazon")
    public AmazonProductService amazonProductService() {
        return new AmazonProductService();
    }

    @Bean
    @Qualifier("flipcart")
    public FlipcartProductService flipcartProductService() {
        return new FlipcartProductService();
    }
}
