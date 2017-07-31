package scopefield;

import org.springframework.stereotype.Component;

/**
 * Created by caoxiaohong on 17/7/27.
 */
@Component
public class ShoppingCartProxy implements ShoppingCart {
    ShoppingCartImp cart=new ShoppingCartImp();

    @Override
    public int getProductsNum(){
        return cart.getProductsNum();
    }
    @Override
    public String getProductName(){
        return cart.getProductName();
    }
    @Override
    public String getUserName(){
        return cart.getUserName();
    }
}
