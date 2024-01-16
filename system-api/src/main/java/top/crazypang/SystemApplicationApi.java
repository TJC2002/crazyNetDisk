package top.crazypang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @BelongsProject :crazyNetdisk
 * @BelongsPackage :top.crazypang
 * @Author: crazyPang
 * @CreateTime: 2024-01-16  20:58
 * @Description: TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SystemApplicationApi {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplicationApi.class,args);
    }
}
