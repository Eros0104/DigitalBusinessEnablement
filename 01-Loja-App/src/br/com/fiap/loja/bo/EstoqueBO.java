package br.com.fiap.loja.bo;

public class EstoqueBO {
	public String getProduto(int cod) {
		return cod == 401 ? "C�digo 401 � Camiseta branca"
				: cod == 402 ? "C�digo 402 � Camiseta azul"
						: cod == 403 ? "C�digo 403 � Camiseta rosa" : "Outro C�digo � Produto n�o encontrado";
	}
}
