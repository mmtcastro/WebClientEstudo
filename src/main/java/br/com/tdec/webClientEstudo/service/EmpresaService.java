package br.com.tdec.webClientEstudo.service;

import org.springframework.data.repository.CrudRepository;

import br.com.tdec.webClientEstudo.model.empresas.Vertical;

public interface EmpresaService extends CrudRepository<Vertical, String> {
	String check();

	String getEmpresaByCodigo(String codigo);

	String getGrupoEconomicoByCodigo(String codigo);

	String getCargoByCodigo(String codigo);

	String getVerticalByCodigo(String codigo);

	String getGruposEconomicos();

	String getEmpresas();

	String getCargos();

	String getVerticais();
}
