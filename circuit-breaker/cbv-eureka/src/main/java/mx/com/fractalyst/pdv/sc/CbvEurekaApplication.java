package mx.com.fractalyst.pdv.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CbvEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CbvEurekaApplication.class, args);
	}

}