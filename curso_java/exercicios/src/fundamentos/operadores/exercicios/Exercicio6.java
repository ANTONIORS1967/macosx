package fundamentos.operadores.exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		int a = sc.nextInt();
		
		System.out.println("Digite o valor de B:");
		int b = sc.nextInt();
		
		System.out.println("Digite o valor de C:");
		int c = sc.nextInt();
		
		int delta = (b*b)- (4*a*c);
		
		System.out.printf("Sua equação é %dx² + %dx  %dc ", a,b,c);
		
		System.out.println("\nO delte é = " +delta);
		
		double x1 = (-b + Math.sqrt(delta))/(2*a);
		System.out.printf("\nO x1 da equação é = %.2f", x1);
		
		double x2 = (-b - Math.sqrt(delta))/(2*a);
		System.out.printf("\nO x2 da equação é = %.2f", x2);
		
		
		
		sc.close();
	}

}
