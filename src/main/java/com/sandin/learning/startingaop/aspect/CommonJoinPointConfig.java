package com.sandin.learning.startingaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.sandin.learning.startingaop.data.*.*(..)))")
    public void dataLayerExecution(){}

    @Pointcut("execution(* com.sandin.learning.startingaop.business.*.*(..)))")
    public void businessLayerExecution(){}

    @Pointcut("com.sandin.learning.startingaop.aspect.CommonJoinPointConfig.dataLayerExecution() && com.sandin.learning.startingaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void allLayerExecution(){}

    @Pointcut("bean(*Dao*)")
    public void beanContainsDao(){}
}
