import java.util.ArrayList;
import java.util.List;

public class CarrinhoBean {
	private List<ProdutoBean> produto = new ArrayList<ProdutoBean>();	
	private int quantidade;
	private double valor;
	public CarrinhoBean(List<ProdutoBean> produto, int quantidade, double valor) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	public CarrinhoBean() {
		super();
	}
	public List<ProdutoBean> getProduto() {
		return produto;
	}
	public void setProduto(List<ProdutoBean> produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}	
}
