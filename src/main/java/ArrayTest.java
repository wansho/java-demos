import java.util.Arrays;
import java.util.List;

/**
 * @author wanshuo
 * @date 2021-05-08 16:21:04
 */
public class ArrayTest {

    public static void main(String[] args) {
        String[] strings = new String[]{"1", "2", "3"};
        strings = Arrays.copyOfRange(strings, 1, strings.length);

        for (String string : strings) {
            System.out.println(string);
        }

        List<String> list = Arrays.asList(strings);
        System.out.println(list);

        int[] ints = new int[]{1,2,3};
        List<int[]> list1 = Arrays.asList(ints);

    }

}
