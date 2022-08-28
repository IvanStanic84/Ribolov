package edunova.util;

import java.util.List;

import edunova.model.Natjecanje;
import edunova.model.Riboloviste;

public class NatjecanjeCRUD {

	public static Natjecanje unosNovog(List<Riboloviste> ribolovista) {

		Natjecanje s = new Natjecanje();
		s.setSifra(Pomocno.ucitajInt("Unesite šifru natjecanja (pozitivni broj)", true));
		s.setVrsta(Pomocno.ucitajString("Unesi vrstu natjecanja"));
		// s.setPocetak(Pomocno.ucitajString("Unesi vrstu natjecanja"));
		// s.setKraj(Pomocno.ucitajString("Unesi vrstu natjecanja"));

		System.out.println("Popis ribolovišta u aplikaciji");
		RibolovisteCRUD.ispis(ribolovista);
		s.setRiboloviste(ribolovista.get(Pomocno.ucitajInt("Odaberi ribolovište", 1, ribolovista.size()) - 1));

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
		// s.setPocetak(Pomocno.ucitajString("poèetak ( " + s.getPocetak() + ")"));
		// s.setKraj(Pomocno.ucitajString("kraj ( " + s.getKraj() + ")"));

	}
}
