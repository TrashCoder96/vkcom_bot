package com.vkbot;

import com.vkbot.config.WebConfig;
import com.vkbot.rest.CallbackController;
import com.vkbot.services.VkComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;
import java.io.IOException;

@SpringBootApplication
@ComponentScan(basePackageClasses = { WebConfig.class, CallbackController.class })
public class VkbotApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(VkbotApplication.class);
	}

	@Autowired
	private VkComponent vkComponent;

	public static void main(String[] args) {
		SpringApplication.run(VkbotApplication.class, args);
	}

	@PostConstruct
	public void post() throws IOException {

	}

}
