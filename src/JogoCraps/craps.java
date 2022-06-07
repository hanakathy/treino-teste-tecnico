package JogoCraps;

import java.util.Random;

/*
  Jogo de Craps:
  
	Faça um programa que implemente um jogo de Craps. O jogador lança um par de dados, obtendo um valor entre 2 e 12.
	Regras:
	
	a) Se, na primeira jogada, você tirar 7 ou 11, você é um "Natural" e ganha;
	b) Se você tirar 2, 3 ou 12 na primeira jogada, isto é chamado de "Craps" e você perdeu;
	c) Se, na primeira jogada, você fez um 4, 5, 6, 8, 9 ou 10, este é seu "Ponto";
	d) Seu objetivo agora é continuar jogando os dados até tirar este número novamente;
	e) Você perde, no entanto, se tirar um 7 antes de tirar este Ponto novamente
*/

public class craps {
	public static void rolarDados() {
		int dado;
		int ponto;
		Random aleatorio = new Random(); //variável para obter um numero int aleatorio
		
		
		//rodando o dado para obter numero aleatorio
		dado = aleatorio.nextInt(10) +2;
		
		//primeira jogada
		switch (dado) {
		case 7:
		case 11:
			System.out.println("Você tirou "+dado+"! Você é NATURAL! Você ganhou!!!");
			break;
		case 2:
		case 3:
		case 12:
			System.out.println("CRAPS! Você tirou "+dado+". Você perdeu!~");
			break;
		case 4:
		case 5:
		case 6:
		case 8:
		case 9:
		case 10:
			ponto = dado;
			System.out.println("O seu Ponto é: "+dado);
			//jogadas seguintes
			do {
				dado = aleatorio.nextInt(10) +2;
				if(dado == 7) {
					System.out.println("Você tirou 7. Você perdeu!~");
					break;
				}else if (dado == ponto){
					System.out.println("Você tirou seu Ponto! Você ganhou!!!");
					break;
				} else {
					System.out.println("Você tirou "+dado+". Ainda não é seu Ponto ("+ponto+")");
				}
			}while(true);
		}		
	}
}
