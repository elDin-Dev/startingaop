package com.sandin.learning.startingaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

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
    @AfterReturning(
            value = "execution(* com.sandin.learning.startingaop.business.*.*(..)))",
            returning = "result"
    )
    public void after(JoinPoint joinPoint, Object result){

        //Advice body code
        logger.info("->{} returned with value {}", joinPoint, result);
    }

    @AfterThrowing(
            value = "execution(* com.sandin.learning.startingaop.business.*.*(..)))",
            throwing = "exc"
    )
    public void throwing(JoinPoint joinPoint, Object exc){
        //Advice body code
        logger.info("->{} throwing exception {}", joinPoint, exc);
    }

    @After(
            value = "execution(* com.sandin.learning.startingaop.business.*.*(..)))"
    )
    public void afterExecution(JoinPoint joinPoint){
        //Advice body code
        logger.info("->after execution of {}", joinPoint);
    }


}
