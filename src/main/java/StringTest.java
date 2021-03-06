import java.text.MessageFormat;
import java.util.Arrays;

/**
 * @author wanshuo
 * @date 2021-05-08 20:16:21
 */
public class StringTest {
    public static void main(String[] args) {
        String string = "{0}-{1}-{2}";
        string = MessageFormat.format(string, "0", "1");
        System.out.println(MessageFormat.format(string, " "," ", "2"));

        String string2 = "1-%s-2";
        System.out.println(String.format(string2, "3"));

        String[] strings = new String[]{"1", "2"};


        String path = "/optkt/集控操作票内容";
        String[] paths = path.split("/");
        String[] subPaths = Arrays.copyOfRange(paths, 1, paths.length - 1);
        Arrays.stream(subPaths).forEach(p -> System.out.println(p));

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.toString().length());
    }
}
