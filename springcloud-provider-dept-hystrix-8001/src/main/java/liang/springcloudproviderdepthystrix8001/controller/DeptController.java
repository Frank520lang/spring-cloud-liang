package liang.springcloudproviderdepthystrix8001.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import liang.springcloudapi.pojo.Dept;
import liang.springcloudproviderdepthystrix8001.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @HystrixCommand(fallbackMethod = "hystrixGet")
    @GetMapping("get/{id}")
    public Dept get(@PathVariable Long id) {
        Dept dept = deptService.queryDeptById(id);
        if (dept == null) {
            throw new RuntimeException("id=>" + id + ":信息无法找到");
        }
        return dept;
    }

    //服务熔断
    public Dept hystrixGet(@PathVariable Long id) {
        return new Dept()
                .setDeptno(id)
                .setDname("id=>\"+id+\":信息无法找到")
                .setDbSource("no found database in MySQl");
    }
}
