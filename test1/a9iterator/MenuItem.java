package test1.a9iterator;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-7 上午12:16
 */
public class MenuItem {

    String name;

    public MenuItem(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                '}';
    }
}
