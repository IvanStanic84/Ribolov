package edunova.model;

import java.util.Date;

public class Natjecanje extends Entitet {

	private String vrsta;
	private Date pocetak;
	private Date kraj;
	private Riboloviste riboloviste;

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
