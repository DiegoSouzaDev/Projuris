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
				final BigDecimal newCost = calculatedNewCostByRole(funcionario, custoCargo);
				custoCargo.setCusto(newCost);
			}
			map.put(funcionario.getCargo(), custoCargo);
		}

		return new ArrayList<CustoCargo>(map.values());
		
	}

	private BigDecimal calculatedNewCostByRole(final Funcionario funcionario, final CustoCargo custoCargo) {
		return custoCargo.getCusto().add(funcionario.getSalario());
	}
	
	public List<CustoDepartamento> custoPorDepartamento(final List<Funcionario> funcionarios) {
		return null;
	}
	
}
