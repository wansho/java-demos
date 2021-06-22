package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Java8NewFeaturesTest {

    @Test
    void testForEach(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        list.stream().forEach(x -> {
            System.out.println(x);
        });
    }

    @Test
    void testReduce(){
        List<Boolean> booleanList = new ArrayList<>();
        booleanList.add(true);
        booleanList.add(false);
        Boolean reduce = booleanList.stream().reduce(true, (acc, element) -> acc && element);
        System.out.println(reduce);
    }

}