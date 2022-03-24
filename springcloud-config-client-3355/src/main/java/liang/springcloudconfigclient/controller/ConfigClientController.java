package liang.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
public class ConfigClientController {
    /**
     * 获取微服务名称
     * **/
    @Value("${spring.application.name}")
    private String applicationName;
    /**
     * 获取Eureka服务
     * **/
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;
    /**
     * 获取服务端的端口号
     * **/
    @Value("${server.port}")
    private String port;


    @RequestMapping("/config")
    public String getConfig() {
        return "applicationName:" + applicationName +
                "eurekaServer:" + eurekaServer +
                "port:" + port;
    }
}
