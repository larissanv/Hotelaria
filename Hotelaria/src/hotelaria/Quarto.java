package hotelaria;

import java.util.List;

public class Quarto extends Super{

	CategoriaQuarto categorias;
	int numero;
	float precoEstadia;
	
	public Quarto() {
		super();
	}

	public Quarto(CategoriaQuarto categorias, int numero, float precoEstadia) {
		super();
		this.categorias = categorias;
		this.numero = numero;
		this.precoEstadia = precoEstadia;
	}

	public CategoriaQuarto getCategorias() {
		return categorias;
	}

	public void setCategorias(CategoriaQuarto categorias) {
		this.categorias = categorias;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getPrecoEstadia() {
		return precoEstadia;
	}

	public void setPrecoEstadia(float precoEstadia) {
		this.precoEstadia = precoEstadia;
	}
}
