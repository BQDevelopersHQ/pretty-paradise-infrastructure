package za.co.pp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PrettyParadiseEurekaServer {
    public static void main(String... args){
        SpringApplication.run(PrettyParadiseEurekaServer.class);
    }

}
