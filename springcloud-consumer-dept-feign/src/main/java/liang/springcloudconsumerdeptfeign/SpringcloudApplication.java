package liang.springcloudconsumerdeptfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Administrator
 */
//scanBasePackages = "liang"没有这个包扫描
//那么DeptClientService和DeptClientServiceFallbackFactory就不能交个spring管理，报错
@SpringBootApplication(scanBasePackages = "liang")
@EnableEurekaClient
@EnableFeignClients("liang.springcloudapi.service")
//@ComponentScan("liang.springcloudapi")
public class SpringcloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudApplication.class,args);
    }
}
