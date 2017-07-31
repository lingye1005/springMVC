package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by caoxiaohong on 17/7/16.
 */
//@Component
public class CDPlayer implements MediaPlayer {


    // 定义一个音乐资源,这里通过@Autowired来声明需要注入CompactDisc的依赖
    @Autowired
    private CompactDisc cd;

    public void play(){
        cd.play();
    }

    public CompactDisc getMusicResource(){
        return cd;
    }

    public CDPlayer (CompactDisc cd){
        this.cd=cd;
    }
}
