package edunova.util;

import java.util.List;

import edunova.model.Riboloviste;

public class RibolovisteCRUD {
	public static Riboloviste unosNovog() {

		Riboloviste s = new Riboloviste();
		s.setSifra(Pomocno.ucitajInt("Unesite šifru ribolovišta (pozitivni broj)", true));
		s.setNaziv(Pomocno.ucitajString("Unesi naziv ribolovišta"));
		s.setVrstavode(Pomocno.ucitajString("Unesi vrstu vode"));

		System.out.println("");
		return s;
	}

	public static void ispis(List<Riboloviste> ribolovista) {
		int rb = 1;
		System.out.println("");
		System.out.println("Ribolovišta u aplikaciji");
		for (Riboloviste s : ribolovista) {
			System.out.println(rb++ + ". " + s.getNaziv());
		}
		System.out.println("----------");
	}

	public static void promjena(Riboloviste s) {
		s.setSifra(Pomocno.ucitajInt("šifra (" + s.getSifra() + ")", true));
		s.setNaziv(Pomocno.ucitajString("naziv ( " + s.getNaziv() + ")"));
		s.setVrstavode(Pomocno.ucitajString("vrsta vode ( " + s.getVrstavode() + ")"));

	}
}
