package edunova.model;

public class Riboloviste extends Entitet {

	private String naziv;
	private String vrstavode;

	public Riboloviste(Integer sifra, String naziv, String vrstavode) {
		super(sifra);
		this.naziv = naziv;
		this.vrstavode = vrstavode;
	}

	public Riboloviste() {
		super();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getVrstavode() {
		return vrstavode;
	}

	public void setVrstavode(String vrstavode) {
		this.vrstavode = vrstavode;
	}

}
