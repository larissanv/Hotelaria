package hotelaria;

import java.util.List;

public class Hospede extends Super {

	private String contaBanco;

	public Hospede(String nome, List<Atributo> atributos, String contaBanco) {
		super(nome, atributos);
		this.contaBanco = contaBanco;
	}

	public String getContaBanco() {
		return contaBanco;
	}

	public void setContaBanco(String contaBanco) {
		this.contaBanco = contaBanco;
	}
	
	
}
