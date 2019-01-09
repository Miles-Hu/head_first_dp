package test1.a8template.method;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-6 下午6:35
 */
public abstract class CaffeineBeverage {

    public void makeCaffeineBeverage() {
        boilWater();
        brew();
        pourBeverage();
        if (needCondiment()) {
            addCondiment();
        }
    }

    public final void boilWater() {
        System.out.println("boiling water!");
    }

    public final void pourBeverage() {
        System.out.println("pouring water!");
    }

    public abstract void brew();

    public abstract void addCondiment();

    //钩子方法
    public boolean needCondiment() {
        return true;
    }

}
