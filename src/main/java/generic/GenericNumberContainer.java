package generic;

/**
 * @author wanshuo
 * @date 2021-06-14 22:00:49
 */
public class GenericNumberContainer <T extends Number> {
    private T obj;

    public GenericNumberContainer(){
    }

    public GenericNumberContainer(T t){
        obj = t;
    }
    /**
     * @return
    the obj
     */
    public T getObj() {
        return obj;
    }

    public void setObj(T t) {
        obj = t;
    }
}
