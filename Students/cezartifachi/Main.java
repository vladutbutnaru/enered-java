package ro.enered.examples;

public class Main {
	public static void main(String[] args) {
	// In acest exemplu vom exersa lucrul cu primitivele din limbajul Java, cu operatiile de baza, cu conditionalele, cu structurile repetitive si cu vectorii
	
	//Exemplul 1: Declarati 2 numere intregi si afisati suma lor
	int a = 5;
	int b = 7;
	System.out.println("Exemplul 1: Suma celor dou numere este: " + (a+b));
	
	//Exemplul 2: Declarati 4 numere reale si afisati rezultatul inmultirii lor
	double a1 = 3.5;
	double b1 = 4.5;
	double c1 = 5.5;
	double d1 = 6.5;	
	System.out.println("Exemplul 2: Rezultatul inmultirii celor patru numere este: " + a1*b1*c1*d1);
	
	//Exemplul 2b: Declarati 2 numere intregi si afisati catul si restul impartirii lor
	int a2 = 10;
	int b2 = 4;
	System.out.println("Exemplul 2b: Catul impartirii celor doua numere este " + a2/b2 + " iar restul impartirii celor doua numere este " + a2%b2);
	
	//Exemplul 3: Declarati 2 numere intregi pozitive si unul negativ si afisati rezultatul adunarii primelor 2, inmultit cu al treilea numar (cel negativ)
	int a3 = 4;
	int b3 = 5;
	int c3 = -2;
	System.out.println("Exemplul 3: Rezultatul este: " + (a3+b3)*c3);
	
	//Exemplul 4: Declarati 2 variabile de tip String si concatenati-le, astfel incat sa afisati textul "Ma numesc " + nume + " si invat " + curs
	String nume = "Cezar";
	String curs = "Java";
	System.out.println("Exemplul 4: Ma numesc " + nume + " si invat " + curs + "!");
	
	//Exemplul 5: Declarati 2 numere intregi si afisati-l pe cel mai mare
	int a4 = 5;
	int b4 = 9;
	if (a>b) {
	System.out.println("Exemplul 5: Numarul mai mare este: " + a4);
	}
	else {
	System.out.println("Exemplul 5: Numarul mai mare este: " + b4);
	}
	//Exemplul 5b: Declarati 2 numere intregi pozitive care reprezinta lungimile laturilor unui triunghi dreptunghic. Calculati si afisati aria acestuia
	int a5 = 3;
	int b5 = 4;
	System.out.println("Exemplul 5b: Rezultatul este: " + a5*b5/2);
	
	//Exemplul 6: Declarati 2 numere intregi si afisati textul "Numarul " + nr1 " este mai mare decat numarul " + nr2, in functie de relatia dintre cele 2
	int nr1 = 7;
	int nr2 = 10;
	if (nr1>nr2) {
		System.out.println("Exemplul 6: Numarul " + nr1 + " este mai mare decat numarul " + nr2 );
	}
	else {
		System.out.println("Exemplul 6: Numarul " + nr2 + " este mai mare decat numarul " + nr1);
	}
	
	//Exemplul 7: Declarati o variabile de tip boolean care sa fie true daca cele doua numere declarate in exemplul anterior sunt egale
	boolean numar = true;
	if (nr1==nr2) {
		System.out.println("Exemplul 7: Numerele sunt egale");
	}
	else {
		System.out.println("Exemplul 7: Numerele nu sunt egale");
	}
	//Exemplul 8: Determinati si afisati rezultatul ridicarii la putere a doua numere intregi (declarate de voi), folosind operatiunea "for"
	int a6 = 2;
	int b6 = 3;
	int c6 = 1;
		for (int i = 0; i<b6; i++)
		c6 = c6*a6;
	System.out.println("Exemplul 8: " + c6);
	
	
	//Exemplul 8b: Declarati un numar intreg si gasiti si afisati, printr-o instructiune repetitiva si una de decizie, cel mai mare numar par, mai mic sau egal cu cel initial
	int a7 = 19;
	for (int j  = a7-1; j>=2; j--) {
	if (j%2==0){
		System.out.println("Exemplul 8b: " + j);
		break;
	}
	}
	//Exemplul 9: Declarati 2 numere intregi si verificati rezultatul adunarii lor astfel: daca este 4, atunci afisati "Numerele sunt bune", daca este 8, afisati "Numerele sunt okay", iar in orice alt caz afisati "Numere nu sunt bune"
	int a8 = 3;
	int b8 = 4;
	switch(a8+b8){
	case 4:
		System.out.println("Exemplu 9: Numerele sunt bune");
		break;
	case 8:
		System.out.println("Exemplu 9: Numerele sunt okay");
	default:
		System.out.println("Exemplul 9: Numere nu sunt bune");
	}
	
	//Exemplul 10: Declarati un vector de numere intregi de dimensiune 8. Adaugati, utilizand o instructiune repetitiva, numerele de la 1 la 8, in ordine crescatoare
		
	
	//Exemplul 10b: Declarati un vector cu 4 elemente (2 negative si 2 pozitive), calculati si afisati suma elementelor pozitive
	
	
	//Exemplul 10c: Afisati vectorul declarat anterior. Apoi afisati-l in ordinea inversa a elementelor (utilizand o instructiune repetitiva)
	
	
	//Exemplul 11: Declarati un vector de numere reale de dimensiune 4. Adaugati manual 4 elemente in acest vector si afisati-l.
	
	
	//Exemplul 12: Cautati si afisati cel mai mare element din vectorul declarat anterior.

	
	//Exemplul 13: Declarati un vector de obiecte de tip String, de orice dimensiune, populati-o cu cuvinte random si, utilizand o instructiune repetitiva, adaugati, la finalul fiecarui cuvant, sufixul "ului"
	
	
	//Exemplul 14: Declarati doi vectori de minim 3 numere intregi si, utilizand instructiuni repetitive si decizionale, afisati pe ecran cate elemente au in comun
	
	
	//Exemplul 15: Declarati o matrice patratica de numere intregi (2,2) si populati-o cu valori de 0. Apoi setati valoarea de pe pozitia 1,2 sa fie 1
	
}}
