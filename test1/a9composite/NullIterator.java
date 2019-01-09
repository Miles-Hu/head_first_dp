package test1.a9composite;

import java.util.Iterator;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-7 下午1:10
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
