package com.email.emailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.email.emailsender.service.EmailSenderService;

@SpringBootApplication
public class EmailsenderApplication {

	@Autowired
	private EmailSenderService emailSenderService;
	
	public static void main(String[] args) {
		SpringApplication.run(EmailsenderApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail()
	{
		emailSenderService.sendSimpleEmail("javeedjune7@gmail.com", "SPRING BOOT EMAIL VERIFICATION","hello verified" );
	}

}
