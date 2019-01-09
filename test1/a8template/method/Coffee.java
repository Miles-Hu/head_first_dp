package test1.a8template.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-6 下午6:40
 */
public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("brewing coffee");
    }

    @Override
    public void addCondiment() {
        System.out.println("adding milk, sugar to coffee!");
    }

    @Override
    public boolean needCondiment() {
        System.out.println("Do you want condiment in your coffee, sir? y/n: \n");
        boolean need = false;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String s = bufferedReader.readLine();
            if (s.toLowerCase().contains("y")) {
                need = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return need;
    }

}
