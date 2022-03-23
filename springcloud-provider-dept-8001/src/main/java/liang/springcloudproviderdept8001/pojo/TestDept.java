package liang.springcloudproviderdept8001.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@NoArgsConstructor
@Accessors(chain = true)
public class TestDept {
    private Integer deptno;
    private String dname;
    private String dbSource;
}
