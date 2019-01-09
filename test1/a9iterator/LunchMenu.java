package test1.a9iterator;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-7 上午12:23
 */
public class LunchMenu implements Iterable<MenuItem>{

    MenuItem[] menu = new MenuItem[3];

    public LunchMenu() {

        menu[0] = new MenuItem("Beef Hamburger!");
        menu[1] = new MenuItem("Veggie Pizza!");
        menu[2] = new MenuItem("Noodles!");

    }

    @Override
    public Iterator<MenuItem> iterator() {
        return new LunchMenuIterator();
    }

    private class LunchMenuIterator implements Iterator<MenuItem> {

        int pos = 0;

        @Override
        public boolean hasNext() {
            if (pos < menu.length) {
                return menu[pos]!=null;
            }
            return false;
        }

        @Override
        public MenuItem next() {
            return menu[pos++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove object from collection in this version!");
        }
    }

}
