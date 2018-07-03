package hotelaria;

public class Recepcionista extends Super{
	
	String nome;

	public Recepcionista(String nome) {
		super();
		this.nome = nome;
	}

	public Recepcionista() {
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
