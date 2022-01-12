package com.sandin.learning.startingaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.sandin.learning.startingaop.data.*.*(..)))")
    public void dataLayerExecution(){}

    @Pointcut("execution(* com.sandin.learning.startingaop.business.*.*(..)))")
    public void businessLayerExecution(){}

}
