[![codecov](https://codecov.io/gh/DiegoSouzaDev/Robots/branch/master/graph/badge.svg)](https://codecov.io/gh/DiegoSouzaDev/Robots)

# Projuris
A resolução dos desafios foram implementadas com Java 8, para os testes foi utilizado o JUnit e para gerenciar a build foi utilizado o Maven.


## Desafios

Realizar a implementação dos 3 desafios propostos utilizando em seu código somente as bibliotecas nativas do Java.

**1º desafio:**
* Dados dois arrays, implementar um método que encontre a ocorrência do segundo array dentro  do primeiro.
* O valor retornado deve ser a posição deste valor no primeiro array.
* Se houver mais de uma ocorrência, deve retornar a última ocorrência.
* Caso não tenha nenhuma ocorrência, o retorno deve ser -1.
* Deve ser implementado uma interface com o nome `FindArray` no pacote `br.com.projuris;`, contendo o método `int findArray(int[] array, int[] subArray);`.
* O nome da classe que implementa esta Interface deve ser `MyFindArray` sob o pacote `br.com.projuris`.

Exemplo de Testes:

Dado os arrays `[4,9,3,7,8]` e `[3,7]` deve retornar `2`.
Dado os arrays `[1,3,5]` e `[1]` deve retornar `0`.
Dado os arrays `[7,8,9]` e `[8,9,10]` deve retornar `-1`.
Dado os arrays `[4,9,3,7,8,3,7,1]` e `[3,7]` deve retornar `5`.
 
**2º desafio:**
* Dado uma String, retornar a primeira letra não duplicada na palavra.
* Deve ser implementado uma interface `FindCharachter` no pacote `package br.com.projuris;`, contendo o método `char findChar(String word);`.
* O nome da classe que implementa esta Interface deve ser `MyFindChar` sob o pacote `com.br.projuris`

Exemplo de testes:

Demonstração:
Dado a String `“stress”`, deve retornar `“t”`.
Dado a String `“reembolsar”` deve retornar `“m”`.
Caso não exista nenhuma letra não repetida na String, deve retornar `‘ ’` (espaço em branco).
 
**3º desafio:**
* Dado uma lista de funcionários, seu salário e departamento e cargo, calcule o *Custo total por departamento* e o *Custo total por cargo*.
* Cada funcionário tem um `departamento`. `String`
* Cada funcionário tem um `salário`. `BigDecimal`
* Cada funcionário tem um `cargo`. `String`
* O retorno deve ser calculado pela classe MyCalculo, que implementa a interface `Calculo`.
* A interface `Calculo` deve possuir os metodos `public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios);`
e `public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios);`
* O retorno deve ser uma lista do objeto que representa o cálculo realizado (`CustoDepartamento` ou `CustoCargo`)
* Todas as classes devem estar sob o pacote `br.com.projuris`

 
Exemplo de Lista de Funcionários:

		Funcionario funcionario1 = new Funcionario("Assistente", "Administrativo", new BigDecimal(1000.0));
		Funcionario funcionario2 = new Funcionario("Gerente", "Administrativo", new BigDecimal(7000.70));
		Funcionario funcionario3 = new Funcionario("Diretor", "Administrativo", new BigDecimal(10000.45));
		Funcionario funcionario4 = new Funcionario("Assistente", "Financeiro", new BigDecimal(1300.9));
		Funcionario funcionario5 = new Funcionario("Gerente", "Financeiro", new BigDecimal(7500));
		Funcionario funcionario6 = new Funcionario("Diretor", "Financeiro", new BigDecimal(11000.0));
		Funcionario funcionario7 = new Funcionario("Estagiário", "Jurídico", new BigDecimal(700.4));
		Funcionario funcionario8 = new Funcionario("Assistente", "Jurídico", new BigDecimal(1800.90));
		Funcionario funcionario9 = new Funcionario("Gerente", "Jurídico", new BigDecimal(9500.50));
		Funcionario funcionario10 = new Funcionario("Diretor", "Jurídico", new BigDecimal(13000.0));
		
		List<Funcionario> listaFuncionario = new ArrayList<>();
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

		

### EXECUTANDO OS TESTES
Para que os testes sejam executados, basta acessar a pasta raiz do projeto, abrir o CMD e executar o comando `mvn test`.
Feito isso, o maven baixará as dependencias e executará os testes.

Outra opção é executar os testes pela IDE, executando-os com jUnit (`Run As` -> `jUnit test`).


