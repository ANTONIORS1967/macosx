package fundamentos.operadores.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius");
		double celsius = sc.nextDouble();
		
		double conversao = (celsius - 32)/1.8;
		System.out.printf("O valor em Farenheit é = %.0f  " , conversao);
		
		sc.close();
	}
}
