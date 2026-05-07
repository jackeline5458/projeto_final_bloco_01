package ecommerce.model;

public class CamisetaDisney extends Produto {
	private String tamanho;
	private String personagem;
	private String universo;
	
	public CamisetaDisney(int id, String nome, float preco, int estoque, String categoria, String tamanho,
			String personagem, String universo) {
		super(id, nome, preco, estoque, categoria);
		this.tamanho = tamanho;
		this.personagem = personagem;
		this.universo = universo;
		
		
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Personagem: " + this.personagem);
		System.out.println("Universo: " + this.universo);
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getPersonagem() {
		return personagem;
	}

	public void setPersonagem(String personagem) {
		this.personagem = personagem;
	}

	public String getUniverso() {
		return universo;
	}

	public void setUniverso(String universo) {
		this.universo = universo;
	}
	
	
}
