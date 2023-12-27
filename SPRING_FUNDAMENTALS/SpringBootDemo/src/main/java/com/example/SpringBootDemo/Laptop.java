package com.example.SpringBootDemo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private Integer lid;
    private String brand;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void compile() {
        System.out.println("Compiling");
    }
}
