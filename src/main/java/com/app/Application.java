package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-oauth2-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 31/12/17
 * Time: 15.43
 * To change this template use File | Settings | File Templates.
 */

@SpringBootApplication
public class Application {

	@Autowired
	private PasswordEncoder encoder;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        System.out.println(encoder.encode("password"));
    }
}
