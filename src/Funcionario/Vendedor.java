package Funcionario;

public class Vendedor extends Funcionario {
	private double comissao;
	private long numeroVendas;
	
	public Vendedor(String nome, Long cpf, double comissao, long numeroVendas) {
		super(nome, cpf);
		this.comissao = comissao;
		this.numeroVendas = numeroVendas;
	}
	
	

	@Override
	public double calcularSalario() {
		return super.SALARIO_MINIMO + (comissao*numeroVendas);
		
	}
}
