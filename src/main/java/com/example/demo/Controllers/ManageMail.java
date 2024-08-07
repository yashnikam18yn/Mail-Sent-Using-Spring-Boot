package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.ManageMailService;

@RestController
public class ManageMail {
	@Autowired
	private ManageMailService manageMailService;
	
	@GetMapping("/mail")
	public void mailSent() {
		System.out.println("Controller Start...");
		manageMailService.sendEmail("Omkoli00@gmail.com", "Spring Boot", "MailSentBy Using Spring Boot");
	}
}
