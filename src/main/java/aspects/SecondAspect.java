package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class SecondAspect {
    @Pointcut("execution(* test.Application.mainggg(..))")
    public void pc1() {}

//    @After("pc1()")
//    public void after() {
//        System.out.println("After");
//    }
//
//    @Before("pc1()")
//    public void before() {
//        System.out.println("before");
//    }

    @Around("pc1()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("After");
        joinPoint.proceed();
        System.out.println("before");
    }
}
