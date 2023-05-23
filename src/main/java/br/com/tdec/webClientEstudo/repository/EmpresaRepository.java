package br.com.tdec.webClientEstudo.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.tdec.webClientEstudo.model.empresas.Vertical;

public interface EmpresaRepository extends CrudRepository<Vertical, Long> {
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
