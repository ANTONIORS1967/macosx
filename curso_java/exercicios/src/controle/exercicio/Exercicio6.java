package controle.exercicio;

import java.util.Random;
import java.util.Scanner;

/**
 * 6. Jogo da adivinhacão: Tentar adivinhar um número entre 0 - 100. Armazene
 * um número aleatório em uma variável. O Jogador tem 10 tentativas para
 * adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade
 * de tentativas restantes, e imprima se o número inserido é maior ou menor do
 * que o número armazenado.
 */
public class Exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;
		
		do{
			System.out.println("Sorteando um númro entre 0-100");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			
			System.out.println("Começou o jogo, será que consegue me vencer?");
			tentativas =0;
			
			do {
				tentativas++;
				System.out.printf("Tentativas %d ", tentativas);
				numero = sc.nextInt();
				if(numero>numeroSorteado) {
					System.out.printf("Numero sorteado é menor que %d \n\n ", numero);
					
				}else if(numero<numeroSorteado) {
					System.out.printf("Numero sorteado é maior que %d \n\n ", numero);
				}else {
					System.out.printf("\nParabéns você acertou o numero em %d tentativas \n\n", tentativas);
				}
				
			}while(numero !=numeroSorteado);
			
			System.out.println("Digite 0 para sair ou qualquer outro número para continar");
			continuar = sc.nextInt();
			
		}while(continuar !=0);

		sc.close();
	}

}
