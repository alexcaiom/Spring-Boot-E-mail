/**
 * 
 */
package com.example.demo.config;

import java.util.Properties;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * @author Alex
 *
 */
@SpringBootConfiguration
public class Config {
	
	@Bean
	public JavaMailSender getJavaMailSender() {
	    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
	    mailSender.setHost("mail.<mail_host>.com.br");
	    mailSender.setPort(587);
	    
	    mailSender.setUsername("no_reply@<mail_host>.com");
	    mailSender.setPassword("<password>");
	    
	    Properties props = mailSender.getJavaMailProperties();
	    props.put("mail.transport.protocol", "smtp");
//	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.smtp.starttls.trust", "*");
	    props.put("mail.smtp.ssl.trust", "mail.<mail_host>.com.br");
	    props.put("mail.debug", "true");
	    mailSender.setJavaMailProperties(props);
	    
	    return mailSender;
	}

}
