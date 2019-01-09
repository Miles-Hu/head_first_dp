package test1.aa1bridge;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-9 下午7:06
 */
public abstract class Shape {

    protected CircleBridge bridge;

    public Shape(CircleBridge bridge) {
        this.bridge = bridge;
    }

    public abstract void draw();

}
