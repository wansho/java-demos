import java.text.MessageFormat;

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
    }
}
