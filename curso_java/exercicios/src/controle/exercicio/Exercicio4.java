package controle.exercicio;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int contadoresDeDivisores = 0;
		
		System.out.println("Informe um n�mero:");
		int numero = sc.nextInt();
		
		for(int i =2; i<numero; i++) {
			if(numero%i==0) {
				contadoresDeDivisores++;
			}
			
			}
		
		if(contadoresDeDivisores==0) {
			System.out.println("\nOnumero " +numero + " � primo");
		}else {
			System.out.println("\nOnumero " +numero + " nao � primo");
		}
		sc.close();
	}

}
