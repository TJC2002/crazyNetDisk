package top.crazypang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject :crazyNetdisk
 * @BelongsPackage :top.crazypang.controller
 * @Author: crazyPang
 * @CreateTime: 2024-01-17  20:26
 * @Description: TODO
 */
@RestController
public class ClientController {
    @GetMapping("/hello")
    public String test(){
        return "client-api is reached";
    }
}
