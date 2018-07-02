package hotelaria;

import java.util.ArrayList;
import java.util.List;

public class Super {

	String nome;
	private List<Atributo> atributos;
	
	public Super() {
		this.nome = "";
		this.atributos = new ArrayList<Atributo>();
	}

	public Super(String nome, List<Atributo> atributos) {
		this.nome = nome;
		this.atributos = atributos;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Atributo> getAtributos() {
		return atributos;
	}
	public void setAtributos(List<Atributo> atributos) {
		this.atributos = atributos;
	}	

}
