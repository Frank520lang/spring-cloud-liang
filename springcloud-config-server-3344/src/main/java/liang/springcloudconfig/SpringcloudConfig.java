package liang.springcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudConfig {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfig.class,args);
    }
}
