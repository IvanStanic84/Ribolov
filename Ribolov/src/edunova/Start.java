package edunova;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

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

		inicijalniPodaci();
		// procitajSDiska();
		Pomocno.ulaz = new Scanner(System.in);
		System.out.println("***** Ribolov konzolna aplikacija *****");
		izbornik();
		Pomocno.ulaz.close();
	}

	private void inicijalniPodaci() {

		ribolovnadrustva.add(new Ribolovnodrustvo(1, "Linjak", "Ivanovci", "", ""));
		ribolovnadrustva.add(new Ribolovnodrustvo(2, "Smuð", "Satnica", "", ""));
		ribolovnadrustva.add(new Ribolovnodrustvo(3, "Karas", "Šag", "", ""));

		ribe.add(new Riba(1, "Keder"));
		ribe.add(new Riba(2, "Babuška"));
		ribe.add(new Riba(3, "Deverika"));

		ribolovista.add(new Riboloviste(1, "Podgajci", "Stajaèica"));
		ribolovista.add(new Riboloviste(2, "Ivanovci", "Tekuèica"));
		ribolovista.add(new Riboloviste(3, "Ladimirevci", "Bara"));

		Ribic r = new Ribic();
		r.setIme("Sofija");
		r.setPrezime("Staniæ");
		r.setRibolovnodrustvo(ribolovnadrustva.get(0));
		ribici.add(r);
		r = new Ribic();
		r.setIme("Vanesa");
		r.setPrezime("Kasapoviæ");
		r.setRibolovnodrustvo(ribolovnadrustva.get(1));
		ribici.add(r);

		Natjecanje n = new Natjecanje();
		n.setVrsta("Društveno natjecanje");
		n.setRiboloviste(ribolovista.get(0));
		natjecanja.add(n);
		n = new Natjecanje();
		n.setVrsta("Opæinsko natjecanje");
		n.setRiboloviste(ribolovista.get(1));
		natjecanja.add(n);

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
		izbornikProgram();
		pokreniRibicAkcija();
		izbornik();

	}

	private void pokreniRibicAkcija() {
		switch (Pomocno.ucitajInt("Odaberite akciju", 1, 5)) {
		case 1:
			ribici.add(RibicCRUD.unosNovog(ribolovnadrustva));
			spremanjeNaDisk();
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

	private void spremanjeNaDisk() {

		Spremanje s = new Spremanje();

		s.setNatjecanja(natjecanja);
		s.setRibe(ribe);
		s.setRibici(ribici);
		s.setRibolovista(ribolovista);
		s.setRibolovnadrustva(ribolovnadrustva);
		s.setUlovi(ulovi);

		ExclusionStrategy strategija = new ExclusionStrategy() {
			@Override
			public boolean shouldSkipField(FieldAttributes fa) {
				if (fa.getDeclaringClass() == Natjecanje.class && fa.getName().equals("ulovi")) {
					return true;
				}
				return false;
			}

			@Override
			public boolean shouldSkipClass(Class<?> type) {
				return false;
			}

		};

		Gson gson = new GsonBuilder().setExclusionStrategies(strategija).setPrettyPrinting()
				.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();

		try {
			FileWriter fw = new FileWriter("podaci.json");
			fw.write(gson.toJson(s));
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void procitajSDiska() {
		Gson g = new Gson();

		Type dataType = (new TypeToken<Spremanje>() {
		}).getType();

		try {
			Spremanje s = g.fromJson(Files.readString(Path.of("podaci.json")), dataType);
			this.natjecanja = s.getNatjecanja();
			this.ribe = s.getRibe();
			this.ribici = s.getRibici();
			this.ribolovista = s.getRibolovista();
			this.ribolovnadrustva = s.getRibolovnadrustva();
			this.ulovi = s.getUlovi();
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}