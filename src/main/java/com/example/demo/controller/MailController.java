/**
 * 
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.component.EmailServiceImpl;
import com.example.demo.dto.MailDTO;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Alex
 *
 */
@RestController
@RequestMapping("/mail")
@Slf4j
public class MailController {
	
	@Autowired
	private EmailServiceImpl service;
	
	@PostMapping
	public void send(@RequestBody MailDTO email) {
		log.info("["+getName() + " - send] Message {}", email);
		service.sendSimpleMessage(email.getFrom(), email.getTo(), email.getSubject(), email.getMessage());
	}

	private String getName() {
		return getClass().getSimpleName();
	}

}
