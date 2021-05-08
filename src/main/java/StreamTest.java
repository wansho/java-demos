import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    }
}
