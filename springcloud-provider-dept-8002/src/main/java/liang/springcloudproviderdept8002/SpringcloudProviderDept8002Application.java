package liang.springcloudproviderdept8002;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@MapperScan("liang.springcloudproviderdept8002.mapper")
public class SpringcloudProviderDept8002Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProviderDept8002Application.class,args);
    }
}
