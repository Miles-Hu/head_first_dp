package headfirst.designpatterns.brideg;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-9 下午6:06
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
