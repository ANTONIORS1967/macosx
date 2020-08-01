package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Informaçoes do funcionário
		
		// Tipo numéricos inteiros
		byte anosDeEmpresa = 32;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos numeriocos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipos booleano
		boolean estaDeFerias = false;//true
		
		//Tipos caractere
		char status = 'A'; // ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa*365);
		
		//Números de viagens
		System.out.println(numeroDeVoos /2);
		
		//Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status " +status);
		
	}
}