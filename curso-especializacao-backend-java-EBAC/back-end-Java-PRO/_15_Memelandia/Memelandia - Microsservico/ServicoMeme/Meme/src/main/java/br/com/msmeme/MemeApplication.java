package br.com.msmeme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories(basePackages = "br.com.msmeme.repository")
public class MemeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemeApplication.class, args);
    }

}
