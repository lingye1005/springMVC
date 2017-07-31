package conditionalTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by caoxiaohong on 17/7/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ScanConfig.class)
public class TestConfig {
    @Autowired
    BaseBean first;
    @Autowired
    ConditionalBean second;

    @Test
    public void shouldNotNull(){
        assertNotNull(first);
        assertNotNull(second);
    }
}
