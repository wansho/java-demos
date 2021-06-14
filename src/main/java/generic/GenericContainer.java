package generic;

/**
 * @author wanshuo
 * @date 2021-06-14 21:37:36
 */
public class GenericContainer<T> {
    private T obj;

    // Pass type in as parameter to constructor 将类型作为参数
    public GenericContainer(T t){
        obj = t;
    }

    public GenericContainer() {

    }

    /**
     * @return the obj
     */
    public T getObj() {
        return obj;
    }

    public void setObj(T t) {
        obj = t;
    }
}