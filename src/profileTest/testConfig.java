package profileTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by caoxiaohong on 17/7/26.
 * 测试类:通过profile创建的bean是否成功
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DataSourceConfig.class)
@ActiveProfiles("dev")
public class testConfig {

    @Autowired
    String ds;

    @Test
    public void devShouldNotBeNull(){
        assertNotNull(ds);
    }
}
