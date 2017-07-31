package conditionalTest;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * Created by caoxiaohong on 17/7/26.
 */
@Component("secondBean")
@Conditional(ConditionsExists.class)
public class ConditionalBean  {

}
