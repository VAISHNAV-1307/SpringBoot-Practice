package controller;

import org.springframework.stereotype.Component;

@Component
public class DemoController {
    public void doubleValue(int x) {
        System.out.println(2 * x);
    }
}
