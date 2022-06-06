package numeroReverso;

import java.util.Scanner;
import java.lang.StringBuilder;

/* N�mero Reverso:
Fa�a um programa que leia um valor inteiro (este n�mero dever� conter 4 d�gitos). A sa�da dever� ser o reverso de um n�mero inteiro informado.
Exemplo: Digamos que a entrada foi 3257. A resposta ser� 7523.
Regras:
a) A entrada dever� estar entre 1000 e 9999;
b) Se o usu�rio digitar 3 d�gitos ou menos, o Programa avisa que tem que conter 4 d�gitos e continuar a programa��o at� a resposta final.
*/

public class NumeroReverso {
	public static void numeroReverso () {
		//static permite que os m�todos sejam chamados no Main. S� em classes assim que d� para usar o sysout
		Scanner leitor = new Scanner(System.in);
		String numeroString;
		int numeroInteiro;
		
		try {
			do {
				System.out.println("Digite o n�mero:");
				numeroString = leitor.next();
				numeroInteiro = Integer.parseInt(numeroString);
			
				//StringBuilder d� pra usar o .reverse e inverter a ordem de uma string
				if(numeroInteiro < 1000 || numeroInteiro > 9999) {
					System.out.println("O n�mero tem que ter 4 d�gitos!");
				} else {
					StringBuilder numeroBuilder = new StringBuilder(numeroString); //sintaxe do StringBuilder
					System.out.println("Reverso: " + numeroBuilder.reverse());
					break;
				}
			}while(true);
		} catch (NumberFormatException e) {
			System.out.println("N�o � um n�mero!");
		}
	}
}
	
