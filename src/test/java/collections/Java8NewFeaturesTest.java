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

}