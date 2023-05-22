package service;

import org.springframework.stereotype.Service;

import repository.EmpresaRepository;

@Service
public class EmpresaServiceImpl implements EmpresaService {
	
	private final EmpresaRepository empresaRepository;

	
	public EmpresaServiceImpl(EmpresaRepository empresaRepository) {
		super();
		this.empresaRepository = empresaRepository;
	}

	@Override
	public String check() {
		return empresaRepository.check();
	}



	

}
