package edunova.model;

public class Riba extends Entitet {

	private String vrsta;

	public Riba(Integer sifra, String vrsta) {
		super(sifra);
		this.vrsta = vrsta;
	}

	public Riba() {
		super();
	}

	public String getVrsta() {
		return vrsta;
	}

	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}

}
