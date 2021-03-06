package br.com.fiap.loja.bean;

public class Produto {
	int codigo;
	double preco;
	int quantidade;
	String descricao;

	public Produto(int codigo, String descricao, double preco, int quantidade) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.quantidade = quantidade;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
