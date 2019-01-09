package test1.a10state;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-7 下午6:58
 */
public abstract class State {

    public void insertQuater() {
        throw new UnsupportedOperationException("Cannot insert money!");
    }

    public void returnMoney() {
        throw new UnsupportedOperationException("Cannot return Money!");
    }

    public void turnCrank() {
        throw new UnsupportedOperationException("Cannot turn crank!");
    }

    public void dispense() {
        throw new UnsupportedOperationException("Cannot dispense candy!");
    }
}
