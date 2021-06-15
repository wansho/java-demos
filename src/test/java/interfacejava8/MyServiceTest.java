package interfacejava8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyServiceTest {

    /***
     * jdk8 接口
     * 1. 可以定义方法并实现
     * 2. 可以定义成员变量
     */
    @Test
    void test(){
        MyService myService = new MyService();
        myService.test();
        System.out.println(myService.strDemo);
    }

}