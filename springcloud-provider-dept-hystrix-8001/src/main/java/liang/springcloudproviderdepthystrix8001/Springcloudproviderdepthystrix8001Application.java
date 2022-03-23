package liang.springcloudproviderdepthystrix8001;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan(basePackages = "liang.springcloudproviderdepthystrix8001.mapper")
@EnableEurekaClient//服务启动后自动注入eureka中
@EnableDiscoveryClient//服务发现
@EnableCircuitBreaker//添加熔断的支持  CircuitBreaker  断路器
public class Springcloudproviderdepthystrix8001Application {
    public static void main(String[] args) {
        SpringApplication.run(Springcloudproviderdepthystrix8001Application.class, args);
    }

    //使用hystrix-disboard监控这个微服务，需要添加的bean。
    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        //访问该页面就是监控页面
        registrationBean.addUrlMappings("/actuator/hystrix.stream");

        return registrationBean;
    }

}
