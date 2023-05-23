package br.com.tdec.webClientEstudo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.tdec.webClientEstudo.model.empresas.Vertical;
import br.com.tdec.webClientEstudo.repository.EmpresaRepository;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEmpresas() {
		return empresaRepository.getEmpresas();
	}

	@Override
	public String getCargos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVerticais() {
		return empresaRepository.getVerticais();
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
	public Optional<Vertical> findById(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Vertical> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Vertical> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Vertical entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
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
