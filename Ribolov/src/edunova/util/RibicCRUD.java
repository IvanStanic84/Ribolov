package edunova.util;

import java.util.List;

import edunova.model.Ribic;

import edunova.model.Ribolovnodrustvo;

public class RibicCRUD {
	public static Ribic unosNovog(List<Ribolovnodrustvo> ribolovnadrustva) {

		Ribic s = new Ribic();
		s.setSifra(Pomocno.ucitajInt("Unesite �ifru ribi�a (pozitivni broj)", true));
		s.setIme(Pomocno.ucitajString("Unesi ime ribi�a"));
		s.setPrezime(Pomocno.ucitajString("Unesi prezime ribi�a"));
		s.setOib(Pomocno.ucitajString("Unesi OIB ribi�a"));

		System.out.println("Popis ribolovnih dru�tava u aplikaciji");
		RibolovnodrustvoCRUD.ispis(ribolovnadrustva);
		s.setRibolovnodrustvo(
				ribolovnadrustva.get(Pomocno.ucitajInt("Odaberi ribolovno dru�tvo", 1, ribolovnadrustva.size()) - 1));

		System.out.println("");
		return s;
	}

	public static void ispis(List<Ribic> ribici) {
		int rb = 1;
		System.out.println("");
		System.out.println("Ribi�i u aplikaciji");
		for (Ribic s : ribici) {
			System.out.println(rb++ + ". " + s.getIme() + " " + s.getPrezime());
		}
		System.out.println("----------");
	}

	public static void promjena(Ribic s) {
		s.setSifra(Pomocno.ucitajInt("�ifra (" + s.getSifra() + ")", true));
		s.setIme(Pomocno.ucitajString("ime ( " + s.getIme() + ")"));
		s.setPrezime(Pomocno.ucitajString("prezime ( " + s.getPrezime() + ")"));
		s.setOib(Pomocno.ucitajString("oib ( " + s.getOib() + ")"));

	}
}