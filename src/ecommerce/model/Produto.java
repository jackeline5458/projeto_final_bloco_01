package ecommerce.model;

public abstract class Produto {
	private int id;
	private String nome;
	private float preco;
	private int estoque;
	private String categoria;
	
	public Produto(int id, String nome, float preco, int estoque, String categoria) {
		
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public void visualizar() {

		System.out.println("ID: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Preço: R$ " + this.preco);
		System.out.println("Estoque: " + this.estoque);
		System.out.println("Categoria: " + this.categoria);

	}
}
