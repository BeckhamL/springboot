package io.javabrains.springbootstarter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Create servlet container and host
 *
 * @author Beckham Lam
 * @since 2018-10-11
 */

@SpringBootApplication
public class ApiApp {
    public static void main(String[] args) {

        SpringApplication.run(ApiApp.class, args);
    }
}
