package br.com.mendoncaeros.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.mendoncaeros.to.ProdutoTO;

public class ProdutoBO {
	public List<ProdutoTO> listar() {
		List<ProdutoTO> lista = new ArrayList<ProdutoTO>();
		for (int i = 0; i < 4; i++) {
			lista.add(new ProdutoTO(
					400+i, "Camisa " + i, i*2*i, i*10
			));
		}
		return lista;
	}
	
	public ProdutoTO buscar(int i) {
		return new ProdutoTO(400+i, "Camisa " + i, i*2*i, i*10);
	}
}
