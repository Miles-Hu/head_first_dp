package headfirst.designpatterns.brideg;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-9 下午6:07
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
