package edunova.util;

import java.util.List;

import edunova.model.Riba;

public class RibaCRUD {
	public static Riba unosNovog() {

		Riba s = new Riba();
		s.setSifra(Pomocno.ucitajInt("Unesite šifru ribe (pozitivni broj)", true));

		s.setVrsta(Pomocno.ucitajString("Unesi vrstu ribe"));

		System.out.println("");
		return s;
	}

	public static void ispis(List<Riba> ribe) {
		int rb = 1;
		System.out.println("");
		System.out.println("Ribe u aplikaciji");
		for (Riba s : ribe) {
			System.out.println(rb++ + ". " + s.getVrsta());
		}
		System.out.println("----------");
	}

	public static void promjena(Riba s) {
		s.setSifra(Pomocno.ucitajInt("šifra (" + s.getSifra() + ")", true));

		s.setVrsta(Pomocno.ucitajString("vrsta ribe ( " + s.getVrsta() + ")"));

	}
}
