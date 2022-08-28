package edunova;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;
import edunova.model.Natjecanje;
import edunova.model.Riba;
import edunova.model.Ribic;
import edunova.model.Riboloviste;
import edunova.model.Ribolovnodrustvo;
import edunova.model.Ulov;
import edunova.util.NatjecanjeCRUD;
import edunova.util.Pomocno;
import edunova.util.RibaCRUD;
import edunova.util.RibicCRUD;
import edunova.util.RibolovisteCRUD;
import edunova.util.RibolovnodrustvoCRUD;
import edunova.util.UlovCRUD;

public class Start {

	private List<Natjecanje> natjecanja;
	private List<Riboloviste> ribolovista;
	private List<Ribolovnodrustvo> ribolovnadrustva;
	private List<Riba> ribe;
	private List<Ribic> ribici;
	private List<Ulov> ulovi;

	public Start() {
		natjecanja = new ArrayList<>();
		ribolovista = new ArrayList<>();
		ribolovnadrustva = new ArrayList<>();
		ribe = new ArrayList<>();
		ribici = new ArrayList<>();
		ulovi = new ArrayList<>();

		Pomocno.ulaz = new Scanner(System.in);
		System.out.println("***** Ribolov konzolna aplikacija *****");
		izbornik();
		Pomocno.ulaz.close();
	}

	private void pokreniProgram() {
		switch (Pomocno.ucitajInt("Odaberi program", 1, 7)) {
		case 1:
			natjecanja();
			break;
		case 2:
			ribe();
			break;
		case 3:
			ribici();
			break;
		case 4:
			ribolovista();
			break;
		case 5:
			ribolovnadrustva();
		case 6:
			ulovi();

		case 7:
			System.out.println("Doviðenja");
		}
	}

	private void ulovi() {

		System.out.println("----Ulov----");
		izbornikProgram();
		pokreniUlovAkcija();
		izbornik();

	}

	private void pokreniUlovAkcija() {
		switch (Pomocno.ucitajInt("Odaberite akciju", 1, 5)) {
		case 1:
			ulovi.add(UlovCRUD.unosNovog(natjecanja, ribe, ribici));
			ulovi();
			break;
		case 2:
			UlovCRUD.ispis(ulovi);
			ulovi();
			break;
		case 3:
			UlovCRUD.ispis(ulovi);
			UlovCRUD.promjena(ulovi.get(Pomocno.ucitajInt("Odaberi ulov", 1, ulovi.size()) - 1));
			ulovi();
			break;
		case 4:
			UlovCRUD.ispis(ulovi);
			ulovi.remove(Pomocno.ucitajInt("Odaberi ulov", 1, ulovi.size()) - 1);
			ulovi();
			break;
		case 5:
			izbornik();
		}

	}

	private void ribolovnadrustva() {
		System.out.println("------Ribolovno društvo------");

		izbornikProgram();
		pokreniRibolovnodrustvoAkcija();
		izbornik();

	}

	private void pokreniRibolovnodrustvoAkcija() {
		switch (Pomocno.ucitajInt("Odaberite akciju", 1, 5)) {
		case 1:
			ribolovnadrustva.add(RibolovnodrustvoCRUD.unosNovog());
			ribolovnadrustva();
			break;
		case 2:
			RibolovnodrustvoCRUD.ispis(ribolovnadrustva);
			ribolovnadrustva();
			break;
		case 3:
			RibolovnodrustvoCRUD.ispis(ribolovnadrustva);
			RibolovnodrustvoCRUD.promjena(
					ribolovnadrustva.get(Pomocno.ucitajInt("Odaberi ribolovno društvo", 1, ulovi.size()) - 1));
			ribolovnadrustva();
			break;
		case 4:
			RibolovnodrustvoCRUD.ispis(ribolovnadrustva);
			ribolovnadrustva.remove(Pomocno.ucitajInt("Odaberi ribolovno društvo", 1, ribolovnadrustva.size()) - 1);
			ribolovnadrustva();
			break;
		case 5:
			izbornik();
		}
	}

	private void natjecanja() {
		System.out.println("----Natjecanje----");
		izbornikProgram();
		pokreniNatjecanjeAkcija();
		izbornik();

	}

