package test1.a9composite;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-7 下午1:24
 */
public class TestDriver {

    public static void main(String[] args) {
        Menu breakfastMenu = new Menu("BreakfastMenu");
        Menu lunchMenu = new Menu("LunchMenu");
        Menu dessertMenu = new Menu("DessertMenu");

        breakfastMenu.add(new MenuItem("Scrammbled Eggs!",false));
        breakfastMenu.add(new MenuItem("Delicious Dumpling",false));
        breakfastMenu.add(new MenuItem("Hot Porridge",true));

        lunchMenu.add(new MenuItem("Clam Pizza!",false));
        lunchMenu.add(new MenuItem("Beef Hamburger",false));
        lunchMenu.add(new MenuItem("Veggie Pizza!",true));

        dessertMenu.add(new MenuItem("Vanilla Cake!",true));
        dessertMenu.add(new MenuItem("Chocolate Cake!",true));

        lunchMenu.add(dessertMenu);

        Menu allMenus = new Menu("AllMenus");
        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        waitress.selectVegetarianFood();
    }

}
