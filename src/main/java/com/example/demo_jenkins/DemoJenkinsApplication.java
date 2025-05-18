package com.example.demo_jenkins;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(ReleaserProperties.class)
@SpringBootApplication
public class DemoJenkinsApplication implements CommandLineRunner {

	private final ReleaserProperties releaserProperties;

    public DemoJenkinsApplication(ReleaserProperties releaserProperties) {
        this.releaserProperties = releaserProperties;
    }

    public static void main(String[] args) {
		SpringApplication application = new SpringApplication(DemoJenkinsApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello, Jenkins!");
		System.out.println(releaserProperties);
	}
}