	private void pokreniNatjecanjeAkcija() {
		switch (Pomocno.ucitajInt("Odaberite akciju", 1, 5)) {
		case 1:
			natjecanja.add(NatjecanjeCRUD.unosNovog(ribolovista));
			natjecanja();
			break;
		case 2:
			NatjecanjeCRUD.ispis(natjecanja);
			natjecanja();
			break;
		case 3:
			NatjecanjeCRUD.ispis(natjecanja);
			NatjecanjeCRUD.promjena(natjecanja.get(Pomocno.ucitajInt("Odaberi natjecanje", 1, natjecanja.size()) - 1));
			natjecanja();
			break;
		case 4:
			NatjecanjeCRUD.ispis(natjecanja);
			natjecanja.remove(Pomocno.ucitajInt("Odaberi natjecanje", 1, natjecanja.size()) - 1);
			natjecanja();
			break;
		case 5:
			izbornik();
		}

	}

	private void ribolovista() {
		System.out.println("----Riboloviste----");
		izbornikProgram();
		pokreniRibolovisteAkcija();
		izbornik();
	}

	private void pokreniRibolovisteAkcija() {
		switch (Pomocno.ucitajInt("Odaberite akciju", 1, 5)) {
		case 1:
			ribolovista.add(RibolovisteCRUD.unosNovog());
			ribolovista();
			break;
		case 2:
			RibolovisteCRUD.ispis(ribolovista);
			ribolovista();
			break;
		case 3:
			RibolovisteCRUD.ispis(ribolovista);
			RibolovisteCRUD
					.promjena(ribolovista.get(Pomocno.ucitajInt("Odaberi ribolovište", 1, ribolovista.size()) - 1));
			ribolovista();
			break;
		case 4:
			RibolovisteCRUD.ispis(ribolovista);
			ribolovista.remove(Pomocno.ucitajInt("Odaberi ribolovište", 1, ribolovista.size()) - 1);
			ribolovista();
			break;
		case 5:
			izbornik();
		}

	}

	private void ribe() {
		System.out.println("-----Riba----");
		izbornikProgram();
		pokreniRibaAkcija();
		izbornik();

	}

	private void pokreniRibaAkcija() {

		switch (Pomocno.ucitajInt("Odaberite akciju", 1, 5)) {
		case 1:
			ribe.add(RibaCRUD.unosNovog());
			ribe();
			break;
		case 2:
			RibaCRUD.ispis(ribe);
			ribe();
			break;
		case 3:
			RibaCRUD.ispis(ribe);
			RibaCRUD.promjena(ribe.get(Pomocno.ucitajInt("Odaberi ribu", 1, ribe.size()) - 1));
			ribe();
			break;
		case 4:
			RibaCRUD.ispis(ribe);
			ribe.remove(Pomocno.ucitajInt("Odaberi ribu", 1, ribe.size()) - 1);
			ribe();
			break;
		case 5:
			izbornik();
		}

	}

	private void ribici() {
		System.out.println("----Ribiè----'");
		System.out.println("----Natjecanje----");
		izbornikProgram();
		pokreniRibicAkcija();
		izbornik();

	}

	private void pokreniRibicAkcija() {
		switch (Pomocno.ucitajInt("Odaberite akciju", 1, 5)) {
		case 1:
			ribici.add(RibicCRUD.unosNovog(ribolovnadrustva));
			ribici();
			break;
		case 2:
			RibicCRUD.ispis(ribici);
			ribici();
			break;
		case 3:
			RibicCRUD.ispis(ribici);
			RibicCRUD.promjena(ribici.get(Pomocno.ucitajInt("Odaberi ribièa", 1, ribici.size()) - 1));
			ribici();
			break;
		case 4:
			RibicCRUD.ispis(ribici);
			ribici.remove(Pomocno.ucitajInt("Odaberi ribièa", 1, ribici.size()) - 1);
			ribici();
			break;
		case 5:
			izbornik();
		}

	}

	private void izbornik() {

		System.out.println("");
		System.out.println("Glavni izbornik");
		System.out.println("1. Natjecanja");
		System.out.println("2. Ribe");
		System.out.println("3. Ribièi");
		System.out.println("4. Ribolovišta");
		System.out.println("5. Ribolovna društva");
		System.out.println("6. Ulovi");
		System.out.println("7. Izlaz");

		System.out.println("");
		pokreniProgram();

	}

	private void izbornikProgram() {
		System.out.println("1. Unos");
		System.out.println("2. Pregled");
		System.out.println("3. Promjena");
		System.out.println("4. Brisanje");
		System.out.println("5. Povratak na glavni izbornik");
	}

	public static void main(String[] args) {
		new Start();
	}

}