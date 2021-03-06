package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by caoxiaohong on 17/7/15.
 */
//@Component
public class SgtPeppers implements CompactDisc {
    private String title="Sgt. Pepper`s Lonely Hearts Club Band";
    private String artist="The Beatles";

    public void play(){
        System.out.println("Playing "+title+" by "+artist);
    }

    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }
}
