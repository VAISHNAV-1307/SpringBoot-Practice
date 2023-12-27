package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAspects {
//    @Before("execution(* controller.DemoController.doubleValue(..))")
//    public void before() {
//        System.out.println("It is the double of your value");
//    }

//    @After("execution(* controller.DemoController.doubleValue(..))")
//    public void before() {
//        System.out.println("It is the double of your value");
//    }

    @Around("execution(* controller.DemoController.doubleValue(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before the method");  // (@Before) So it will be printed before the execution of called method
        pjp.proceed();
        System.out.println("after the method");  // (@After) So it will be printed after the execution of called method
    }
}
