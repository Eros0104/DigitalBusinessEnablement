package br.com.fiap.loja.bo;

public class EstoqueBO {
	public String getProduto(int cod) {
		return cod == 401 ? "Código 401 – Camiseta branca"
				: cod == 402 ? "Código 402 – Camiseta azul"
						: cod == 403 ? "Código 403 – Camiseta rosa" : "Outro Código – Produto não encontrado";
	}
}
