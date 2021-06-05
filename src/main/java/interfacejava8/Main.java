package interfacejava8;

import java.io.Serializable;

/**
 * @author wanshuo
 * @date 2021-06-04 11:05:37
 */
public class Main {
    public static void main(String[] args) {
        BaseService service = new MyService();
        service.test();
    }
}
