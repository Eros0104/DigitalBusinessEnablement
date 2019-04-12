import java.util.ArrayList;
import java.util.List;

public class CarrinhoBean {
	private List<ProdutoBean> listaSelecionados = new ArrayList<ProdutoBean>();
	private String quantidade;
	private String pagamento;

	public void comprar() {
		for(ProdutoBean valor : listaSelecionados)
			System.out.println(valor.getValor());	
		System.out.println("Quantidade: " + getQuantidade());
		System.out.println("Forma de pagamento: " + getPagamento());
	}	
	public CarrinhoBean() {
		super();
	}
	public List<Forma> getFormasDePagamento(){
		List<Forma> formas = new ArrayList<Forma>();
		formas.add(new Forma(1, "Crédito"));
		formas.add(new Forma(1, "Débito"));
		formas.add(new Forma(1, "Boleto"));
		return formas;
	}
	public List<ProdutoBean> getProdutos() {
		List<ProdutoBean> lista = new ArrayList<ProdutoBean>();
		lista.add(new ProdutoBean(1, "Notebook", 2500));
		lista.add(new ProdutoBean(2, "Celular", 2000));
		lista.add(new ProdutoBean(3, "Teclado", 250));
		return lista;
	}	
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getPagamento() {
		return pagamento;
	}
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
}
