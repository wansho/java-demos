package thinkinjava.chapter15generic;

/**
 * 指定多个泛型，泛型可以是任意字母
 * @author wanshuo
 * @date 2021-06-16 16:42:44
 */
public class TwoTuple<A, B> {


    public final A first;
    public final B second;

    public TwoTuple(A a, B b){
        first = a;
        second = b;
    }

    @Override
    public String toString(){
        return "(" + first + ", " + second + ")";
    }
}
