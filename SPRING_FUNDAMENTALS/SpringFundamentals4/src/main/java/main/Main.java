package main;

import config.AppConfig;
import controller.DemoController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(AppConfig.class);
        DemoController demoController = c.getBean(DemoController.class);
        demoController.doubleValue(10);
    }
}
