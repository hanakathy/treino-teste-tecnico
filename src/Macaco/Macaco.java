package Macaco;

import java.util.ArrayList;
import java.util.List;

/*Classe Macaco:
Faça um programa e teste interativamente uma classe que modele um macaco com os atributos “nome” e “bucho” (estômago) e os métodos “comer”, “verBucho” e “digerir”.
Regras:
a) Crie 2 macacos;
b) Considere que a quantidade máxima de alimentos é 3. Com isso, lembre-se de verificar o conteúdo do estômago a cada refeição (método “comer”). Por fim, o método “digerir” deve esvaziar o bucho do Macaco;
c) Alimentos “digeríveis” devem ser do tipo String, garanta isso em seu código para que não haja nenhum Macaco canibal.*/

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

	//Métodos
	public void comer(String comida) {
		if (bucho.size() == 3) {
			System.out.println("O Bucho está cheio!");
			verBucho(bucho);
		} else {
			bucho.add(comida);
			verBucho(bucho);
		}
	}
	
	//polimorfismo: ainda não tá certo
/*	public void comer(Macaco macaco) {
		if (bucho.size() == 3) {
			System.out.println("O Bucho está cheio!");
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
			System.out.println("O Bucho está vazio!");
			verBucho(bucho);
		} else {
			bucho.remove(0);
			verBucho(bucho);
		}
	}

}
