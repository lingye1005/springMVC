package scopefield;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by caoxiaohong on 17/7/27.
 */

@Component
@Scope(value= WebApplicationContext.SCOPE_SESSION,proxyMode = ScopedProxyMode.INTERFACES)
public class ShoppingCartImp implements ShoppingCart {
    @Override
    public int getProductsNum(){
        return 10;
    }

    @Override
    public String getProductName(){
        return "bananna";
    }

   @Override
    public String getUserName(){
        return "lingye";
    }
}
