package thinkinjava.chapter15generic;

import org.junit.jupiter.api.Test;
import thinkinjava.chapter15generic.TwoTuple;

class TwoTupleTest {
    @Test
    void test(){
        TwoTuple<String, Integer> twoTuple = new TwoTuple("wanshuo", 26);
        System.out.println(twoTuple.toString());
    }
}