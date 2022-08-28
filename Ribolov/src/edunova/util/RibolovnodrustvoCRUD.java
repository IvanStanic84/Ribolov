package edunova.util;

import java.util.List;

import edunova.model.Ribolovnodrustvo;

public class RibolovnodrustvoCRUD {

	public static Ribolovnodrustvo unosNovog() {

		Ribolovnodrustvo s = new Ribolovnodrustvo();
		s.setSifra(Pomocno.ucitajInt("Unesite šifru ribolovnog društva (pozitivni broj)", true));

		s.setIme(Pomocno.ucitajString("Unesi ime ribolovnog društva"));
		s.setMjesto(Pomocno.ucitajString("Unesi mjesto ribolovnog društva"));
		s.setOib(Pomocno.ucitajString("Unesi OIB ribolovnog društva"));
		s.setIban(Pomocno.ucitajString("Unesi IBAN ribolovnog društva"));
		System.out.println("");
		return s;
	}

	public static void ispis(List<Ribolovnodrustvo> ribolovnadrustva) {
		int rb = 1;
		System.out.println("");
		System.out.println("Ribolovna društva u aplikaciji");
		for (Ribolovnodrustvo s : ribolovnadrustva) {
			System.out.println(rb++ + ". " + s.getIme() + " " + s.getMjesto());
		}
		System.out.println("----------");
	}

	public static void promjena(Ribolovnodrustvo s) {
		s.setSifra(Pomocno.ucitajInt("šifra (" + s.getSifra() + ")", true));

		s.setIme(Pomocno.ucitajString("ime društva ( " + s.getIme() + ")"));
		s.setMjesto(Pomocno.ucitajString("mjesto društva ( " + s.getMjesto() + ")"));
		s.setOib(Pomocno.ucitajString("OIB društva ( " + s.getOib() + ")"));
		s.setIban(Pomocno.ucitajString("IBAN društva ( " + s.getIban() + ")"));

	}

}
