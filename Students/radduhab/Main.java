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
		double c = 3.5;
		double d = 4.5;
		double e = 5.5;
		double f = 6.5;
		double q = c * d * e * f;
		System.out.println(q);

		// Exemplul 2b: Declarati 2 numere intregi si afisati catul si restul
		// impartirii lor
		float x = 10;
		float y = 3;
		float v = x / y;
		System.out.println(v);

		// Exemplul 3: Declarati 2 numere intregi pozitive si unul negativ si
		// afisati rezultatul adunarii primelor 2, inmultit cu al treilea numar
		// (cel negativ)

		int w = 2;
		int r = 4;
		int t = -2;
		int u = (w + r) * t;
		System.out.println(u);

		// Exemplul 4: Declarati 2 variabile de tip String si concatenati-le,
		// astfel incat sa afisati textul "Ma numesc " + nume + " si invat " +
		// curs

		String Nume = "Radu ";
		String Curs = "EDCO";

		System.out.println("Ma numesc " + Nume + "si invat la " + Curs);
		// Exemplul 5: Declarati 2 numere intregi si afisati-l pe cel mai mare

		int a1 = 10;
		int b1 = 2;
		if (a1 > b1) {
			System.out.println(a1);
		} else {
			System.out.println(b1);
		}
		// Exemplul 5b: Declarati 2 numere intregi pozitive care reprezinta
		// lungimile laturilor unui triunghi dreptunghic. Calculati si afisati
		// aria acestuia

		int c1 = 4;
		int d1 = 6;
		int aria = (c1 + d1) / 2;
		System.out.println(aria);

		// Exemplul 6: Declarati 2 numere intregi si afisati textul "Numarul " +
		// nr1 " este mai mare decat numarul " + nr2, in functie de relatia
		// dintre cele 2

		int e1 = 8;
		int f1 = 12;
		if (e1 > f1) {
			System.out.println("Numarul " + e1 + " este mai mare decat numarul " + f1);
		} else {
			System.out.println("Numarul " + f1 + " este mai mare decat numarul " + e1);
		}
		// Exemplul 7: Declarati o variabile de tip boolean care sa fie true
		// daca cele doua numere declarate in exemplul anterior sunt egale
		Boolean magie;
		if (a == b) {
			magie = true;
		} else {
			magie = false;
		}
		System.out.println("Numerele din exercitiul anterior sunt " + magie);

		// Exemplul 8: Determinati si afisati rezultatul ridicarii la putere a
		// doua numere intregi (declarate de voi), folosind operatiunea "for"

		int a2 = 2;
		int b2 = 3;
		int c2 = 1;
		for (int i = 0; i < b2; i++)
			c2 = c2 * a2;
		System.out.println(c2);

		// Exemplul 8b: Declarati un numar intreg si gasiti si afisati, printr-o
		// instructiune repetitiva si una de decizie, cel mai mare numar par,
		// mai mic sau egal cu cel initial

		// Exemplul 9: Declarati 2 numere intregi si verificati rezultatul
		// adunarii lor astfel: daca este 4, atunci afisati "Numerele sunt
		// bune", daca este 8, afisati "Numerele sunt okay", iar in orice alt
		// caz afisati "Numere nu sunt bune"
		int d2=8;
		int e2=10;
		int suma=d2+e2;
		if(suma==4){
			System.out.println("Numerele sunt bune");
		}
			else if(suma==8){
				System.out.println("Numerele sunt okay");
			}
		
			else{
			System.out.println("Numerele nu sunt bune");
		}
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
