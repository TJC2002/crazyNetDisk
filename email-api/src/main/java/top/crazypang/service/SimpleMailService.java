package top.crazypang.service;

/**
 * @Author: tanjiacheng
 * @Date: 2024/1/17 10:36
 */

public interface SimpleMailService {
    public void sendSimpleMail(String to, String subject, String content);
}
