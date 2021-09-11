package deb.lip.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("appConfig")
@ConfigurationProperties(prefix = "demo")
public class AppConfig {

	private Map<String,String> properties = new HashMap<>() ;
}
