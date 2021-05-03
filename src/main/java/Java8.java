import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author wanshuo
 * @date 2021-05-03 20:29:32
 */
public class Java8 {
    public static void main(String[] args) {

        // Stream

        String[] strings = new String[]{"a", "b", "c", "d", "d1", "a1"};
        Arrays.asList(strings).stream().forEach(str -> {
            System.out.println(str);
        }); // forEach 接收一个无返回值的 Consumer

        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);





    }

}
