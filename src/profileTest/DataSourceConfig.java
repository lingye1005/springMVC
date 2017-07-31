package profileTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.activation.DataSource;

/**
 * Created by caoxiaohong on 17/7/26.
 * 定义两个bean,等待通过profile创建
 */
@Configuration
public class DataSourceConfig {

    @Bean
    @Profile("dev")
    public String jndiDataSource(){
        return "cxh";
    }
}
