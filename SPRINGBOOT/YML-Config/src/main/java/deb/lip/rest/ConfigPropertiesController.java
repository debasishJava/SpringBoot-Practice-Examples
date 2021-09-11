package deb.lip.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import deb.lip.config.AppConfig;
import deb.lip.config.AppConstants;

@RestController
public class ConfigPropertiesController {

	@Autowired
	private AppConfig config;
	
	@GetMapping("/welcome")
	public String welcome() {
		return config.getProperties().get(AppConstants.WELCOME_MSG) ;
	}
	
	@GetMapping("/greet")
	public String greet() {
		return config.getProperties().get(AppConstants.GREET_MSG) ;
	}
	
	@GetMapping("/msg")
	public String message() {
		return config.getProperties().get(AppConstants.PLAIN_MSG) ;
	}
}
