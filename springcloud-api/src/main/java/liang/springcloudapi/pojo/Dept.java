package liang.springcloudapi.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data                                   //setter和getter方法
@ToString                               //ToString方法
@NoArgsConstructor                      //無參構造方法
@Accessors(chain = true)                //鏈式寫法
public class Dept implements Serializable {
    //主鍵
    private Long deptno;
    //表名
    private String dname;
    //表號
    private String dbSource;
}
