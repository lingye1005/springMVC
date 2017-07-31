package soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by caoxiaohong on 17/7/20.
 */
@Configuration
@Import({CDPlayerConfig.class,CDConfig.class})
public class SoundSystemConfig {

}
