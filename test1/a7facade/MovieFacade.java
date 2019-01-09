package test1.a7facade;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-6 下午12:46
 */
public class MovieFacade {

    CDPlayer player;
    Light light;
    Stereo stereo;
    TV tv;

    public MovieFacade(CDPlayer player, Light light, Stereo stereo, TV tv) {
        this.player = player;
        this.light = light;
        this.stereo = stereo;
        this.tv = tv;
    }

    public void watchMovie() {
        light.on();
        light.dim();
        tv.on();
        stereo.on();
        stereo.setVolume();
        player.on();
        player.putCD();
        player.play();
    }

    public void offMovie() {
        player.off();
        stereo.off();
        tv.off();
        light.off();
    }
}
