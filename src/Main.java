import Funcionario.Consultor;
import Funcionario.Vendedor;
import JogoCraps.craps;
import Macaco.Macaco;
import numeroReverso.NumeroReverso;

public class Main {

	public static void main(String[] args) {
		//Numero Reverso
		NumeroReverso.numeroReverso();
		
		//Classe Macaco
		Macaco macaquinho1 = new Macaco();
		Macaco macaquinho2 = new Macaco();
		
		macaquinho1.setNome("Amigo da Escola");
		macaquinho2.setNome("Caco");
		
		macaquinho1.comer("tucumã");
		macaquinho1.comer("banana");
		macaquinho1.comer("açaí");
		macaquinho1.comer("cupuaçu");
		
		macaquinho2.comer("sushi");
		macaquinho2.comer("caviar");
		macaquinho2.comer("petit gatou");
		
		System.out.println("Bucho de "+ macaquinho1.getNome());
		macaquinho1.digerir();
		macaquinho1.digerir();
		macaquinho1.digerir();
		
		System.out.println("Bucho de "+ macaquinho2.getNome());
		macaquinho2.digerir();
		macaquinho2.digerir();
		
		//DESAFIO: Fazer um macaco canibal
		Macaco macaquinho3 = new Macaco();
		macaquinho3.setNome("Hannibal");
		
		System.out.println("Bucho de "+ macaquinho3.getNome());
		macaquinho3.comer(macaquinho1.getNome());		
		macaquinho3.digerir();
		
		//Funcionario
		Vendedor vendedora = new Vendedor("Chiquinha", 123456789l, 50.0, 10);
		Consultor consultora = new Consultor("Sebastina", 987654321l, 120, 40);
		
		System.out.println("O salário da "+ vendedora.getNome() +" é: " + vendedora.calcularSalario());
		System.out.println("O salário da "+ consultora.getNome() +" é: " + consultora.calcularSalario());
		
		//Jogo de Craps
		craps.rolarDados();
	}

}
