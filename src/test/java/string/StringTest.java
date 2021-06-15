package string;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;

public class StringTest {

    /***
     * MessageFormat 字符串格式化
     * 注意：
     * 1. 占位符是从 0 开始计数
     */
    @Test
    void testMessageFormat(){
        String result = MessageFormat.format("hello, my name is {1}", "wansho", "hehe", "test");
        System.out.println(result);

        result = MessageFormat.format("hello, my name is {0}", "wansho");
        System.out.println(result);
    }

}
