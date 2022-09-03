package edunova.util;

import java.util.List;

import edunova.model.Natjecanje;
import edunova.model.Riboloviste;

public class NatjecanjeCRUD {

	public static Natjecanje unosNovog(List<Riboloviste> ribolovista) {

		Natjecanje s = new Natjecanje();

		s.setSifra(Pomocno.ucitajInt("Unesite šifru natjecanja (pozitivni broj)", true));
		s.setVrsta(Pomocno.ucitajString("Unesi vrstu natjecanja"));
		s.setPocetak(Pomocno.ucitajDatum("Unesi datum i vrijeme poèetka"));
		s.setKraj(Pomocno.ucitajDatum("Unesi datum i vrijeme završetka"));
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
		s.setPocetak(Pomocno.ucitajDatum("poèetak ( " + s.getPocetak() + ")"));
		s.setKraj(Pomocno.ucitajDatum("kraj ( " + s.getKraj() + ")"));

	}
}
