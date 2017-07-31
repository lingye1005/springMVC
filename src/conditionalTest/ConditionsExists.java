package conditionalTest;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;


/**
 * Created by caoxiaohong on 17/7/26.
 * 条件:是否创建bean
 */
public class ConditionsExists implements Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata){
//        Environment env=context.getEnvironment();
//        return env.containsProperty("dev");
        return true;
    }
}
