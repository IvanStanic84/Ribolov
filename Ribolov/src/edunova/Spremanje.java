package edunova;

import java.util.List;

import edunova.model.Natjecanje;
import edunova.model.Riba;
import edunova.model.Ribic;
import edunova.model.Riboloviste;
import edunova.model.Ribolovnodrustvo;
import edunova.model.Ulov;

public class Spremanje {
	private List<Natjecanje> natjecanja;
	private List<Riboloviste> ribolovista;
	private List<Ribolovnodrustvo> ribolovnadrustva;
	private List<Riba> ribe;
	private List<Ribic> ribici;
	private List<Ulov> ulovi;

	public List<Natjecanje> getNatjecanja() {
		return natjecanja;
	}

	public void setNatjecanja(List<Natjecanje> natjecanja) {
		this.natjecanja = natjecanja;
	}

	public List<Riboloviste> getRibolovista() {
		return ribolovista;
	}

	public void setRibolovista(List<Riboloviste> ribolovista) {
		this.ribolovista = ribolovista;
	}

	public List<Ribolovnodrustvo> getRibolovnadrustva() {
		return ribolovnadrustva;
	}

	public void setRibolovnadrustva(List<Ribolovnodrustvo> ribolovnadrustva) {
		this.ribolovnadrustva = ribolovnadrustva;
	}

	public List<Riba> getRibe() {
		return ribe;
	}

	public void setRibe(List<Riba> ribe) {
		this.ribe = ribe;
	}

	public List<Ribic> getRibici() {
		return ribici;
	}

	public void setRibici(List<Ribic> ribici) {
		this.ribici = ribici;
	}

	public List<Ulov> getUlovi() {
		return ulovi;
	}

	public void setUlovi(List<Ulov> ulovi) {
		this.ulovi = ulovi;
	}
}