package all;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDubbo(scanBasePackages = "all.yy.dubbo")
public class WebApplication {
   
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class,args);
    }
}
