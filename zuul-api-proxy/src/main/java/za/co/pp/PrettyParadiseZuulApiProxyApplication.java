package za.co.pp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class PrettyParadiseZuulApiProxyApplication {
    public static void main(String... args){
        SpringApplication.run(PrettyParadiseZuulApiProxyApplication.class, args);
    }

}
