package top.crazypang.service;

import org.springframework.stereotype.Service;

/**
 * @Author: tanjiacheng
 * @Date: 2024/1/17 10:36
 */

public interface SimpleMailService {
    public void sendSimpleMail(String to, String subject, String content);
}
