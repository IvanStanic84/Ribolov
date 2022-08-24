package edunova;

import java.util.Scanner;

import edunova.util.Pomocno;

public class Start {

	public Start() {
		Pomocno.ulaz = new Scanner(System.in);
		System.out.println("***** Ribolov konzolna aplikacija V1 *****");
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
		System.out.println("Doðe izbornik za 'Ulovi'");

		izbornik();

	}

	private void ribolovnadrustva() {
		System.out.println("Doðe izbornik za 'Ribolovna društva'");

		izbornik();

	}

	private void natjecanja() {
		System.out.println("Doðe izbornik za 'Natjecanja'");

		izbornik();

	}

	private void ribolovista() {
		System.out.println("Doðe izbornik za 'Ribolovišta'");

		izbornik();

	}

	private void ribe() {
		System.out.println("Doðe izbornik za 'Ribe'");

		izbornik();

	}

	private void ribici() {
		System.out.println("Doðe izbornik za 'Ribièi'");

		izbornik();

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

	public static void main(String[] args) {
		new Start();
	}

}