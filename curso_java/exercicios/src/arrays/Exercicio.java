package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notaAlunoA = new double[4];
		System.out.println(Arrays.toString(notaAlunoA));
		
		notaAlunoA[0] = 7.9;
		notaAlunoA[1] = 8;
		notaAlunoA[2] = 6.7;
		notaAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notaAlunoA));
		System.out.println(notaAlunoA[0]);
		System.out.println(notaAlunoA[notaAlunoA.length-1]);
		//System.out.println(notaAlunoA[4]);ERRO
		
		double totalAlunoA= 0;
		for(int i = 0; i<notaAlunoA.length;i++) {
			totalAlunoA +=notaAlunoA[i];
		}
		System.out.println(totalAlunoA/notaAlunoA.length);
		
		double[] notaAlunoB = {6.9,8.9,5.9,10};
		
		double totalAlunoB= 0;
		for (int i = 0; i < notaAlunoB.length; i++) {
			totalAlunoB += notaAlunoB[i];
		}
		System.out.println(totalAlunoB/notaAlunoB.length);
	}
}
