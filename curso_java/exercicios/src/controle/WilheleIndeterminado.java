package controle;

import java.util.Scanner;

public class WilheleIndeterminado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("Sair")) {
			System.out.println("Voce diz: ");
			valor = sc.nextLine();
			
		}
		
		
		sc.close();
	}

}
