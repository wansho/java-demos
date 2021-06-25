package thinkinjava.chapter15generic;

/**
 * @author wanshuo
 * @date 2021-06-22 15:52:27
 */
public class Manipulator<T extends HasF> {

    private T obj;

    public Manipulator(T t){
        obj = t;
    }

    public void manipulator(){
        //error code，必须指定 obj 的边界  extends or super
        obj.f();
    }

}
