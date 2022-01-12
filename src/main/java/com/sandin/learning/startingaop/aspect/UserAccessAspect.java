package com.sandin.learning.startingaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {

    private Logger logger = LoggerFactory
            .getLogger(this.getClass());

    // Pattern:
    // execution(* PACKAGE.*.*(..))
    // interceptará cualquier tipo de retorno
    // en PACKAGE
    // cualquier classe
    // cualquier método
    // si tener en cuenta los parámetros.
    @Before("execution(* com.sandin.learning.startingaop.business.*.*(..)))")
    public void before(JoinPoint joinPoint){

        logger.info("Check for user access.");
        logger.info("->Allowed execution for: {}",joinPoint);
    }

}
