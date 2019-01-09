package test1.a9composite;

import java.util.Iterator;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-7 下午1:19
 */
public class Waitress {

    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    void addMenu(MenuComponent component) {
        allMenus.add(component);
    }

    void printMenu() {
        allMenus.print();
    }

    void selectVegetarianFood() {
        System.out.println("------------------------------");
        Iterator<MenuComponent> iterator = allMenus.iterator();
        while (iterator.hasNext()) {
            MenuComponent next = iterator.next();
            try {
                if (next.isVegetarian()) {
                    next.print();
                }
            } catch (UnsupportedOperationException e) {

            }
        }

    }
}
