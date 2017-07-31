package ambiguousSolution;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by caoxiaohong on 17/7/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ComponentScanConfig.class)
public class TestConfig {
    Dessert dessert;
    @Autowired
    @Cold
    public void getDessert(Dessert dessert){
        this.dessert=dessert;
    }
    @Test
    public void notBeNull(){
        assertNotNull(dessert);
    }
}
