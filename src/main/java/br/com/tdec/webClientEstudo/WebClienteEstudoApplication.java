package br.com.tdec.webClientEstudo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import service.EmpresaService;

@SpringBootApplication
public class WebClienteEstudoApplication {
	
	private static WebClient client = WebClient.create();
	private static String token;
	private static EmpresaService empresaService;
	//comment
	

	public static void main(String[] args) {
		SpringApplication.run(WebClienteEstudoApplication.class, args);
		
		// Prepare the request body with username and password
		 String authorizationHeader = "Basic bWNhc3RybzpIb2RnZSQ0MDQ=";
        String requestBody = "{\"username\": \"" + "mcastro" + "\", \"password\": \"" + "Hodge$404" + "\"}";
        // Make the POST request with Basic Authentication
        String url = "http://mcastro.tdec.com.br:8880/api/v1/auth";
        String bearerToken = client.post()
                .uri(url)
                .header(HttpHeaders.AUTHORIZATION, authorizationHeader)
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(requestBody))
                .retrieve()
                .bodyToMono(String.class)
                .block();

        // Store the bearer token for future use
        System.out.println("Bearer Token: " + bearerToken);
        
        
        try {
			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode jsonNode = objectMapper.readTree(bearerToken);
			token = jsonNode.get("bearer").asText();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        
        
        client = WebClient.create();
        
        url = "http://mcastro.tdec.com.br:8880/api/v1/userinfo";
        String response = client.get()
                .uri(url)
                .header(HttpHeaders.CONTENT_TYPE, "application/json")
                .header(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate, br")
                .header(HttpHeaders.CONNECTION, "keep-alive")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        // Process the response
        System.out.println("Response: " + response);
		
		
	
		
	}
	
	public WebClient getClient() {
		return client;
	}

	

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}



	public class UserPassword {
		private String user;
		private String password;
		
		UserPassword(String user, String password) {
			this.user = user;
			this.password = password;
		}

		public String getUser() {
			return user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		
	}

}
