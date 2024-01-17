package top.crazypang.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.crazypang.mapper.SystemUserMapper;

/**
 * @BelongsProject :crazyNetDisk
 * @BelongsPackage :top.crazypang.web.controller
 * @Author: crazyPang
 * @CreateTime: 2024-01-16  21:01
 * @Description: TODO
 */

@RestController
public class SystemUserController {
    @Value("${crazy.netDisk.config.sysAdmin-userId}")
    private volatile String adminID;

    @Autowired
    SystemUserMapper systemUserMapper;
    @GetMapping("/hello")
    public String fun1(){
        systemUserMapper.selectSystemUser("a");
        return adminID +"aa";
    }
}
