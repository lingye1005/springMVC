package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by caoxiaohong on 17/7/15.
 * 显示开启spring组件扫描
 */
@Configuration
//@ComponentScan
@Import(CDConfig.class)
public class CDPlayerConfig {
    @Bean
    public CDPlayer cdPlayer(CompactDisc cd){
        return new CDPlayer(cd);
    }
}
