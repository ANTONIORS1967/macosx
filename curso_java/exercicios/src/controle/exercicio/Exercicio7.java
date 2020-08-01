package controle.exercicio;

import java.util.Scanner;


/**
 * 7. Criar um programa que enquanto estiver recebendo números positivos,
 * imprime no console a soma dos números inseridos, caso receba um número
 * negativo, encerre o programa. Tente utilizar a estrutura do while.
 */

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero =0;
		int somadorNumero = 0;
		
		while(numero >=0) {
			System.out.println("Digite um número positivo (0 ou negativo para sair)");
			numero = sc.nextInt();
			if(numero>0) {
				somadorNumero += numero;
				System.out.printf("\nSoma até o momento %d\n ", somadorNumero);
			}
			
		}

		System.out.println("Fim");
		sc.close();
	}

}
