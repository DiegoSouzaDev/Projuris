package br.com.projuris;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MyCalculoTest {
	private List<Funcionario> listaFuncionario;
	
	@Before
	public void prepare() {
		listaFuncionario = new ArrayList<Funcionario>();
		final Funcionario funcionario1 = new Funcionario("Assistente", "Administrativo", new BigDecimal("1000.0"));
		final Funcionario funcionario2 = new Funcionario("Gerente", "Administrativo", new BigDecimal("7000.70"));
		final Funcionario funcionario3 = new Funcionario("Diretor", "Administrativo", new BigDecimal("10000.45"));
		final Funcionario funcionario4 = new Funcionario("Assistente", "Financeiro", new BigDecimal("1300.9"));
		final Funcionario funcionario5 = new Funcionario("Gerente", "Financeiro", new BigDecimal("7500"));
		final Funcionario funcionario6 = new Funcionario("Diretor", "Financeiro", new BigDecimal("11000.0"));
		final Funcionario funcionario7 = new Funcionario("Estagiário", "Jurídico", new BigDecimal("700.4"));
		final Funcionario funcionario8 = new Funcionario("Assistente", "Jurídico", new BigDecimal("1800.90"));
		final Funcionario funcionario9 = new Funcionario("Gerente", "Jurídico", new BigDecimal("9500.50"));
		final Funcionario funcionario10 = new Funcionario("Diretor", "Jurídico", new BigDecimal("13000.0"));

		listaFuncionario.add(funcionario1);
		listaFuncionario.add(funcionario2);
		listaFuncionario.add(funcionario3);
		listaFuncionario.add(funcionario4);
		listaFuncionario.add(funcionario5);
		listaFuncionario.add(funcionario6);
		listaFuncionario.add(funcionario7);
		listaFuncionario.add(funcionario8);
		listaFuncionario.add(funcionario9);
		listaFuncionario.add(funcionario10);

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
