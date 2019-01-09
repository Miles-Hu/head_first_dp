package test1.a7facade;

import org.junit.Test;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-6 下午12:49
 */
public class TestDriver {

    @Test
    public void watchMovieWithoutFacade() {
        Light light = new Light();
        TV tv = new TV();
        Stereo stereo = new Stereo();
        CDPlayer player = new CDPlayer();

        light.on();
        light.dim();
        tv.on();
        stereo.on();
        stereo.setVolume();
        player.on();
        player.putCD();
        player.play();

        player.off();
        stereo.off();
        tv.off();
        light.off();
    }

    @Test
    public void watchMovieWithFacade() {
        MovieFacade movieFacade = new MovieFacade(new CDPlayer(), new Light(), new Stereo(), new TV());
        movieFacade.watchMovie();
        movieFacade.offMovie();
    }

}
