package fundamentos.operadores.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um n�mero:");
		double num = sc.nextDouble();
		
		double quadrado = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		
		System.out.printf("O quadrado de %.0f � = %.0f ",num,  quadrado);
		System.out.printf("\nO cubo de %.0f � = %.0f ",num,  cubo);
	
		
		
		sc.close();
	}

}
