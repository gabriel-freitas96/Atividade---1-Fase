package Produto;

public class Eletrodomestico extends Produto{
	private CategoriaEletro categoria;
	private int voltagem;

	 public Eletrodomestico (String codigo, String nome, double preco, CategoriaEletro categoria, int voltagem) {
		super(codigo, nome, preco);
		this.categoria = categoria;
		this.voltagem = voltagem;
	}
	public CategoriaEletro getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaEletro categoria) {
		this.categoria = categoria;
	}


	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	@Override
	public void exibirInfo() {
		System.out.println(super.getNome() + " - " + this.categoria);
	}
}
