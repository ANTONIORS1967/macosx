package fundamentos.operadores.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Infore a base do triângulo:");
		double base = sc.nextDouble();
		
		System.out.println("Infore a altura do triângulo:");
		double altura = sc.nextDouble();
		
		double area = (base*altura)/2;
		
		System.out.printf("A área é = %.0f",area);
		
		sc.close();
	}

}
