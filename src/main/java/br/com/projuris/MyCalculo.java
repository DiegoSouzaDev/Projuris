package br.com.projuris;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyCalculo implements Calculo {

	public List<CustoCargo> custoPorCargo(final List<Funcionario> funcionarios) {
		final Map<String, CustoCargo> map = new HashMap<String, CustoCargo>();

		for (final Funcionario funcionario : funcionarios) {
			CustoCargo custoCargo = map.get(funcionario.getCargo());

			if (custoCargo == null) {
				custoCargo = new CustoCargo();
				custoCargo.setCargo(funcionario.getCargo());
				custoCargo.setCusto(funcionario.getSalario());
			} else {
				final BigDecimal novoCusto = calculaNovoCustoPorCargo(funcionario, custoCargo);
				custoCargo.setCusto(novoCusto);
			}
			map.put(funcionario.getCargo(), custoCargo);
		}

		return new ArrayList<CustoCargo>(map.values());
	}
	
	public List<CustoDepartamento> custoPorDepartamento(final List<Funcionario> funcionarios) {
		final Map<String, CustoDepartamento> map = new HashMap<String, CustoDepartamento>();

		for (final Funcionario funcionario : funcionarios) {
			CustoDepartamento custoDepartamento = map.get(funcionario.getDepartamento());
			
			if (custoDepartamento == null) {
				custoDepartamento = new CustoDepartamento();
				custoDepartamento.setDepartamento(funcionario.getDepartamento());
				custoDepartamento.setCusto(funcionario.getSalario());
			} else {
				final BigDecimal novoCusto = calculaNovoCustoPorDepartmento(funcionario, custoDepartamento);
				custoDepartamento.setCusto(novoCusto);
			}
			map.put(funcionario.getDepartamento(), custoDepartamento);
		}
		
		return new ArrayList<CustoDepartamento>(map.values());
	}

	private BigDecimal calculaNovoCustoPorCargo(final Funcionario funcionario, final CustoCargo custoCargo) {
		return custoCargo.getCusto().add(funcionario.getSalario());
	}
	
	private BigDecimal calculaNovoCustoPorDepartmento(Funcionario funcionario, CustoDepartamento custoDepartamento) {
		return custoDepartamento.getCusto().add(funcionario.getSalario());
	}

}
