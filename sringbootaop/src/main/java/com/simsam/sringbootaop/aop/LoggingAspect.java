package com.simsam.sringbootaop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    // return type-class name.method name(args)

//    @Before("execution(* *.*(..)")
//    public void logMethodCall(){
//        LOGGER.info("Method called");
//    }

    @Before("execution (* com.simsam.sringbootaop.service.JobService.getJob(..)) || execution(* com.telusko.springbootrest.service.JobService.updateJob(..))")
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info("Method Called "+jp.getSignature().getName());
    }
    @After("execution (* com.simsam.sringbootaop.service.JobService.getJob(..)) || execution(* com.simsam.sringbootaop.service.JobService.updateJob(..))")
    public void logMethodExecuted(JoinPoint jp) {
        LOGGER.info("Method Executed "+jp.getSignature().getName());
    }
    @AfterThrowing("execution (* com.simsam.sringbootaop.service.JobService.getJob(..)) || execution(* com.simsam.sringbootaop.service.JobService.updateJob(..))")
    public void logMethodCrashed(JoinPoint jp) {
        LOGGER.info("Method has some issues "+jp.getSignature().getName());
    }
    @AfterReturning("execution (* com.simsam.sringbootaop.service.JobService.getJob(..)) || execution(* com.simsam.sringbootaop.service.JobService.updateJob(..))")
    public void logMethodExecutedSuccess(JoinPoint jp) {
        LOGGER.info("Method Executed Successfully "+jp.getSignature().getName());
    }
}
