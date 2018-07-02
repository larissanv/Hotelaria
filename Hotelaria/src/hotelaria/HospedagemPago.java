package hotelaria;

import java.util.List;

public class HospedagemPago extends Hospedagem {
	
	public HospedagemPago(Recepcionista recepcionista, List<Hospede> hospedes, Quarto quarto) {
		super(recepcionista, hospedes, quarto);
		// TODO Auto-generated constructor stub
	}

	public HospedagemPago(String nome, List<Atributo> atributos, Recepcionista recepcionista, List<Hospede> hospedes,
			Quarto quarto) {
		super(nome, atributos, recepcionista, hospedes, quarto);
		// TODO Auto-generated constructor stub
	}

}
