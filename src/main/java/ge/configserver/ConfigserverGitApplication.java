package ge.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigserverGitApplication {

	public static void main(String[] args) {

		System.setProperty("https.proxyHost", "proxy1.mia.gov.ge");
		System.setProperty("https.proxyPort", "3128");

		SpringApplication.run(ConfigserverGitApplication.class, args);
	}
}
