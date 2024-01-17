package top.crazypang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import top.crazypang.service.SimpleMailService;

@Service
public class SimpleMailServiceImpl implements SimpleMailService {

    @Autowired
    JavaMailSender javaMailSender;
    @Override
    public void sendSimpleMail(String to, String subject, String content) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("15119859158@163.com");
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setTo(to);
        simpleMailMessage.setText(content);
        javaMailSender.send(simpleMailMessage);
    }
}
