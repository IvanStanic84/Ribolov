package edunova.util;

import java.util.List;

import edunova.model.Ribic;

import edunova.model.Ribolovnodrustvo;

public class RibicCRUD {
	public static Ribic unosNovog(List<Ribolovnodrustvo> ribolovnadrustva) {

		Ribic s = new Ribic();
		s.setSifra(Pomocno.ucitajInt("Unesite šifru ribièa (pozitivni broj)", true));
		s.setIme(Pomocno.ucitajString("Unesi ime ribièa"));
		s.setPrezime(Pomocno.ucitajString("Unesi prezime ribièa"));
		s.setOib(Pomocno.ucitajString("Unesi OIB ribièa"));

		System.out.println("Popis ribolovnih društava u aplikaciji");
		RibolovnodrustvoCRUD.ispis(ribolovnadrustva);
		s.setRibolovnodrustvo(
				ribolovnadrustva.get(Pomocno.ucitajInt("Odaberi ribolovno društvo", 1, ribolovnadrustva.size()) - 1));

		System.out.println("");
		return s;
	}

	public static void ispis(List<Ribic> ribici) {
		int rb = 1;
		System.out.println("");
		System.out.println("Ribièi u aplikaciji");
		for (Ribic s : ribici) {
			System.out.println(rb++ + ". " + s.getIme() + " " + s.getPrezime());
		}
		System.out.println("----------");
	}

	public static void promjena(Ribic s) {
		s.setSifra(Pomocno.ucitajInt("šifra (" + s.getSifra() + ")", true));
		s.setIme(Pomocno.ucitajString("ime ( " + s.getIme() + ")"));
		s.setPrezime(Pomocno.ucitajString("prezime ( " + s.getPrezime() + ")"));
		s.setOib(Pomocno.ucitajString("oib ( " + s.getOib() + ")"));

	}
}