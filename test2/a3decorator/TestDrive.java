package test2.a3decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 上午11:19
 */
public class TestDrive {

    public static void main(String[] args) {
        String name = null;
        System.out.println("Please type in your order in the following syntax: CoffeeName,Condiment,num,[Condiment,num], \n for example: Espresso,Moca,1,Whip,1");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while ((name = bufferedReader.readLine()) != null) {
                Coffee coffe = createCoffe(name);
                System.out.println(coffe);
                System.out.println(coffe.price());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Coffee createCoffe(String name) {
        String[] names = name.split(",");
        Coffee coffee = null;
        if ("Espresso".equals(names[0])) {
            coffee = new Espresso(1.99);
        } else if ("HouseBlend".equals(names[0])) {
            coffee = new HouseBlend(2.44);
        }else {
            throw new UnsupportedOperationException(names[0]+" is out of our products range!");
        }

        for (int i = 1; i < names.length; i = i + 2) {
            if ("Moca".equals(names[i])) {
                for (int j = 1; j <= Integer.parseInt(names[i + 1]); j++) {
                    coffee = new Moca(.32, coffee);
                }
            } else if ("Sugar".equals(names[i])) {
                for (int j = 1; j <= Integer.parseInt(names[i + 1]); j++) {
                    coffee = new Sugar(.21,coffee);
                }
            } else if ("Whip".equals(names[i])) {
                for (int j = 1; j <= Integer.parseInt(names[i + 1]); j++) {
                    coffee = new Whip(.45, coffee);
                }
            }else {
                throw new UnsupportedOperationException(names[i]+" is out of our products range!");
            }
        }
        return coffee;
    }

}
