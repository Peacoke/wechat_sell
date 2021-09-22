package com.work.conroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author peacoke
 * @date 2021/8/14
 */
@RestController
@RequestMapping("/email")
public class EmailController {

   /* @Resource
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String from;

    private static final String ADDRESS = "code???@163.com";*/

    /**
     * 发送普通邮件
     *
     * @return
     */
    /*@RequestMapping("/sendEmail")
    public String sendSimpleEmail() {
        try {

            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(from);
            message.setTo(ADDRESS); // 接收地址
            message.setSubject("一封简单的邮件"); // 标题
            message.setText("使用Spring Boot发送简单邮件。"); // 内容
            javaMailSender.send(message);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    *//**
     * 发送带附件的邮件
     *
     * @return
     *//*
    @RequestMapping("sendAttachmentsMail")
    public String sendAttachmentsMail() {
        MimeMessage message = null;
        try {
            message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo(ADDRESS); // 接收地址
            helper.setSubject("一封带附件的邮件"); // 标题
            helper.setText("详情参见附件内容！"); // 内容
            // 传入附件
            FileSystemResource file = new FileSystemResource(new File("src/main/resources/static/file/项目文档.docx"));
            helper.addAttachment("项目文档.docx", file);
            javaMailSender.send(message);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    *//**
     * 发送带静态资源的文件
     *
     * @return
     *//*
    @RequestMapping("sendInlineMail")
    public String sendInlineMail() {
        MimeMessage message = null;
        try {
            message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo("888888@qq.com"); // 接收地址
            helper.setSubject("一封带静态资源的邮件"); // 标题
            helper.setText("<html><body>博客图：<img src='cid:img'/></body></html>", true); // 内容
            // 传入附件
            FileSystemResource file = new FileSystemResource(new File("src/main/resources/static/img/sunshine.png"));
            helper.addInline("img", file);
            javaMailSender.send(message);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @Autowired
    private TemplateEngine templateEngine;

    *//**
     * 登录发送验证码
     *
     * @param code
     * @return
     *//*
    @RequestMapping("sendTemplateEmail")
    public String sendTemplateEmail(String code) {
        MimeMessage message = null;
        try {
            message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo("888888@qq.com"); // 接收地址
            helper.setSubject("邮件摸板测试"); // 标题
            // 处理邮件模板
            Context context = new Context();
            context.setVariable("code", code);
            String template = templateEngine.process("emailTemplate", context);
            helper.setText(template, true);
            javaMailSender.send(message);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }*/

}
