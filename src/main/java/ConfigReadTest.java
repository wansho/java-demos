import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author wanshuo
 * @date 2021-05-22 09:39:20
 */
public class ConfigReadTest {

    public static final String PATH = "mp_push.setting";

    public static void main(String[] args)  {
        Properties properties = new Properties();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/mp_push.setting"))){
            properties.load(bufferedReader);
        }catch (IOException e){
            System.out.println("配置文件读取失败！详细信息：" + e.getMessage());
        }
        System.out.println(properties.getProperty("server"));
    }

}
