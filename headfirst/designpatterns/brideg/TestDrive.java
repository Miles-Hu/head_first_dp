package headfirst.designpatterns.brideg;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-9 下午6:07
 */
public class TestDrive {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
