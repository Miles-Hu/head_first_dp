package test1.a9iterator;

import java.util.ArrayList;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-7 上午12:28
 */
public class Waitress {

    ArrayList<Iterable> menus = new ArrayList<>();

    void addMenu(Iterable<MenuItem> menu) {
        menus.add(menu);
    }

    void printMenu() {
        for (Iterable<MenuItem> menu : menus) {
            Iterator<MenuItem> iterator = menu.iterator();
            while (iterator.hasNext()) {
                MenuItem menuItem = iterator.next();
                System.out.println(menuItem);
            }
            System.out.println();
        }
    }

}
