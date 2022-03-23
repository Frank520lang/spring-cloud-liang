package liang.springcloudproviderdept8001;

import liang.springcloudapi.pojo.Dept;
import liang.springcloudproviderdept8001.mapper.DeptMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringcloudProviderDept8001ApplicationTests {
    @Autowired
    private DeptMapper deptMapper;
    @Autowired
    private Dept dept;
    @Test
    void contextLoads() {
    }
    @Test
    void testAdd(){
        dept.setDeptno((long) 4).setDname("frank").setDbSource("五");
        deptMapper.addDept(dept);
    }

}
