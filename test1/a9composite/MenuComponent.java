package test1.a9composite;

import java.util.Iterator;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-7 下午12:56
 */
public abstract class MenuComponent implements Iterable<MenuComponent>{

    String getName() {
        throw new UnsupportedOperationException();
    }

    boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    void print() {
        throw new UnsupportedOperationException();
    }

    void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    void remove(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<MenuComponent> iterator() {
        return new NullIterator();
    }
}
