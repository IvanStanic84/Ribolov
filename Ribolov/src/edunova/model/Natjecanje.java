package edunova.model;

import java.util.Date;

public class Natjecanje extends Entitet {
	
	private String vrsta;
	private Date od;
	private Date do;
	private Riboloviste riboloviste;
	
	
	public String getVrsta() {
		return vrsta;
	}
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	public Date getOd() {
		return od;
	}
	public void setOd(Date od) {
		this.od = od;
	}
	public Riboloviste getRiboloviste() {
		return riboloviste;
	}
	public void setRiboloviste(Riboloviste riboloviste) {
		this.riboloviste = riboloviste;
	}
	
	

}
