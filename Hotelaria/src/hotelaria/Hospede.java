package hotelaria;

import java.util.List;

public class Hospede extends Super {

	private String contaBanco;
	private String nome;
	
	public Hospede(String contaBanco, String nome) {
		super();
		this.contaBanco = contaBanco;
		this.nome = nome;
	}

	public Hospede() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hospede(String nome, List<Atributo> atributos) {
		super(nome, atributos);
		// TODO Auto-generated constructor stub
	}

	public String getContaBanco() {
		return contaBanco;
	}

	public void setContaBanco(String contaBanco) {
		this.contaBanco = contaBanco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
	
}
