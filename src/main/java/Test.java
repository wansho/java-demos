/**
 * @author wanshuo
 * @date 2021-05-03 20:57:47
 */
public class Test {

    public static void main(String[] args) {
        // 自动装箱，拆箱
        Integer integer = new Integer(12);
        int value = 12;
        System.out.println( (12 == integer) + ""); // true

        // 三元运算符
        Object object = (1 == 2? "hello" : "world");
        System.out.println(object);
    }
}
