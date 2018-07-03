package hotelaria;

public class CategoriaQuarto extends Super {

	String nome;

	public CategoriaQuarto(String nome) {
		super();
		this.nome = nome;
	}

	public CategoriaQuarto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
