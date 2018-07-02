package hotelaria;

import java.util.List;

public class Quarto extends Super{

	CategoriaQuarto categorias;

	public Quarto(CategoriaQuarto categorias) {
		super();
		this.categorias = categorias;
	}

	public Quarto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategoriaQuarto getCategorias() {
		return categorias;
	}

	public void setCategorias(CategoriaQuarto categorias) {
		this.categorias = categorias;
	}

}
