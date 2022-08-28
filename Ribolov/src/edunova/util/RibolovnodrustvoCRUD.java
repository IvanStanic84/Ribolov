package edunova.util;

import java.util.List;

import edunova.model.Ribolovnodrustvo;

public class RibolovnodrustvoCRUD {

	public static Ribolovnodrustvo unosNovog() {

		Ribolovnodrustvo s = new Ribolovnodrustvo();
		s.setSifra(Pomocno.ucitajInt("Unesite �ifru ribolovnog dru�tva (pozitivni broj)", true));

		s.setIme(Pomocno.ucitajString("Unesi ime ribolovnog dru�tva"));
		s.setMjesto(Pomocno.ucitajString("Unesi mjesto ribolovnog dru�tva"));
		s.setOib(Pomocno.ucitajString("Unesi OIB ribolovnog dru�tva"));
		s.setIban(Pomocno.ucitajString("Unesi IBAN ribolovnog dru�tva"));
		System.out.println("");
		return s;
	}

	public static void ispis(List<Ribolovnodrustvo> ribolovnadrustva) {
		int rb = 1;
		System.out.println("");
		System.out.println("Ribolovna dru�tva u aplikaciji");
		for (Ribolovnodrustvo s : ribolovnadrustva) {
			System.out.println(rb++ + ". " + s.getIme() + " " + s.getMjesto());
		}
		System.out.println("----------");
	}

	public static void promjena(Ribolovnodrustvo s) {
		s.setSifra(Pomocno.ucitajInt("�ifra (" + s.getSifra() + ")", true));

		s.setIme(Pomocno.ucitajString("ime dru�tva ( " + s.getIme() + ")"));
		s.setMjesto(Pomocno.ucitajString("mjesto dru�tva ( " + s.getMjesto() + ")"));
		s.setOib(Pomocno.ucitajString("OIB dru�tva ( " + s.getOib() + ")"));
		s.setIban(Pomocno.ucitajString("IBAN dru�tva ( " + s.getIban() + ")"));

	}

}
