package liang.springcloudconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("liang")
public class SpringcloudConfigClient {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigClient.class,args);
    }
}
