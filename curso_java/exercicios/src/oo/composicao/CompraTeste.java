package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Jo�o Pedro";
		
		compra1.adicionarItem("Caneta", 70, 2.89);
		compra1.adicionarItem("Borracha", 30, 1.70);
		compra1.adicionarItem("Caderno", 10, 5.80);
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
		//S� pra mostrar a rela��o bidirecional
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.println("O valor total � " + total);
		
	}
}