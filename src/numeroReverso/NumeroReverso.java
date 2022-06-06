package numeroReverso;

import java.util.Scanner;
import java.lang.StringBuilder;

/* Número Reverso:
Faça um programa que leia um valor inteiro (este número deverá conter 4 dígitos). A saída deverá ser o reverso de um número inteiro informado.
Exemplo: Digamos que a entrada foi 3257. A resposta será 7523.
Regras:
a) A entrada deverá estar entre 1000 e 9999;
b) Se o usuário digitar 3 dígitos ou menos, o Programa avisa que tem que conter 4 dígitos e continuar a programação até a resposta final.
*/

public class NumeroReverso {
	public static void numeroReverso () {
		//static permite que os métodos sejam chamados no Main. Só em classes assim que dá para usar o sysout
		Scanner leitor = new Scanner(System.in);
		String numeroString;
		int numeroInteiro;
		
		try {
			do {
				System.out.println("Digite o número:");
				numeroString = leitor.next();
				numeroInteiro = Integer.parseInt(numeroString);
			
				//StringBuilder dá pra usar o .reverse e inverter a ordem de uma string
				if(numeroInteiro < 1000 || numeroInteiro > 9999) {
					System.out.println("O número tem que ter 4 dígitos!");
				} else {
					StringBuilder numeroBuilder = new StringBuilder(numeroString); //sintaxe do StringBuilder
					System.out.println("Reverso: " + numeroBuilder.reverse());
					break;
				}
			}while(true);
		} catch (NumberFormatException e) {
			System.out.println("Não é um número!");
		}
	}
}
	
