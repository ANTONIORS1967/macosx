package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota!=-1) {
			System.out.println("Digite uma nota:");
			nota = sc.nextDouble();
			
			if(nota<=10 && nota>=0) {
				total += nota;
				quantidadeDeNotas++;
			}
			
		}
		
		double media = total/quantidadeDeNotas;
		System.out.printf("A média = %.2f" , media);
		
		sc.close();
	}

}
