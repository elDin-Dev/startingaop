package com.sandin.learning.startingaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodCalculationExecutionAspect {

    private Logger logger = LoggerFactory
            .getLogger(this.getClass());

    // Asppect = pointcut + advice
    // execution(* PACKAGE.*.*(..))
    // interceptará cualquier tipo de retorno
    // en PACKAGE.. (Cualquier subpackage '..')
    // cualquier classe
    // cualquier método
    // si tener en cuenta los parámetros.
    // pointcut: @Before("execution
    //
    // joinPoint la espcífica instancia de lo que interceptamos. el metadata de lo interceptado.
    // el proceso que ejecuta el monitoring de los aspesct sellma weaving & weaber
    @Around(
            value = "CommonJoinPointConfig.trackTimeAnnotation()"
    )
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{

        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        //Advice body code
        logger.info("->Time taken by {} is {} ms", joinPoint, timeTaken);
    }



}
