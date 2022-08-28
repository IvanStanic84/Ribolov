package edunova.util;

import java.util.List;

import edunova.model.Natjecanje;
import edunova.model.Riba;
import edunova.model.Ribic;
import edunova.model.Ulov;

public class UlovCRUD {
	public static Ulov unosNovog(List<Natjecanje> natjecanja, List<Riba> ribe, List<Ribic> ribici) {

		Ulov s = new Ulov();

		s.setSifra(Pomocno.ucitajInt("Unesite šifru ulova (pozitivni broj)", true));

		System.out.println("Popis natjecanja u aplikaciji");
		NatjecanjeCRUD.ispis(natjecanja);
		s.setNatjecanje(natjecanja.get(Pomocno.ucitajInt("Odaberi natjecanje", 1, natjecanja.size()) - 1));

		System.out.println("Popis ribièa u aplikaciji");
		RibicCRUD.ispis(ribici);
		s.setRibic(ribici.get(Pomocno.ucitajInt("Odaberi ribièa", 1, ribici.size()) - 1));

		System.out.println("Popis riba");
		RibaCRUD.ispis(ribe);
		s.setRiba(ribe.get(Pomocno.ucitajInt("Odaberi ribu", 1, ribe.size()) - 1));

		s.setMasa(Pomocno.ucitajInt("Unesi masu ulova"));

		System.out.println("");
		return s;
	}

	public static void ispis(List<Ulov> ulovi) {
		int rb = 1;
		System.out.println("");
		System.out.println("Ulovi u aplikaciji");
		for (Ulov s : ulovi) {
			System.out.println(rb++ + ". " + s.getRibic() + " " + s.getMasa() + " g ");
		}
		System.out.println("----------");
	}

	public static void promjena(Ulov s) {
		s.setSifra(Pomocno.ucitajInt("šifra (" + s.getSifra() + ")", true));

		s.setMasa(Pomocno.ucitajInt("masa ( " + s.getMasa() + ")", true));

	}

}
