package Macaco;

import java.util.ArrayList;
import java.util.List;

/*Classe Macaco:
Fa�a um programa e teste interativamente uma classe que modele um macaco com os atributos �nome� e �bucho� (est�mago) e os m�todos �comer�, �verBucho� e �digerir�.
Regras:
a) Crie 2 macacos;
b) Considere que a quantidade m�xima de alimentos � 3. Com isso, lembre-se de verificar o conte�do do est�mago a cada refei��o (m�todo �comer�). Por fim, o m�todo �digerir� deve esvaziar o bucho do Macaco;
c) Alimentos �diger�veis� devem ser do tipo String, garanta isso em seu c�digo para que n�o haja nenhum Macaco canibal.*/

public class Macaco {
	//usar List
	//Atributos
	private String nome;
	private List<String> bucho = new ArrayList<String>();
	
	public Macaco() {
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	//M�todos
	public void comer(String comida) {
		if (bucho.size() == 3) {
			System.out.println("O Bucho est� cheio!");
			verBucho(bucho);
		} else {
			bucho.add(comida);
			verBucho(bucho);
		}
	}
	
	//polimorfismo: ainda n�o t� certo
/*	public void comer(Macaco macaco) {
		if (bucho.size() == 3) {
			System.out.println("O Bucho est� cheio!");
			verBucho(bucho);
		} else {
			bucho.add(macaco);
			verBucho(bucho);
		}
	}*/
	
	public void verBucho(List<String> bucho) {
		System.out.println(bucho);
	}
	
	public void digerir() {
		if (bucho.isEmpty()) {
			System.out.println("O Bucho est� vazio!");
			verBucho(bucho);
		} else {
			bucho.remove(0);
			verBucho(bucho);
		}
	}

}
