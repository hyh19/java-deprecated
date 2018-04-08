import org.apache.commons.math3.analysis.function.Abs;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class HelloWorld {

    public static void main(String... args) {
        Fruit apple = giveMeFruit("apple", 12);
        System.out.println(apple);
        Fruit orange = giveMeFruit("orange", 10);
        System.out.println(orange);
    }

    static Map<String, Function<Integer, Fruit>> map = new HashMap<>();

    static {
        map.put("apple", Apple::new);
        map.put("orange", Orange::new);
    }

    public static Fruit giveMeFruit(String fruit, Integer weight) {
        return map.get(fruit.toLowerCase())
                .apply(weight);
    }

    public interface Fruit {
    }

    public static abstract class AbstractFruit implements Fruit {
        public Integer weight = 0;
    }

    public static class Apple extends AbstractFruit {
        public Apple(Integer weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "weight=" + weight +
                    '}';
        }
    }

    public static class Orange extends AbstractFruit {
        public Orange(Integer weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Orange{" +
                    "weight=" + weight +
                    '}';
        }
    }
}