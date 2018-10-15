package my.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by lx-dong on 2018/10/15.
 */
@EnableEurekaServer
@SpringBootApplication
public class EureServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EureServerApplication.class, args);
    }
}
