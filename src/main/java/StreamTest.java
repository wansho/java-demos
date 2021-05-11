import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wanshuo
 * @date 2021-05-08 14:48:00
 */
public class StreamTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[]{"1", "2", "3"});
        String[] strings = list.stream().map(x-> x+"!").toArray(String[]::new);
        for (String string : strings) {
            System.out.println(string);
        }
        list = list.stream().map(x -> x + "-").collect(Collectors.toList());
        System.out.println(list);

        List<Integer> list1 = Arrays.asList(1,2,3);
        System.out.println(list1.stream().max(Comparator.comparing(x -> x)).get());

    }
}
