package edunova.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Natjecanje extends Entitet {

	private String vrsta;
	private Date pocetak;
	private Date kraj;
	private Riboloviste riboloviste;

	private List<Ulov> ulovi = new ArrayList<>();

	public Natjecanje(Integer sifra, String vrsta, Date pocetak, Date kraj, Riboloviste riboloviste, List<Ulov> ulovi) {
		super(sifra);
		this.vrsta = vrsta;
		this.pocetak = pocetak;
		this.kraj = kraj;
		this.riboloviste = riboloviste;
		this.ulovi = ulovi;
	}

	public Natjecanje() {
		super();
	}

	public String getVrsta() {
		return vrsta;
	}

	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}

	public Date getPocetak() {
		return pocetak;
	}

	public void setPocetak(Date pocetak) {
		this.pocetak = pocetak;
	}

	public Date getKraj() {
		return kraj;
	}

	public void setKraj(Date kraj) {
		this.kraj = kraj;
	}

	public Riboloviste getRiboloviste() {
		return riboloviste;
	}

	public void setRiboloviste(Riboloviste riboloviste) {
		this.riboloviste = riboloviste;
	}

}
