package ro.enered.examples;

public class Main {
	public static void main(String args[]) {
		// In acest exemplu vom exersa lucrul cu primitivele din limbajul Java,
		// cu operatiile de baza, cu conditionalele, cu structurile repetitive
		// si cu vectorii

		// Exemplul 1: Declarati 2 numere intregi si afisati suma lor
		int a = 4;
		int b = 7;
		int s = a + b;
		System.out.println(s);

		// Exemplul 2: Declarati 4 numere reale si afisati rezultatul inmultirii
		// lor

		double c = 4.1;
		double d = 4.2;
		double e = 4.3;
		double f = 4.4;
		double g = c * d * e * f;
		System.out.println(g);

		// Exemplul 2b: Declarati 2 numere intregi si afisati catul si restul
		// impartirii lor
		float h = 6;
		float i = 5;
		float j = h / i;
		System.out.println(j);

		// Exemplul 3: Declarati 2 numere intregi pozitive si unul negativ si
		// afisati rezultatul adunarii primelor 2, inmultit cu al treilea numar
		// (cel negativ)

		int k = 7;
		int l = 7;
		int m = -8;
		int n = (k + l) * m;
		System.out.println(n);

		// Exemplul 4: Declarati 2 variabile de tip String si concatenati-le,
		// astfel incat sa afisati textul "Ma numesc " + nume + " si invat " +
		// curs
		String nume = "Alabala";
		String curs = "info";
		System.out.println("Ma numesc " + nume + " si invat " + curs);

		// Exemplul 5: Declarati 2 numere intregi si afisati-l pe cel mai mare
		int o = 13;
		int p = 47;
		if (o > p) {
			System.out.println(o);
		} else
			System.out.println(p);

		// Exemplul 5b: Declarati 2 numere intregi pozitive care reprezinta
		// lungimile laturilor unui triunghi dreptunghic. Calculati si afisati
		// aria acestuia
		int cateta1 = 2;
		int cateta2 = 4;
		int aria = cateta1 * cateta2;
		System.out.println(aria + " salut");

		// Exemplul 6: Declarati 2 numere intregi si afisati textul "Numarul " +
		// nr1 " este mai mare decat numarul " + nr2, in functie de relatia
		// dintre cele 2

		int y = 4;
		int z = 5;
		if (y > z) {
			System.out.println("Numarul " + y + " este mai mare decat numarul" + z);
		} else
			System.out.println("Numarul " + z + " este mai mare decat numarul " + y);

		// Exemplul 7: Declarati o variabile de tip boolean care sa fie true
		// daca cele doua numere declarate in exemplul anterior sunt egale
		Boolean magic;
		if (y == z) {
			magic = true;
		} else {
			magic = false;
		}
		System.out.println(magic);
		// Exemplul 8: Determinati si afisati rezultatul ridicarii la putere a
		// doua numere intregi (declarate de voi), folosind operatiunea "for"

		int q1 = 2;
		int q2 = 3;
		int q3 = 1;
		for (int i1 = 0; i1 < q2; i1++)
			q3 = q3 * q1;
		System.out.println(q3);

		// Exemplul 8b: Declarati un numar intreg si gasiti si afisati, printr-o
		// instructiune repetitiva si una de decizie, cel mai mare numar par,
		// mai mic sau egal cu cel initial
		int w = 9;
		int max = 0;
		for (i = 0; i <= w; i++)
			;
		if (i % 2 == 0 && i <= 9) {
			max = 1;

		}

		// Exemplul 9: Declarati 2 numere intregi si verificati rezultatul
		// adunarii lor astfel: daca este 4, atunci afisati "Numerele sunt
		// bune", daca este 8, afisati "Numerele sunt okay", iar in orice alt
		// caz afisati "Numere nu sunt bune"

		// Exemplul 10: Declarati un vector de numere intregi de dimensiune 8.
		// Adaugati, utilizand o instructiune repetitiva, numerele de la 1 la 8,
		// in ordine crescatoare

		// Exemplul 10b: Declarati un vector cu 4 elemente (2 negative si 2
		// pozitive), calculati si afisati suma elementelor pozitive

		// Exemplul 10c: Afisati vectorul declarat anterior. Apoi afisati-l in
		// ordinea inversa a elementelor (utilizand o instructiune repetitiva)

		// Exemplul 11: Declarati un vector de numere reale de dimensiune 4.
		// Adaugati manual 4 elemente in acest vector si afisati-l.

		// Exemplul 12: Cautati si afisati cel mai mare element din vectorul
		// declarat anterior.

		// Exemplul 13: Declarati un vector de obiecte de tip String, de orice
		// dimensiune, populati-o cu cuvinte random si, utilizand o instructiune
		// repetitiva, adaugati, la finalul fiecarui cuvant, sufixul "ului"

		// Exemplul 14: Declarati doi vectori de minim 3 numere intregi si,
		// utilizand instructiuni repetitive si decizionale, afisati pe ecran
		// cate elemente au in comun

		// Exemplul 15: Declarati o matrice patratica de numere intregi (2,2) si
		// populati-o cu valori de 0. Apoi setati valoarea de pe pozitia 1,2 sa
		// fie 1

	}

}
