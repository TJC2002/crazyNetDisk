package top.crazypang.web.controller;

import com.alibaba.cloud.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.crazypang.mapper.SystemUserMapper;
import top.crazypang.service.SimpleMailService;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @BelongsProject :crazyNetDisk
 * @BelongsPackage :top.crazypang.web.controller
 * @Author: crazyPang
 * @CreateTime: 2024-01-16  21:01
 * @Description: TODO
 */

@RestController
public class SystemUserController {

    @Autowired
    private SimpleMailService simpleMailService;

    @Value("${crazy.netDisk.config.sysAdmin-userId}")
    private volatile String adminID;

    @Autowired
    SystemUserMapper systemUserMapper;
    @GetMapping("/hello")
    public String fun1(){
        systemUserMapper.selectSystemUser("a");
        return adminID +"aa";
    }

    @GetMapping("/testEmail")
    public String fun2(){
        simpleMailService.sendSimpleMail("1595827102@qq.com",
                "hello",
                "你好，我是crazy,我正在测试发送邮件功能，很抱歉打扰了你，祝你生活愉快");
        return "done";
    }
}
