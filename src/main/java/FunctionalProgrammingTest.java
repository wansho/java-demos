import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author wanshuo
 * @date 2021-05-11 13:20:33
 */
public class FunctionalProgrammingTest {

    public static void main(String[] args) {
        Predicate<Integer> atLeast5 = x -> x >= 5;
        // 两者等价
        Predicate<Integer> atLeast6 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer >= 6;
            }
        };
        System.out.println(atLeast6.test(6));
        System.out.println(atLeast5.test(5));

        BinaryOperator<Long> add2 = (x, y) -> x + y;
        BinaryOperator<Long> multi = new BinaryOperator<Long>() {
            @Override
            public Long apply(Long aLong, Long aLong2) {
                return aLong * aLong2;
            }
        };
        System.out.println(add2.apply(3L, 4L));

        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return null;
            }
        };



    }


}
