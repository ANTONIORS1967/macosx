package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {

		//Trabalho na tarça (V ou F)
		//Trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		
		//Operador Unario
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("\nComprou TV 50\"?" + comprouTV50);
		System.out.println("\nComprou TV 32\"?" + comprouTV32);
		System.out.println("\nComprou TV 32\"Sorvete?" + comprouSorvete);
		System.out.println("\nMais saudável? "+ maisSaudavel);
		
		
	}

}
