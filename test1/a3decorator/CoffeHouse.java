package test1.a3decorator;


/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-4 下午6:32
 */
public class CoffeHouse {

    public static void main(String[] args) {
        String orderStr = "Espresso,Moca,2,Soy,1,Whip,1";
        String[] params = orderStr.split(",");
        Beverage beverage = CoffeHouseFactory.createCoffe(params[0]);
        for (int i = 1; i < params.length; i=i+2) {
            CoffeHouseFactory.createDeco(params[i], beverage);
        }
        System.out.println(beverage.getDescription()+", costs: "+beverage.cost());
    }

}
