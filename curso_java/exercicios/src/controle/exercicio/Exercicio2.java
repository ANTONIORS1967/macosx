package controle.exercicio;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o ano atual:");
		int ano =sc.nextInt();
		
		int biscexto = ano%4;
		if(biscexto ==0) {
			System.out.println("O ano é bisceto");
		}else {
			System.out.println("O ano nao é biscexto");
		}

		sc.close();
	}

}
