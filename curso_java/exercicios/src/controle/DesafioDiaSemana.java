package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana:");
		String diaDaSemana = sc.next();
		
		if("domingo".equalsIgnoreCase(diaDaSemana)) {
			System.out.println(1);
		}
		else if("segunda".equalsIgnoreCase(diaDaSemana)) {
			System.out.println(2);
		}
		else if("ter�a".equalsIgnoreCase(diaDaSemana)
				|| "terca".equalsIgnoreCase(diaDaSemana) ) {
			System.out.println(3);
		}
		else if("quarta".equalsIgnoreCase(diaDaSemana)) {
			System.out.println(4);
		}
		else if("quinta".equalsIgnoreCase(diaDaSemana)) {
			System.out.println(5);
		}
		else if("segunda".equalsIgnoreCase(diaDaSemana)) {
			System.out.println(6);
		}
		else if("s�bado".equalsIgnoreCase(diaDaSemana)
				|| "sabado".equalsIgnoreCase(diaDaSemana)) {
			System.out.println(7);
		}else {
			System.out.println("Dia inv�lido! ");
		}
		
		System.out.println("Fim ");
		sc.close();
	}

}
