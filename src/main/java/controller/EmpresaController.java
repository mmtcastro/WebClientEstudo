package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.EmpresaServiceImpl;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
	private final EmpresaServiceImpl empresaService;
	
	@Autowired
	public EmpresaController(EmpresaServiceImpl empresaService) {
		this.empresaService = empresaService;
	}
	
	@GetMapping("/check")
	public String check() {
		
		return empresaService.check();
	}

	public EmpresaServiceImpl getEmpresaService() {
		return empresaService;
	}
}
