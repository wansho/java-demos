import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

        //
        System.out.println(Arrays.asList("a").getClass());

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            
        }

        String string = "ColumnValue<STRING:scada>";
        string = string.substring(string.indexOf("<") + 1, string.indexOf(">"));
        System.out.println(string);

        System.out.println(Integer.parseInt("123"));

        long longDemo = 111;
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = list1.stream().map(x -> x + 1).collect(Collectors.toList());
        String[] strings = new String[]{"1", "2", "3"};
        System.out.println(String.join(",", strings));
        System.out.println(list1.toArray(new Integer[list1.size()]).toString());
    }
}
