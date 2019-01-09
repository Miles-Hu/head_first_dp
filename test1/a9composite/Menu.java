package test1.a9composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-7 下午1:03
 */
public class Menu extends MenuComponent {

    private ArrayList<MenuComponent> menus = new ArrayList<>();
    private String name ;

    public Menu(String name) {
        this.name = name;
    }

    public ArrayList<MenuComponent> getMenus() {
        return menus;
    }

    @Override
    void print() {
        System.out.printf("This is a %s Menu \n",name);
        System.out.println("---------------------");
        for (MenuComponent component : menus) {
            component.print();
        }
    }

    @Override
    void add(MenuComponent component) {
        menus.add(component);
    }

    @Override
    void remove(MenuComponent component) {
        menus.remove(component);
    }

    @Override
    public Iterator<MenuComponent> iterator() {
        return new CompositeIterator(menus.iterator());
    }

    private class CompositeIterator implements Iterator<MenuComponent> {

        private LinkedList<Iterator<MenuComponent>> stack = new LinkedList<>();

        public CompositeIterator(Iterator<MenuComponent> iterator) {
            stack.push(iterator);
        }

        @Override
        public boolean hasNext() {

            if (stack.isEmpty()) {
                return false;
            }else {
                Iterator<MenuComponent> peek = stack.peek();
                if (!peek.hasNext()) {
                    stack.pop();
                    return hasNext();
                }else {
                    return true;
                }
            }
        }

        @Override
        public MenuComponent next() {
            Iterator<MenuComponent> peek = stack.peek();
            MenuComponent next = peek.next();
            if (next instanceof Menu) {
                stack.push(((Menu) next).getMenus().iterator());
            }
            return next;
        }
    }
}
