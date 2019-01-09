package test1.a9iterator;

import java.util.ArrayList;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-7 上午12:17
 */
public class BreakfastMenu implements Iterable{

    ArrayList<MenuItem> menu = new ArrayList<>();

    public BreakfastMenu() {

        menu.add(new MenuItem("Scrambled egg"));
        menu.add(new MenuItem("Delicious pancake"));
        menu.add(new MenuItem("Very Delicious hot dog"));

    }


    @Override
    public Iterator<MenuItem> iterator() {
        return new BreakFastMenuIterator();
    }

    private class BreakFastMenuIterator implements Iterator<MenuItem>{

        int pos = 0;

        @Override
        public boolean hasNext() {
            if (pos < menu.size()) {
                return menu.get(pos)!=null;
            }
            return false;
        }

        @Override
        public MenuItem next() {
            return menu.get(pos++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("cannot remove object from collection!");
        }
    }
}
