package ambiguousSolution;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by caoxiaohong on 17/7/26.
 */
@Component
@Qualifier("crick")
public class Cookies implements Dessert {
}
