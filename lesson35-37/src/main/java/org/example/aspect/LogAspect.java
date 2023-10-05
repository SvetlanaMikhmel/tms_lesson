package org.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    @Pointcut("execution(public void org.example.service.MainService.processRace())")
    public void pointcut1() {
    }

    @After("pointcut1()")
    public void getFinalMessage() {
        System.out.println("Скачки закончились, идите домой");
    }

    @Pointcut("@annotation(org.example.config.Benchmark)")
    public void pointcut2() {
    }

    @Around("pointcut2()")
    public Object process(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.nanoTime();
        Object proceed = proceedingJoinPoint.proceed();
        long end = System.nanoTime();
        String methodName = proceedingJoinPoint.getSignature().getName();
        System.out.println("Bench time for " + methodName + " " + (end - start));
        return proceed;
    }
}
