package edunova.util;

import java.util.List;

import edunova.model.Natjecanje;
import edunova.model.Riboloviste;

public class NatjecanjeCRUD {

	public static Natjecanje unosNovog(List<Riboloviste> ribolovista) {

		Natjecanje s = new Natjecanje();

		s.setSifra(Pomocno.ucitajInt("Unesite �ifru natjecanja (pozitivni broj)", true));
		s.setVrsta(Pomocno.ucitajString("Unesi vrstu natjecanja"));
		s.setPocetak(Pomocno.ucitajDatum("Unesi datum i vrijeme po�etka"));
		s.setKraj(Pomocno.ucitajDatum("Unesi datum i vrijeme zavr�etka"));
		System.out.println("Popis ribolovi�ta u aplikaciji");
		RibolovisteCRUD.ispis(ribolovista);
		s.setRiboloviste(ribolovista.get(Pomocno.ucitajInt("Odaberi ribolovi�te", 1, ribolovista.size()) - 1));

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
		s.setSifra(Pomocno.ucitajInt("�ifra (" + s.getSifra() + ")", true));
		s.setVrsta(Pomocno.ucitajString("vrsta ( " + s.getVrsta() + ")"));
		s.setPocetak(Pomocno.ucitajDatum("po�etak ( " + s.getPocetak() + ")"));
		s.setKraj(Pomocno.ucitajDatum("kraj ( " + s.getKraj() + ")"));

	}
}
