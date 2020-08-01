package fundamentos;


import java.util.Scanner;

public class ConversaoScanner {

	
	public static void main(String[] args) {

	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro salário:");
		String valor1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Entre com o segundo salário:");
		String valor2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Entre com o terceiro salário:");
		String valor3 = entrada.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
			
		double soma = (salario1+salario2+salario3);
		double media = soma/3;
		System.out.printf("A média do salário é: R$ "+ "%.2f",media);
		
		entrada.close();
	}

}
