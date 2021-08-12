import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;

/**
 * @author wanshuo
 * @date 2021-07-20 16:32:42
 */
public class FastJsonTest {

    @Test
    void test(){
        JSONObject jsonObject = JSON.parseObject("{}");
        System.out.println(jsonObject);
    }
}
