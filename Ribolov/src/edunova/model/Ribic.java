package edunova.model;

public class Ribic extends Entitet {

	private String ime;
	private String prezime;
	private String oib;
	private Ribolovnodrustvo ribolovnodrustvo;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getOib() {
		return oib;
	}

	public void setOib(String oib) {
		this.oib = oib;
	}

	public Ribolovnodrustvo getRibolovnodrustvo() {
		return ribolovnodrustvo;
	}

	public void setRibolovnodrustvo(Ribolovnodrustvo ribolovnodrustvo) {
		this.ribolovnodrustvo = ribolovnodrustvo;
	}

}
