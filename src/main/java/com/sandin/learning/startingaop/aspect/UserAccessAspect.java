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
    @Before("execution(* com.sandin.learning.startingaop..*.*(..)))")
    public void before(JoinPoint joinPoint){

        //Advice body code
        logger.info("Check for user access.");
        logger.info("->Allowed execution for: {}",joinPoint);
    }

}
