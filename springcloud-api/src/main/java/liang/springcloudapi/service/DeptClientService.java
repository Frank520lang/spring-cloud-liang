package liang.springcloudapi.service;

import liang.springcloudapi.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
/**
 * 微服务的name
 */
@Component
// fallbackFactory 通过这个去指定服务降级
@FeignClient(value = "springcloud-provider-dept",fallbackFactory = DeptClientServiceFallbackFactory.class)
//@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @RequestMapping("/dept/query")
    List<Dept> queryAll() ;
    @GetMapping("/dept/query/{id}")
    Dept get(@PathVariable Long id);
}
