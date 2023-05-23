package br.com.tdec.webClientEstudo.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.tdec.webClientEstudo.model.empresas.Vertical;

@Repository
public class EmpresaRepositoryImpl implements EmpresaRepository {

	@Autowired
	private final WebClient webClient;
	private String token;

	public EmpresaRepositoryImpl(WebClient webClient) {
		this.webClient = webClient;
		authenticate();
	}

	private void authenticate() {
		String authorizationHeader = "Basic bWNhc3RybzpIb2RnZSQ0MDQ=";
		String requestBody = "{\"username\": \"" + "mcastro" + "\", \"password\": \"" + "Hodge$404" + "\"}";
		// Make the POST request with Basic Authentication
		String url = "http://mcastro.tdec.com.br:8880/api/v1/auth";
		token = webClient.post().uri(url).header(HttpHeaders.AUTHORIZATION, authorizationHeader)
				.contentType(MediaType.APPLICATION_JSON).body(BodyInserters.fromValue(requestBody)).retrieve()
				.bodyToMono(String.class).block();

		// Store the bearer token for future use
		System.out.println("Bearer Token: " + token);

	}

	@Override
	public String check() {
		return webClient.get().uri("http://mcastro.tdec.com.br:8880/api").retrieve().bodyToMono(String.class).block();
	}

	public WebClient getWebClient() {
		return webClient;
	}

	@Override
	public String getEmpresaByCodigo(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGrupoEconomicoByCodigo(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCargoByCodigo(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVerticalByCodigo(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGruposEconomicos() {
		String uri = "http://mcastro.tdec.com.br:8880/api/v1/lists/GruposEconomicos?dataSource=empresas&count=100&scope=documents";
		String response = webClient.get().uri(uri).header(HttpHeaders.CONTENT_TYPE, "application/json")
				.header(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate, br").header(HttpHeaders.CONNECTION, "keep-alive")
				.header(HttpHeaders.AUTHORIZATION, "Bearer " + getTokenOnly()).retrieve().bodyToMono(String.class)
				.block();
		return response;
	}

	@Override
	public String getEmpresas() {
		String uri = "http://mcastro.tdec.com.br:8880/api/v1/lists/GruposEconomicos?dataSource=empresas&count=100&scope=documents";
		String response = webClient.get().uri(uri).header(HttpHeaders.CONTENT_TYPE, "application/json")
				.header(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate, br").header(HttpHeaders.CONNECTION, "keep-alive")
				.header(HttpHeaders.AUTHORIZATION, "Bearer " + getTokenOnly()).retrieve().bodyToMono(String.class)
				.block();
		return response;
	}

	public String getTokenOnly() {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode jsonNode = objectMapper.readTree(token);
			token = jsonNode.get("bearer").asText();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return token;
	}

	@Override
	public String getCargos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVerticais() {
		String uri = "http://mcastro.tdec.com.br:8880/api/v1/lists/Verticais?dataSource=empresas&scope=documents";
		String response = webClient.get().uri(uri).header(HttpHeaders.CONTENT_TYPE, "application/json")
				.header(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate, br").header(HttpHeaders.CONNECTION, "keep-alive")
				.header(HttpHeaders.AUTHORIZATION, "Bearer " + getTokenOnly()).retrieve().bodyToMono(String.class)
				.block();
		return response;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public <S extends Vertical> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Vertical> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Vertical> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Vertical> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Vertical> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Vertical entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Vertical> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
