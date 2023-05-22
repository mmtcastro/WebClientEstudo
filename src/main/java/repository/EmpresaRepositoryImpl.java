package repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

@Repository
public class EmpresaRepositoryImpl implements EmpresaRepository {
	
	private final WebClient webClient;
	
	public EmpresaRepositoryImpl(WebClient webClient) {
		this.webClient = webClient;
	}

	@Override
	public String check() {
		return webClient.get()
                .uri("http://mcastro.tdec.com.br:8880/api")
                .retrieve()
                .bodyToMono(String.class)
                .block();
	}

	public WebClient getWebClient() {
		return webClient;
	}

}
