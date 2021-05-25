import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author wanshuo
 * @date 2021-05-24 20:15:30
 */
public class IOTest {

    public static void main(String[] args) throws IOException {
        printWriterTest();
    }

    public static void printStreamTest() throws IOException {
        PrintStream ps = new PrintStream("src/main/resources/IOTest.txt");
        ps.write("helloworld".getBytes());
        ps.println();
        ps.print(111890);
        ps.println("heheh");
        ps.write(0x41);
        ps.append("abcde");
        ps.close();
    }

    public static void printWriterTest() throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileOutputStream("src/main/resources/IOTest.txt"));
        printWriter.println("hahahaha");
        printWriter.flush();
        printWriter.close();
    }

    public static void fileTest() throws IOException{

    }
}
