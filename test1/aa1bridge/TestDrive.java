package test1.aa1bridge;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-9 下午7:12
 */
public class TestDrive {

    public static void main(String[] args) {
        Shape greenCircle = new Circle(new GreenCircle(), 100, 100, 100);
        Shape redCircle = new Circle(new RedCircle(), 0, 50, 50);

        greenCircle.draw();
        redCircle.draw();
    }

}
