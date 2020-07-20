package org.devops.cicdpipeline;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdPipelineApplication {
	
	private static final Logger log = LoggerFactory.getLogger(CicdPipelineApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CicdPipelineApplication.class, args);
	}

}
