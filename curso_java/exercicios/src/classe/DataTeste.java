package classe;


public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data();
		d1.ano = 2025;
		
		var d2 = new Data(15,7,2020);
		
		String obterDataFormatada1 = d1.obterDataFormatada();
		String obterDataFormatada2 = d2.obterDataFormatada();

		System.out.println(obterDataFormatada1);
		System.out.println(obterDataFormatada2);
		
		d1.imprimerDataFormatada();
		d2.imprimerDataFormatada();
		d1.imprimerDataFormatada();
		
		
	}

}
