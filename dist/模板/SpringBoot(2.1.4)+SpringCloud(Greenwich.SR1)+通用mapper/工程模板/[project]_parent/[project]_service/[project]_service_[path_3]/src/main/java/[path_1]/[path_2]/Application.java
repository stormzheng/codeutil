package

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

[path_1].[path_2];

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"[package].dao"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}