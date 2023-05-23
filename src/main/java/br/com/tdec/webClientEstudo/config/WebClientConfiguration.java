package br.com.tdec.webClientEstudo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfiguration {

	@Bean
	public WebClient webClient() {

		WebClient webClient = WebClient.create();
		// Prepare the request body with username and password

		return webClient;
	}
}
