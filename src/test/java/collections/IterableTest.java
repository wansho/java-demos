package collections;

import org.junit.jupiter.api.Test;
import thinkinjava.chapter15generic.Americano;
import thinkinjava.chapter15generic.Breve;
import thinkinjava.chapter15generic.Coffee;
import thinkinjava.chapter15generic.Latte;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author wanshuo
 * @date 2021-06-16 18:44:16
 */
public class IterableTest {

    @Test
    void testIterator(){
        String[] strs = {"1", "2", "3"};
        Iterator iterator = Arrays.asList(strs).iterator();
        for(; iterator.hasNext(); ){
            System.out.println(iterator.next());
        }
    }
}
