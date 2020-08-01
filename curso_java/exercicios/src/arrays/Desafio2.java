package arrays;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas notas: ");
		int qtdeNotas = sc.nextInt();
		
		double[] notas = new double[qtdeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota: " + (i+1) + " ");
			notas[i] =sc.nextDouble(); 
		}

		double total = 0;
		for(double nota : notas) {
			total += nota;
		}
		
		double media = total/notas.length;
		System.out.print("A m�dia �: "+ media + "  ");
		
		sc.close();

		
	}

}
