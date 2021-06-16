package thinkinjava.chapter15generic;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeGeneratorTest {

    @Test
    void test(){
        CoffeeGenerator coffeeGenerator = new CoffeeGenerator();
        IntStream.range(0, 5).forEach(num -> {
            System.out.println(coffeeGenerator.next());
        });

        System.out.println("----------------------------");

        CoffeeGenerator gen = new CoffeeGenerator(5);
        Iterator<Coffee> iterator = gen.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    void testStatic(){
        Coffee[] coffees = {new Latte(), new Americano(), new Breve()};
        for (Coffee coffee : coffees) {
            System.out.println(coffee);
        }
    }

}