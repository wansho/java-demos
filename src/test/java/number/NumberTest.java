package number;

import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * @author wanshuo
 * @date 2021-06-16 18:37:13
 */
public class NumberTest {

    /***
     * num++ 和 ++num 的赋值
     */
    @Test
    void testPlusPlus(){
        int num = 10;
        int num2 = num++;
        System.out.println(num2); // 10
    }

    @Test
    void testRandom(){
        Random random = new Random();
        System.out.println(random.nextInt(100));
    }
}
