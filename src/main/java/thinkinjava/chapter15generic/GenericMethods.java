package thinkinjava.chapter15generic;

/**
 * 泛型方法
 * @author wanshuo
 * @date 2021-06-18 11:02:08
 */
public class GenericMethods {
    public <T> void func(T object){
        System.out.println(object.getClass().getName());
    }
}
