package fundamentos.operadores.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Informe o peso de uma pessoa:");
		double peso = sc.nextDouble();
		
		System.out.println(" Informe o altura de uma pessoa:");
		double altura = sc.nextDouble();
		
		double imc = peso/(altura*altura);
		
		System.out.println("O IMC de uma pessoa de " +peso + "kg e altura " +altura + "m é = "+imc);
		
		
		sc.close();
	}

}
