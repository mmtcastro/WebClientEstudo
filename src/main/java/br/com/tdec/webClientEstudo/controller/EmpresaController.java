package br.com.tdec.webClientEstudo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tdec.webClientEstudo.service.EmpresaServiceImpl;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
	private final EmpresaServiceImpl empresaService;

	public EmpresaController(EmpresaServiceImpl empresaService) {
		this.empresaService = empresaService;
	}

	@GetMapping("")
	public String hello() {

		return "<h1> Hello Empresa </h1>";
	}

	@GetMapping("/check")
	public String check() {

		return empresaService.check();
	}

	@GetMapping("/empresas")
	public String getEmpresas() {
		return empresaService.getEmpresas();
	}

	@GetMapping("/gruposEconomicos")
	public String getGruposEconomicos() {
		return empresaService.getGruposEconomicos();
	}

	@GetMapping("/verticais")
	public String getVerticais() {
		return empresaService.getVerticais();
	}

	public EmpresaServiceImpl getEmpresaService() {
		return empresaService;
	}
}
