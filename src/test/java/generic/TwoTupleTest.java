package generic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoTupleTest {
    @Test
    void test(){
        TwoTuple<String, Integer> twoTuple = new TwoTuple("wanshuo", 26);
        System.out.println(twoTuple.toString());
    }
}