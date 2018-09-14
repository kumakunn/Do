package org.csu.workmaster_v1.service.impl;

import org.csu.workmaster_v1.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
public class MailServiceImpl implements MailService{

        private final Logger logger = LoggerFactory.getLogger(this.getClass());

        @Autowired
        private JavaMailSender mailSender;
        @Autowired
        private TemplateEngine templateEngine;

        @Value("${spring.mail.username}")
        private String from;

        @Override
        public void sendSimpleMail(String to, String subject, String content) {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(from);
            message.setTo(to);
            message.setSubject(subject);
            message.setText(content);

            try {
                mailSender.send(message);
                logger.info("简单邮件已经发送。");
            } catch (Exception e) {
                logger.error("发送简单邮件时发生异常！", e);
            }

        }
        public void sendHtmlMail(String to, String subject, String content) {
            MimeMessage message = mailSender.createMimeMessage();
            try {
                //true 表示需要创建一个 multipart message
                MimeMessageHelper helper = new MimeMessageHelper(message, true);
                helper.setFrom(from);
                helper.setTo(to);
                helper.setSubject(subject);
                helper.setText(content, true);

                mailSender.send(message);
                logger.info("html邮件发送成功");
            } catch (MessagingException e) {
                logger.error("发送html邮件时发生异常！", e);
            }
        }
        //注册邮件
        public void sendLoginMail(String to) {
            Context context = new Context();
            context.setVariable("id", to);
            String emailContent = templateEngine.process("emailTemplate", context);
            sendHtmlMail( to+"@csu.edu.cn" ,"这是注册邮件",emailContent);
        }
}
