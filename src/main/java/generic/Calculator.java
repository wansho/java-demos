package generic;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author wanshuo
 * @date 2021-06-14 22:03:00
 */
public class Calculator {

    /***
     * <T extends Number> 是用来约束传参的类型，与返回值无关
     * @param <T>
     * @param a
     * @param b
     * @return
     */
    public static <T extends Number> double add(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }

    public static void compareStrings(List<String> list, Predicate<String> predicate) {
        list.stream().filter((n) -> (predicate.test(n))).forEach((n) -> {
            System.out.println(n + " ");
        });
    }
}
