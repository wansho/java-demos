package thinkinjava.chapter15generic;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class IterableFibonacciTest {

    @Test
    void test(){
        IterableFibonacci iterableFibonacci = new IterableFibonacci(10);
        for (Integer integer : iterableFibonacci) {
            System.out.println(integer);
        }
        
    }

}