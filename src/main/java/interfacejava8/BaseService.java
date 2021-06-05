package interfacejava8;

/**
 * @author wanshuo
 * @date 2021-06-04 11:04:28
 */
public interface BaseService {

    public default void test(){
        System.out.println("test");
    }
}
