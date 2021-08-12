package bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author wanshuo
 * @date 2021-08-12 09:59:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String name;
    private String department;
    private BigDecimal order = new BigDecimal(0);
}
