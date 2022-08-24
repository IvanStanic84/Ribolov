package edunova.model;

public class Ulov extends Entitet {

	private Natjecanje natjecanje;
	private Ribic ribic;
	private Riba riba;
	private Integer masa;

	public Natjecanje getNatjecanje() {
		return natjecanje;
	}

	public void setNatjecanje(Natjecanje natjecanje) {
		this.natjecanje = natjecanje;
	}

	public Ribic getRibic() {
		return ribic;
	}

	public void setRibic(Ribic ribic) {
		this.ribic = ribic;
	}

	public Riba getRiba() {
		return riba;
	}

	public void setRiba(Riba riba) {
		this.riba = riba;
	}

	public Integer getMasa() {
		return masa;
	}

	public void setMasa(Integer masa) {
		this.masa = masa;
	}

}
