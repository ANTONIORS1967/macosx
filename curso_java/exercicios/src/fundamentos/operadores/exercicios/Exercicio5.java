package fundamentos.operadores.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Infore a base do tri�ngulo:");
		double base = sc.nextDouble();
		
		System.out.println("Infore a altura do tri�ngulo:");
		double altura = sc.nextDouble();
		
		double area = (base*altura)/2;
		
		System.out.printf("A �rea � = %.0f",area);
		
		sc.close();
	}

}
