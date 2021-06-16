package thinkinjava.chapter15generic;

import java.util.Iterator;
import java.util.Random;

/**
 * Generator<Coffee>, Iterable<Coffee> 都是泛型接口
 * 参数化的 Generator 接口确保了 next() 方法返回的是参数的类型
 * 实现 Iterable 接口保证了 CoffeeGenerator 可以遍历
 *
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
