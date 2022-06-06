package Funcionario;

/*Considerando o diagrama abaixo, feito para uma empresa de vendas. Nesse contexto, utilize o conceito de Heran�a para remodel�-lo e implemente um programa que explore o dom�nio em quest�o:
  Regras:
	a) Crie uma classe m�e chamada Funcionario com os atributos nome, cpf (passados pelo construtor), uma constante para armazenar o valor do sal�rio m�nimo e um m�todo abstrato �calcularSalario�;
	b) Vendedores ganham 1 sal�rio m�nimo, mais uma comiss�o por vendas;
	c) Consultores ganham somente pelas horas que trabalharam.
 */


public abstract class Funcionario { //abstract porque n�o se d� new na classe m�e, s� nas filhas
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



	//m�todo abstrado � para obrigar as classes filhas a personalizarem o m�todo
	public abstract double calcularSalario();
	
}
