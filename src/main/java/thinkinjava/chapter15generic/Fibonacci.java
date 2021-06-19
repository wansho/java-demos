package thinkinjava.chapter15generic;

/***
 * @author wanshuo
 */
public class Fibonacci implements Generator<Integer>{

    /***
     * static 修饰的变量是静态变量，可以被该类的所有对象所共享
     * private 声明了这个 num 变量封装在 Fibonacci 类中，不对外暴露，通过类名访问不到
     */
    private static int num = 0;

    @Override
    public Integer next() {
        return fib(num++);
    }

    private int fib(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        return fib(num - 1) + fib(num - 2);
    }

}
