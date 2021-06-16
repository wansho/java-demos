package thinkinjava.chapter15generic;

/**
 * 泛型接口
 * 生成器接口
 * @author wanshuo
 * @date 2021-06-16 19:01:35
 */
public interface Generator<T> {
    /***
     * 返回下一个
     * @return
     */
    T next();
}
