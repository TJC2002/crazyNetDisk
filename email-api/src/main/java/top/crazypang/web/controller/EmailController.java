package top.crazypang.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject :crazyNetdisk
 * @BelongsPackage :top.crazypang.controller
 * @Author: crazyPang
 * @CreateTime: 2024-01-17  20:30
 * @Description: TODO
 */
@RestController
public class EmailController {
    @GetMapping("/hello")
    public String test(){
        return "email api is reached";
    }
}
