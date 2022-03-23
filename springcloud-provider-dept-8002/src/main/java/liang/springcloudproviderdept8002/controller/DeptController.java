package liang.springcloudproviderdept8002.controller;

import liang.springcloudapi.pojo.Dept;
import liang.springcloudproviderdept8002.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient client;


    /*增加一条信息*/
    @PostMapping("/add")
    public int addDept(@RequestBody Dept dept){
        System.out.println(dept.toString());
        return deptService.addDept(dept);
    };
    /*按照id查询信息*/
    @GetMapping("/query/{id}")
    public Dept queryDeptById(@PathVariable  Long id){
        return deptService.queryDeptById(id);
    };
    /*查找所有的信息*/
    @GetMapping("/query")
    public List<Dept> queryAll(){
        return deptService.queryAll();
    };
    /*刪除信息*/
    @GetMapping("/delete")
    int deleteId(@RequestParam Long id){
        System.out.println("参数："+id);
        //return id;
        return deptService.deleteId(id);
    };
    /*利用forEarch批量添加*/
    @PostMapping("adds")
    public int addIDs(@RequestBody List<String> dnames){
        return deptService.addIDs(dnames);
    };

    @GetMapping("/discovery")
    public Object discovery() {
        //获取微服务列表清单
        List<String> services = client.getServices();
        System.out.println("client=> services:" + services);
        //获取具体的微服务信息，通过具体的微服务 通过 id
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost() + "," + instance.getPort()
                    + "," + instance.getServiceId() + "," + instance.getUri());
        }
        return this.client;
    }
}
