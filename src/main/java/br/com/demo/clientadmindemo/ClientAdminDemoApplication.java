package br.com.demo.clientadmindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ClientAdminDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientAdminDemoApplication.class, args);
	}
}

@RestController
class Teste {

	@GetMapping("/deu-ruim")
	public String get() {
		throw new RuntimeException("Ixiiiiiiiiiiiiiiiiii DEU RUIM.");
	}
}