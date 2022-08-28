package edunova.util;

import java.util.List;

import edunova.model.Ulov;

public class UlovCRUD {
	public static Ulov unosNovog() {

		Ulov s = new Ulov();
		s.setSifra(Pomocno.ucitajInt("Unesite šifru ulova (pozitivni broj)", true));
		s.setVrsta(Pomocno.ucitajString("Unesi ulov"));

		// dodati ostalo
		System.out.println("");
		return s;
	}

	public static void ispis(List<Natjecanje> natjecanja) {
		int rb = 1;
		System.out.println("");
		System.out.println("Natjecanja u aplikaciji");
		for (Natjecanje s : natjecanja) {
			System.out.println(rb++ + ". " + s.getVrsta());
		}
		System.out.println("----------");
	}

	public static void promjena(Natjecanje s) {
		s.setSifra(Pomocno.ucitajInt("šifra (" + s.getSifra() + ")", true));
		s.setVrsta(Pomocno.ucitajString("vrsta ( " + s.getVrsta() + ")"));

		// dodati ostalo
	}

}
