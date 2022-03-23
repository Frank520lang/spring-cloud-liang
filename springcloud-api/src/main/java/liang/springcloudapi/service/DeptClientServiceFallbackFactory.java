package liang.springcloudapi.service;

import feign.hystrix.FallbackFactory;
import liang.springcloudapi.pojo.Dept;
import org.springframework.stereotype.Component;

import java.util.List;

/*失败回调的*/
/*降级*/
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {

    @Override
    public Object create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public List<Dept> queryAll() {
                return (List<Dept>) new Dept()
                        .setDeptno((long) 1)
                        .setDname("id=>\"+id+\":信息无法找到，客户端提供降级服务，这个服务现在已经关闭了")
                        .setDbSource("no found database in MySQl");
            }

            @Override
            public Dept get(Long id) {
                return new Dept()
                        .setDeptno(id)
                        .setDname("id=>\"+id+\":信息无法找到，客户端提供降级服务，这个服务现在已经关闭了")
                        .setDbSource("no found database in MySQl");
            }
        };
    }
}
