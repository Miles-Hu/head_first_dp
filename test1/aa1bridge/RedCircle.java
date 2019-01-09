package test1.aa1bridge;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-9 下午7:08
 */
public class RedCircle implements CircleBridge {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.printf("Draw Red Circle: radius: %s, x:%d, y:%d \n",radius,x,y);
    }
}
