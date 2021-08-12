import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wanshuo
 * @date 2021-08-06 13:10:21
 */
public class JonsTest {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("hehe", "hehe");
        JSONObject json = new JSONObject(map);
        System.out.println(json.toJSONString());
    }
}
