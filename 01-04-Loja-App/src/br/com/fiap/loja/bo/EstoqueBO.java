package br.com.fiap.loja.bo;

import org.apache.log4j.Logger;

import br.com.fiap.loja.bean.Produto;

public class EstoqueBO {
	private static Logger log = Logger.getLogger(EstoqueBO.class);

	public Produto getProduto(int cod) {
		log.debug("Código pesquisado: " + cod);
		return cod == 401 ? new Produto(401, "Camiseta branca", 50, 5)
				: cod == 402 ? new Produto(402, "Camiseta azul", 80, 6)
						: cod == 403 ? new Produto(403, "Camiseta preta", 80, 6)
								: new Produto(-1, "Produto não encontrado", 0, 0);
	}
	
	public String toString(Produto p) {
		return Integer.toString(p.getCodigo()) + " - " + p.getDescricao();
	}
}
