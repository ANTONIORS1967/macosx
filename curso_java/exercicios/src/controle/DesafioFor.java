package controle;

public class DesafioFor {

	public static void main(String[] args) {

	   String valor = "#";
		for(int i=0; i<5;i++) {
			System.out.println(valor);
			valor += "#";
			
			}
		//Versao do desafio
		//N�o pode usar valor num�rico para controlar o la�o
		
	for(String v = "#";!v.equals("####################");v +="#") {
		System.out.println(v);
			
	}

	
	}

}
