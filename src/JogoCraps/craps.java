package JogoCraps;

import java.util.Random;

/*
  Jogo de Craps:
  
	Fa�a um programa que implemente um jogo de Craps. O jogador lan�a um par de dados, obtendo um valor entre 2 e 12.
	Regras:
	
	a) Se, na primeira jogada, voc� tirar 7 ou 11, voc� � um "Natural" e ganha;
	b) Se voc� tirar 2, 3 ou 12 na primeira jogada, isto � chamado de "Craps" e voc� perdeu;
	c) Se, na primeira jogada, voc� fez um 4, 5, 6, 8, 9 ou 10, este � seu "Ponto";
	d) Seu objetivo agora � continuar jogando os dados at� tirar este n�mero novamente;
	e) Voc� perde, no entanto, se tirar um 7 antes de tirar este Ponto novamente
*/

public class craps {
	public static void rolarDados() {
		int dado;
		int ponto;
		Random aleatorio = new Random(); //vari�vel para obter um numero int aleatorio
		
		
		//rodando o dado para obter numero aleatorio
		dado = aleatorio.nextInt(10) +2;
		
		//primeira jogada
		switch (dado) {
		case 7:
		case 11:
			System.out.println("Voc� tirou "+dado+"! Voc� � NATURAL! Voc� ganhou!!!");
			break;
		case 2:
		case 3:
		case 12:
			System.out.println("CRAPS! Voc� tirou "+dado+". Voc� perdeu!~");
			break;
		case 4:
		case 5:
		case 6:
		case 8:
		case 9:
		case 10:
			ponto = dado;
			System.out.println("O seu Ponto �: "+dado);
			//jogadas seguintes
			do {
				dado = aleatorio.nextInt(10) +2;
				if(dado == 7) {
					System.out.println("Voc� tirou 7. Voc� perdeu!~");
					break;
				}else if (dado == ponto){
					System.out.println("Voc� tirou seu Ponto! Voc� ganhou!!!");
					break;
				} else {
					System.out.println("Voc� tirou "+dado+". Ainda n�o � seu Ponto ("+ponto+")");
				}
			}while(true);
		}		
	}
}
