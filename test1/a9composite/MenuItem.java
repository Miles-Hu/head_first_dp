package test1.a9composite;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-7 下午1:01
 */
public class MenuItem extends MenuComponent {

    private String name;
    private boolean vegetarian;

    public MenuItem(String name, boolean vegetarian) {
        this.name = name;
        this.vegetarian = vegetarian;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    void print() {
        System.out.println(name+" is vegerarian: "+vegetarian);
    }
}
