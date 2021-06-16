package thinkinjava.chapter15generic;

/**
 * @author wanshuo
 * @date 2021-06-16 18:57:28
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
