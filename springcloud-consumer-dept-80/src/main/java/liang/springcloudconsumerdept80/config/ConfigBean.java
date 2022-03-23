package liang.springcloudconsumerdept80.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
//将bean注入到交个spring管理
@Configuration
public class ConfigBean implements Serializable {
    //配置负载均衡实现RestTemplate
    @LoadBalanced//ribbon
    @Bean
    public RestTemplate get(){
        return new RestTemplate();
    };

}
