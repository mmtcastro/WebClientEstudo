package br.com.tdec.webClientEstudo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebClienteEstudoApplication {

	// private static WebClient webClient = WebClient.create();

//	private static String token;
//	private static EmpresaService empresaService;
	// comment

	public static void main(String[] args) {
		SpringApplication.run(WebClienteEstudoApplication.class, args);

//		// Prepare the request body with username and password
//		String authorizationHeader = "Basic bWNhc3RybzpIb2RnZSQ0MDQ=";
//		String requestBody = "{\"username\": \"" + "mcastro" + "\", \"password\": \"" + "Hodge$404" + "\"}";
//		// Make the POST request with Basic Authentication
//		String url = "http://mcastro.tdec.com.br:8880/api/v1/auth";
//		String bearerToken = webClient.post().uri(url).header(HttpHeaders.AUTHORIZATION, authorizationHeader)
//				.contentType(MediaType.APPLICATION_JSON).body(BodyInserters.fromValue(requestBody)).retrieve()
//				.bodyToMono(String.class).block();
//
//		// Store the bearer token for future use
//		System.out.println("Bearer Token: " + bearerToken);
//
//		try {
//			ObjectMapper objectMapper = new ObjectMapper();
//			JsonNode jsonNode = objectMapper.readTree(bearerToken);
//			token = jsonNode.get("bearer").asText();
//		} catch (JsonMappingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		webClient = WebClient.create();
//
//		url = "http://mcastro.tdec.com.br:8880/api/v1/userinfo";
//		String response = webClient.get().uri(url).header(HttpHeaders.CONTENT_TYPE, "application/json")
//				.header(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate, br").header(HttpHeaders.CONNECTION, "keep-alive")
//				.header(HttpHeaders.AUTHORIZATION, "Bearer " + token).retrieve().bodyToMono(String.class).block();
//
//		// Process the response
//		System.out.println("Response: " + response);

	}

}
