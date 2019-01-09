package test1.a9iterator;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-7 上午12:32
 */
public class TestDriver {

    public static void main(String[] args) {
        BreakfastMenu breakfastMenu = new BreakfastMenu();
        LunchMenu lunchMenu = new LunchMenu();
        Waitress waitress = new Waitress();
        waitress.addMenu(breakfastMenu);
        waitress.addMenu(lunchMenu);
        waitress.printMenu();
    }

}
