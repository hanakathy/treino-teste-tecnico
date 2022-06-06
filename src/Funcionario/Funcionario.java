package Funcionario;

/*Considerando o diagrama abaixo, feito para uma empresa de vendas. Nesse contexto, utilize o conceito de Herança para remodelá-lo e implemente um programa que explore o domínio em questão:
  Regras:
	a) Crie uma classe mãe chamada Funcionario com os atributos nome, cpf (passados pelo construtor), uma constante para armazenar o valor do salário mínimo e um método abstrato “calcularSalario”;
	b) Vendedores ganham 1 salário mínimo, mais uma comissão por vendas;
	c) Consultores ganham somente pelas horas que trabalharam.
 */


public abstract class Funcionario { //abstract porque não se dá new na classe mãe, só nas filhas
	public final double SALARIO_MINIMO = 1000;
	private String nome;
	private Long cpf;
	
	
	public Funcionario(String nome, Long cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}



	//método abstrado é para obrigar as classes filhas a personalizarem o método
	public abstract double calcularSalario();
	
}
