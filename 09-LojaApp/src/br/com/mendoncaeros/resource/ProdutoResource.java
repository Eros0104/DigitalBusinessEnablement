package br.com.mendoncaeros.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.mendoncaeros.bo.ProdutoBO;
import br.com.mendoncaeros.to.ProdutoTO;

@Path("/produto")
public class ProdutoResource {
	private ProdutoBO produtoBo = new ProdutoBO();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProdutoTO> buscar() {
		return produtoBo.listar();
	}

	@GET
	@Path("/{Id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ProdutoTO buscar(@PathParam("Id") int codigo) {
		return produtoBo.buscar(codigo);
	}
}
