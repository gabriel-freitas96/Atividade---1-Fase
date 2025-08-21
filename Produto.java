package Produto;

public abstract class Produto {
	protected String codigo;
	protected String nome;
	protected double preco;

	
	public Produto(String codigo, String nome, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}
	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public abstract void exibirInfo();

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
}

