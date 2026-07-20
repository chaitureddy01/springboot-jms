package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    private JavaMailSender javaMailSender;

    @Scheduled(cron = "10 * * * * *")
    public void sendEmail() {

        SimpleMailMessage mail = new SimpleMailMessage();

        mail.setFrom("chaitanya0010c@gmail.com");
        mail.setTo("chaitu0010c@gmail.com");
        mail.setSubject("Enrolled Successfully");
        mail.setText("Congrats on viewing Dragon Glimpse");

        javaMailSender.send(mail);

        System.out.println("Mail Sent Successfully");
    }
}