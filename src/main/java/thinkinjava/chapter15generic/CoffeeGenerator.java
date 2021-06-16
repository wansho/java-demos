package thinkinjava.chapter15generic;

import java.util.Iterator;
import java.util.Random;

/**
 * @author wanshuo
 * @date 2021-06-16 19:04:05
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee>{

    private Class[] types = {Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class};
    private static Random random = new Random();
    private int size = 0;

    public CoffeeGenerator(){}

    public CoffeeGenerator(int size){
        this.size = size;
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    @Override
    public Coffee next() {
        try{
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee>{
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }
    }
}
