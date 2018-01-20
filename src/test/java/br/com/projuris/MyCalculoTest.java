package br.com.projuris;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MyCalculoTest {
	private List<Funcionario> listaFuncionario;
	
	@Before
	public void prepare() {
		listaFuncionario = Arrays.asList(new Funcionario("Assistente", "Administrativo", new BigDecimal("1000.0")),
				new Funcionario("Gerente", "Administrativo", new BigDecimal("7000.70")),
				new Funcionario("Diretor", "Administrativo", new BigDecimal("10000.45")),
				new Funcionario("Assistente", "Financeiro", new BigDecimal("1300.9")),
				new Funcionario("Gerente", "Financeiro", new BigDecimal("7500")), new Funcionario("Diretor", "Financeiro", new BigDecimal("11000.0")),
				new Funcionario("Estagiário", "Jurídico", new BigDecimal("700.4")),
				new Funcionario("Assistente", "Jurídico", new BigDecimal("1800.90")),
				new Funcionario("Gerente", "Jurídico", new BigDecimal("9500.50")), new Funcionario("Diretor", "Jurídico", new BigDecimal("13000.0")));
		
	}

	@Test
	public void testCustoPorCargo() throws Exception {
		final MyCalculo calculo = new MyCalculo();
		final List<CustoCargo> custoCargoList = calculo.custoPorCargo(listaFuncionario);

		assertEquals(new BigDecimal("700.4"), custoCargoList.get(0).getCusto());
		assertEquals(new BigDecimal("34000.45"), custoCargoList.get(1).getCusto());
		assertEquals(new BigDecimal("24001.20"), custoCargoList.get(2).getCusto());
		assertEquals(new BigDecimal("4101.80"), custoCargoList.get(3).getCusto());

	}

	@Test
	public void testCustoPorDepartamento() throws Exception {
		final MyCalculo calculo = new MyCalculo();
		final List<CustoDepartamento> custoDepartamentoList = calculo.custoPorDepartamento(listaFuncionario);
		
		assertEquals(new BigDecimal("25001.80"), custoDepartamentoList.get(0).getCusto());
		assertEquals(new BigDecimal("18001.15"), custoDepartamentoList.get(1).getCusto());
		assertEquals(new BigDecimal("19800.9"), custoDepartamentoList.get(2).getCusto());
		
	}
	
}
