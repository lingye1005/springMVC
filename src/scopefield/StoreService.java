package scopefield;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by caoxiaohong on 17/7/27.
 */

@Component
public class StoreService  {
    ShoppingCartProxy cartProxy=new ShoppingCartProxy();

    @Autowired
    public void setShoppingCart(ShoppingCartProxy cart){
        this.cartProxy=cart;
    }
}
