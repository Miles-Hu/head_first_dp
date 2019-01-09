package headfirst.designpatterns.builder;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-9 下午11:06
 */
public class Meal {

    //构造函数超过3个参数就应该使用构造器了
    private String burger;
    private String drinks;
    private String snacks;
    private String dessert;
    private String pizza;

    private Meal(MealBuilder mealBuilder) {
        this.burger = mealBuilder.burger;
        this.dessert = mealBuilder.dessert;
        this.drinks = mealBuilder.drinks;
        this.pizza = mealBuilder.pizza;
        this.snacks = mealBuilder.snacks;
    }
    public static MealBuilder builder() {
        return new MealBuilder();
    }

    public static class MealBuilder{
        private String burger;
        private String drinks;
        private String snacks;
        private String dessert;
        private String pizza;

        MealBuilder burger(String burger) {
            this.burger = burger;
            return this;
        }

        MealBuilder drinks(String drinks) {
            this.drinks = drinks;
            return this;
        }
        MealBuilder snacks(String snacks) {
            this.snacks = snacks;
            return this;
        }

        MealBuilder dessert(String dessert) {
            this.dessert = dessert;
            return this;
        }
         MealBuilder pizza(String pizza) {
            this.pizza = pizza;
            return this;
        }

        Meal build() {
            return new Meal(this);
        }

    }

    @Override
    public String toString() {
        return "Meal{" +
                "burger='" + burger + '\'' +
                ", drinks='" + drinks + '\'' +
                ", snacks='" + snacks + '\'' +
                ", dessert='" + dessert + '\'' +
                ", pizza='" + pizza + '\'' +
                '}';
    }
}
