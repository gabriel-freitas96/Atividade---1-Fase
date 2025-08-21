package Produto;

public class Movel extends Produto {
	private String categoria;
	private String material;

	public Movel(String codigo, String nome, double preco, String categoria, String material) {
		super(codigo, nome, preco);
		this.categoria = categoria;
		this.material = material;
	}


	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	@Override
	public void exibirInfo() {
		System.out.println("O produto:"  + super.getNome() + this.material);
	}
}
