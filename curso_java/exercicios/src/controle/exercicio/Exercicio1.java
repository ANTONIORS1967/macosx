package controle.exercicio;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um n�mero:");
		int numero = sc.nextInt();
		
		if(numero >0 && numero<=10) {
			
			if(numero%2==0) {
				System.out.println("O numero "+numero +"  � par:");
			}
		}

		sc.close();
	}

}
