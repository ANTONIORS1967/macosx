package controle.exercicio;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int indicadorDeDivisor = 0;
		System.out.println("Informe um n�meoro para verificar se � primo");
		int numero = sc.nextInt();
		
		for(int i=2;i<numero;i++) {
			if(numero%i==0) {
				indicadorDeDivisor++;
			}
		}
		
		switch(indicadorDeDivisor) {
		case 0:
			System.out.println("O n�mero " +numero+ " � um n�mero primo");
			break;
		default:
			System.out.println("O n�mero " +numero+ "  n�o � um n�mero primo");
		
		}
		
		sc.close();
	}

}
