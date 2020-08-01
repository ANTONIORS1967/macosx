package fundamentos.operadores.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Farenheit");
		double Farenheit = sc.nextDouble();
		
		double conversao = Farenheit * 1.8 + 32;;
		System.out.printf("O valor em Celsius é =  %.0f C° " , conversao);
		
		sc.close();
	}

}
