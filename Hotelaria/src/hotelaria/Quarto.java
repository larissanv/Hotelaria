package hotelaria;

import java.util.List;

public class Quarto extends Super{

	List<CategoriaQuarto> categorias;

	public Quarto(String nome, List<Atributo> atributos, List<CategoriaQuarto> categorias) {
		super(nome, atributos);
		this.categorias = categorias;
	}

	public List<CategoriaQuarto> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<CategoriaQuarto> categorias) {
		this.categorias = categorias;
	}	
}
