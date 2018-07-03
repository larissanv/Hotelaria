package hotelaria;

import java.util.Date;
import java.util.List;

public abstract class Hospedagem extends Super{

	private Recepcionista recepcionista;
	private List<Hospede> hospedes;
	private Quarto quarto;
	
	public Hospedagem(Recepcionista recepcionista, List<Hospede> hospedes, Quarto quarto) {
		super();
		this.recepcionista = recepcionista;
		this.hospedes = hospedes;
		this.quarto = quarto;
	}

	public Recepcionista getRecepcionista() {
		return recepcionista;
	}

	public void setRecepcionista(Recepcionista recepcionista) {
		this.recepcionista = recepcionista;
	}

	public List<Hospede> getHospedes() {
		return hospedes;
	}

	public void setHospedes(List<Hospede> hospedes) {
		this.hospedes = hospedes;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}	

}
