package controle.exercicio;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int indicadorDeDivisor = 0;
		System.out.println("Informe um númeoro para verificar se é primo");
		int numero = sc.nextInt();
		
		for(int i=2;i<numero;i++) {
			if(numero%i==0) {
				indicadorDeDivisor++;
			}
		}
		
		switch(indicadorDeDivisor) {
		case 0:
			System.out.println("O número " +numero+ " é um número primo");
			break;
		default:
			System.out.println("O número " +numero+ "  não é um número primo");
		
		}
		
		sc.close();
	}

}
