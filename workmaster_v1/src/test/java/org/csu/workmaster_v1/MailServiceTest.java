package org.csu.workmaster_v1;


import org.csu.workmaster_v1.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {

        @Autowired
        private org.csu.workmaster_v1.service.MailService mailService;

        @Autowired
        private TemplateEngine templateEngine;

        @Test
        public void testSimpleMail() throws Exception {
            mailService.sendSimpleMail("shuxinwork@gmail.com","这是一封简单邮件","大家好，这是我的第一封邮件！");
        }

        //测试通过
        @Test
        public void testHtmlMail() throws Exception {
                String content="<html>\n" +
                        "<body>\n" +
                        "    <h3>hello world ! 这是一封html邮件!</h3>\n" +
                        "</body>\n" +
                        "</html>";
                mailService.sendHtmlMail("2532582379@qq.com","这是一封HTML邮件",content);
        }
        @Test
        public void sendTemplateMail() {
               /* //创建邮件正文
                Context context = new Context();
                context.setVariable("id", "006");
                String emailContent = templateEngine.process("emailTemplate", context);
                mailService.sendHtmlMail("2532582379@qq.com","主题：这是模板邮件",emailContent);*/
                mailService.sendLoginMail("3901160202");
        }

}
