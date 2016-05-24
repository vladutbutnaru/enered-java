package ro.home.home1;

public class Main {
	public static void main(String args[]) {
		// In acest exemplu vom exersa lucrul cu primitivele din limbajul Java,
		// cu operatiile de baza, cu conditionalele, cu structurile repetitive
		// si cu vectorii

		// Exemplul 1: Declarati 2 numere intregi si afisati suma lor
		int a1 = 55;
		int b1 = 62;
		int suma = a1 + b1;
		System.out.println("Suma este egala cu = " + suma);
		System.out.println("-----------------------------------------------------------");
		// Exemplul 2: Declarati 4 numere reale si afisati rezultatul inmultirii
		// lor
		double a2 = 7.5;
		double a3 = 2.5;
		double a4 = 1.5;
		double a5 = 12.5;
		double inmultire = a2 * a3 * a4 * a5;
		System.out.println("Rezultatul inmultirii lor = " + inmultire);
		System.out.println("-----------------------------------------------------------");
		// Exemplul 2b: Declarati 2 numere intregi si afisati catul si restul
		// impartirii lor
		float b2 = 13;
		float b3 = 2;
		float impartire = b2 / b3;
		System.out.println("Catul si restul = " + impartire);
		System.out.println("-----------------------------------------------------------");
		// Exemplul 3: Declarati 2 numere intregi pozitive si unul negativ si
		// afisati rezultatul adunarii primelor 2, inmultit cu al treilea numar
		// (cel negativ)
		int c1 = 15;
		int c2 = 22;
		int c3 = -4;
		int adunare = (c1 + c2) * c3;
		System.out.println("Rezultatul adunarii = " + adunare);
		System.out.println("-----------------------------------------------------------");
		// Exemplul 4: Declarati 2 variabile de tip String si concatenati-le,
		// astfel incat sa afisati textul "Ma numesc " + nume + " si invat " +
		// curs
		String nume = "Radu H ";
		String curs = "Bazele programarii";
		System.out.println("Ma numesc " + nume + "si invat la " + curs);
		System.out.println("-----------------------------------------------------------");
		// Exemplul 5: Declarati 2 numere intregi si afisati-l pe cel mai mare
		int d1 = 12;
		int d2 = 8;
		if (d2 > d1) {
			System.out.println("d2 este mai mare = " + d2);
		} else {
			System.out.println("d1 este mai mare = " + d1);
		}
		System.out.println("-----------------------------------------------------------");
		// Exemplul 5b: Declarati 2 numere intregi pozitive care reprezinta
		// lungimile laturilor unui triunghi dreptunghic. Calculati si afisati
		// aria acestuia
		int e1 = 22;
		int e2 = 14;
		int aria = (e1 + e2) / 2;
		System.out.println("Aria triunghiului = " + aria);
		System.out.println("-----------------------------------------------------------");
		// Exemplul 6: Declarati 2 numere intregi si afisati textul "Numarul " +
		// nr1 " este mai mare decat numarul " + nr2, in functie de relatia
		// dintre cele 2
		int nr1 = 8;
		int nr2 = 12;
		if (nr1 > nr2) {
			System.out.println("Numarul " + nr1 + " este mai mare decat " + nr2);
		} else {
			System.out.println("Numarul " + nr2 + " este mai mare decat " + nr1);
		}
		System.out.println("-----------------------------------------------------------");
		// Exemplul 7: Declarati o variabile de tip boolean care sa fie true
		// daca cele doua numere declarate in exemplul anterior sunt egale
		boolean incercare;
		if (nr1 == nr2) {
			incercare = true;
		} else {
			incercare = false;
		}
		System.out.println("Numerele nu sunt egale = " + incercare);
		// sau a 2-a varianta de boolean
		boolean incercare2 = nr1 == nr2;
		System.out.println("A 2-a varianta: Numerele nu sunt egale = " + incercare2);
		System.out.println("-----------------------------------------------------------");
		// Exemplul 8: Determinati si afisati rezultatul ridicarii la putere a
		// doua numere intregi (declarate de voi), folosind operatiunea "for"
		int f1 = 7;
		int f2 = 6;
		int f3 = 5;
		for (int i = 0; i < f2; i++) {
			f3 = f3 * f1;
			System.out.println("Rezultatul = " + f3);
		}
		System.out.println("-----------------------------------------------------------");
		// Exemplul 8b: Declarati un numar intreg si gasiti si afisati, printr-o
		// instructiune repetitiva si una de decizie, cel mai mare numar par,
		// mai mic sau egal cu cel initial
		int g = 12;
		for (int i = g; i <= g; i--) {
			if (i % 2 == 0) {
				System.out.println("Cel mai mare numar par este: " + i);
				break;
			}
			for (int i2 = 0; i2 < g; i2++) {
				if (i2 % 2 == 0) {
					System.out.println("Cel mai mic numar par este " + i2);
					break;
				}

			}

		}
		System.out.println("-----------------------------------------------------------");
		// Exemplul 9: Declarati 2 numere intregi si verificati rezultatul
		// adunarii lor astfel: daca este 4, atunci afisati "Numerele sunt
		// bune", daca este 8, afisati "Numerele sunt okay", iar in orice alt
		// caz afisati "Numerele nu sunt bune"
		int j1 = 2;
		int j2 = 6;
		int sum = j1 + j2;
		// prima varianta cu if si else
		if (sum == 4) {
			System.out.println("Numerele sunt bune");
		} else if (sum == 8) {
			System.out.println("Numerele sunt ok");
		} else {
			System.out.println("Numerele nu sunt bune");

		}
		System.out.println("-----------------------------------------------------------");
		// Exemplul 10: Declarati un vector de numere intregi de dimensiune 8.
		// Adaugati, utilizand o instructiune repetitiva, numerele de la 1 la 8,
		// in ordine crescatoare
		int vector[] = new int[8];
		for (int i = 0; i < 8; i++) {
			int pozitie = i + 1;
			vector[1] = pozitie;
			System.out.print(" " + vector[1]);
		}
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		// Exemplul 10b: Declarati un vector cu 4 elemente (2 negative si 2
		// pozitive), calculati si afisati suma elementelor pozitive
		int vec[] = { 6, 8, -10, -12 };
		int sumavec = 0;
		for (int i = 0; i < vec.length; i++) {
			if (vec[i] > 0) {
				sumavec = sumavec + vec[i];
			}
		}
		System.out.println("Suma elementelor pozitive este " + sumavec);
		System.out.println("-----------------------------------------------------------");
		// Exemplul 10c: Afisati vectorul declarat anterior. Apoi afisati-l in
		// ordinea inversa a elementelor (utilizand o instructiune repetitiva)
		for (int i = 0; i < vec.length; i++) {
			System.out.print(" " + vec[i]);
		}
		System.out.println("");
		for (int i = vec.length - 1; i >= 0; i--) {
			System.out.print(" " + vec[i]);
		}
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		// Exemplul 11: Declarati un vector de numere reale de dimensiune 4.
		// Adaugati manual 4 elemente in acest vector si afisati-l.
		double vect[] = new double[4];
		vect[0] = 11.5;
		vect[1] = 25.3;
		vect[2] = 5.1;
		vect[3] = 8.6;
		for (int i = 0; i < vect.length; i++) {
			System.out.print(" " + vect[i]);
		}
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		// Exemplul 12: Cautati si afisati cel mai mare element din vectorul
		// declarat anterior.
		double max = vect[0];
		for (int i = 1; i < vect.length; i++) {
			if (vect[i] > max) {
				max = vect[i];
			}
		}
		System.out.println("Cel mai mare element din vector este " + max);
		System.out.println("-----------------------------------------------------------");
		// Exemplul 13: Declarati un vector de obiecte de tip String, de orice
		// dimensiune, populati-o cu cuvinte random si, utilizand o instructiune
		// repetitiva, adaugati, la finalul fiecarui cuvant, sufixul "ului"
		String vecto[] = new String[3];
		vecto[0] = "an";
		vecto[1] = "os";
		vecto[2] = "cos";
		for (int i = 0; i < vecto.length; i++) {
			System.out.print(" " + vecto[i] + "ului");
		}
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		// Exemplul 14: Declarati doi vectori de minim 3 numere intregi si,
		// utilizand instructiuni repetitive si decizionale, afisati pe ecran
		// cate elemente au in comun
		int rector[] = { 2, 3, 11, 6, 8, 10 };
		int bector[] = { 11, 4, 3, 6, 10, 5 };
		System.out.println("Elementele in comun sunt: ");
		for (int i = 0; i < 6; i++) {
			if (rector[0] == bector[i]) {
				System.out.print(" " + bector[i]);

			} else if (rector[1] == bector[i]) {
				System.out.print(" " + bector[i]);

			} else if (rector[2] == bector[i]) {
				System.out.print(" " + bector[i]);

			} else if (rector[3] == bector[i]) {
				System.out.print(" " + bector[i]);

			} else if (rector[4] == bector[i]) {
				System.out.print(" " + bector[i]);

			} else if (rector[5] == bector[i]) {
				System.out.print(" " + bector[i]);

			}

		}
		// Exemplul 15: Declarati o matrice patratica de numere intregi (2,2) si
		// populati-o cu valori de 0. Apoi setati valoarea de pe pozitia 1,2 sa
		// fie 1
	}
}
