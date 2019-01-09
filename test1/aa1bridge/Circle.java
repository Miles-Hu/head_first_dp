package test1.aa1bridge;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-9 下午7:07
 */
public class Circle extends Shape {

    int radius,x,y;

    public Circle(CircleBridge bridge, int radius, int x, int y) {
        super(bridge);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        super.bridge.drawCircle(radius,x,y);
    }
}
