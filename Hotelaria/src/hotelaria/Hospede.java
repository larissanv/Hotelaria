package hotelaria;

public class Hospede extends Pessoa {

	int numQuarto;
	double conta;
	
	public void checkin(){}
	public void checkout(){}
	
	public int getNumQuarto() {
		return numQuarto;
	}
	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}
	public double getConta() {
		return conta;
	}
	public void setConta(double conta) {
		this.conta = conta;
	}
}
