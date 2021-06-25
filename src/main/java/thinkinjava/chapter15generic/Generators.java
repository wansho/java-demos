package thinkinjava.chapter15generic;

import java.util.Collection;

/**
 * 利用生成器，我们可以很方便地填充一个 Collection，而泛型化这种操作是具有实际意义地
 * @author wanshuo
 * @date 2021-06-22 14:45:13
 */
public class Generators {
    /***
     * 泛型化生成器
     * @param collection
     * @param generator
     * @param n
     * @param <T>
     * @return
     */
    public static <T> Collection<T> fill(Collection<T> collection, Generator<T> generator, int n){
        for (int i = 0; i < n; i++) {
            collection.add(generator.next());
        }
        return collection;
    }
}
