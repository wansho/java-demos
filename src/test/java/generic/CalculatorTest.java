package generic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        double add = Calculator.add(3, 4f);
        assertEquals(7, add);
    }

    @Test
    void compareStrings(){
        List<String> bookList = new ArrayList<>();
        bookList.add("Java 8 Recipes");
        bookList.add("Java EE 7 Recipes");
        bookList.add("Introducing Java EE 7");
        bookList.add("JavaFX 8:  Introduction By Example");
        // lambda 表达式就是一个匿名对象，其中封装了一个函数，是函数式接口的实现
        Calculator.compareStrings(bookList, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("8");
            }
        });
        // 等价于
        Calculator.compareStrings(bookList, str -> str.contains("8"));
    }

}