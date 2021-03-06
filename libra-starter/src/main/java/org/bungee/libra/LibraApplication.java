package org.bungee.libra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author gongtai
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class LibraApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraApplication.class);
    }
}
