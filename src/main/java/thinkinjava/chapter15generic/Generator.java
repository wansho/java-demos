package thinkinjava.chapter15generic;

/**
 * 泛型接口
 * 生成器是一种专门负责创建对象的类，也是工厂设计模式的一种应用。与工厂方法不同的是，生成器不需要参数，而工厂方法一般需要参数。
 * 也就是说，生成器无需额外的信息就知道如何创建对象
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
