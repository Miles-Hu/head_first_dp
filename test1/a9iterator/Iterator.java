package test1.a9iterator;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-7 上午12:15
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();

    void remove();

}
