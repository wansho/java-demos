package thinkinjava.chapter15generic;

/**
 * 泛型数组
 * @author wanshuo
 * @date 2021-06-22 20:00:34
 */
public class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generic<Integer>[] gia;

    public static void main(String[] args) {
        gia = (Generic<Integer>[]) new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());
        gia[0] = new Generic<Integer>();
        System.out.println(gia.length);
    }
}

class Generic<T>{

}
