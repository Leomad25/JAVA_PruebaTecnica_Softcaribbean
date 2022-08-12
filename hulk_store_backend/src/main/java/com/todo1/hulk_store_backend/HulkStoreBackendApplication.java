package com.todo1.hulk_store_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class HulkStoreBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(HulkStoreBackendApplication.class, args);
		System.out.println("codex palabra 'test': " + new BCryptPasswordEncoder().encode("test"));
	}

}
