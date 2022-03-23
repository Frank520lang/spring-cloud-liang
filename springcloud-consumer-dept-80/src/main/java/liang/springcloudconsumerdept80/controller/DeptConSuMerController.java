package liang.springcloudconsumerdept80.controller;

import liang.springcloudapi.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
/*
Restful方式请求其他微服务
restTemplate对象的使用
*/
@RestController
public class DeptConSuMerController {
    @Autowired
    private RestTemplate restTemplate;
    //private static final String url="http://localhost:8001";
    //微服务名字 【ribbon】
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";
    @GetMapping("/get")
    public List<Dept> queryAllDept(){
        List<Dept> list =restTemplate.getForObject(REST_URL_PREFIX+"/dept/query",List.class);
        return list;
    }
}
