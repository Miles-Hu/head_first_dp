package headfirst.designpatterns.brideg;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-9 下午6:07
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
