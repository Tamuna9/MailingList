package com.example.MailingList;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/sendEmail")
public class EmailController {
@Autowired
private EmailService emailService;
    @PostMapping("toEmployees")
    public String sendEmailToEmployees(
            @RequestParam("to") String to,
            @RequestParam("subject") String subject,
            @RequestParam("text") String text,
            @RequestParam("attachment")MultipartFile multipartFile,
            HttpSession session
    ){
        try {
            emailService.sendMimeMessage(to, subject, text, multipartFile);
            return "Email sent to employee(s)";
        } catch (Exception e) {
            return "Failed to send email:" + e.getMessage();
        }

    }
    @PostMapping("toCustomers")
    public String sendEmailToCustomers(
            @RequestParam("to") String to,
            @RequestParam("subject") String subject,
            @RequestParam("text") String text,
            @RequestParam("attachment")MultipartFile multipartFile,
            HttpSession session
    ) {
        try {
            emailService.sendMimeMessage(to, subject, text, multipartFile);
            return "Email sent to customer(s)";
        } catch (Exception e) {
            return "Failed to send email:" + e.getMessage();
        }
    }
    @PostMapping("toAdministrators")
    public String sendEmailToAdministrators(
            @RequestParam("to") String to,
            @RequestParam("subject") String subject,
            @RequestParam("text") String text,
            @RequestParam("attachment")MultipartFile multipartFile,
            HttpSession session
    ){

        try {
            emailService.sendMimeMessage(to, subject, text, multipartFile);
            return "Email sent to administrator(s)";
        } catch (Exception e) {
            return "Failed to send email:" + e.getMessage();
        }
    }
}
