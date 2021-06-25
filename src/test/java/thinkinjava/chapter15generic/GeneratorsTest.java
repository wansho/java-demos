package thinkinjava.chapter15generic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class GeneratorsTest {

    /***
     * 注意 fill 方法是如何透明地应用于 Coffee 和 Integer 的容器和生成器的
     */
    @Test
    void fill() {
        Collection<Coffee> coffeeCollection = Generators.fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 5);
        System.out.println(coffeeCollection);

        Collection<Integer> fabNumbers = Generators.fill(new ArrayList<Integer>(), new Fibonacci(), 5);
        System.out.println(fabNumbers);
    }
}