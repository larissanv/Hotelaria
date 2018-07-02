package hotelaria;

import java.util.List;

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

	public CategoriaQuarto(String nome, List<Atributo> atributos) {
		super(nome, atributos);
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
