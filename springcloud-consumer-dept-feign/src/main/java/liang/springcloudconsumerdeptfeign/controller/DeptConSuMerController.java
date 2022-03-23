package liang.springcloudconsumerdeptfeign.controller;

import liang.springcloudapi.pojo.Dept;
import liang.springcloudapi.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 */
@RestController
public class DeptConSuMerController {
    @Autowired
    private DeptClientService deptClientService;
    @RequestMapping("/dept/query")
    public List<Dept> queryAll(){
        return deptClientService.queryAll();
    }
    //测试服务降级
    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable Long id){
        System.out.println("执行到这里：111111111111111");
        return deptClientService.get(id);
    }
}
