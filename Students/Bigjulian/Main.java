package ro.enered.examples;

public class Main {
	public static void main(String args[]){
		// In acest exemplu vom exersa lucrul cu primitivele din limbajul Java, cu operatiile de baza, cu conditionalele, cu structurile repetitive si cu vectorii
		
		//Exemplul 1: Declarati 2 numere intregi si afisati suma lor
		int a = 4;
		int b = 7;
		int s= a + b;
		System.out.println("suma este " + s);
		
		//Exemplul 2: Declarati 4 numere reale si afisati rezultatul inmultirii lor
		double a1 = 5.1;
		double b1 = 5.2;
		double c1 = 5.3;
		double d1 = 5.4;
		double i = a1 * b1 * c1 * d1;
		System.out.println("rezultatul este " + i);
		
		//Exemplul 2b: Declarati 2 numere intregi si afisati catul si restul impartirii lor
		float a2 = 15;
		float a3 = 23;		
		float ab = a2 / a3;
		System.out.println("rezultatul este " + ab);
		
		//Exemplul 3: Declarati 2 numere intregi pozitive si unul negativ si afisati rezultatul adunarii primelor 2, inmultit cu al treilea numar (cel negativ)
		int a4 = 3;
		int b4 = 4;
		int c4 = -2;
		int m =(a4 + b4) * c4;
		System.out.println("rezultatul este " + m );
		
		//Exemplul 4: Declarati 2 variabile de tip String si concatenati-le, astfel incat sa afisati textul "Ma numesc " + nume + " si invat " + curs
		String nume = "Iulian";
		String curs = "Java";
		System.out.println("Ma numesc " + nume + " si invat " + curs);
		
		//Exemplul 5: Declarati 2 numere intregi si afisati-l pe cel mai mare
		int s1 = 5;
		int s2 = 9;
		if(s1 > s2){
			System.out.println(s1);
		} 
		else System.out.println(s2);
		
		//Exemplul 5b: Declarati 2 numere intregi pozitive care reprezinta lungimile laturilor unui triunghi dreptunghic. Calculati si afisati aria acestuia
		int cateta1 = 2;
		int cateta2 = 4;
		int aria = cateta1 * cateta2;
		System.out.println(aria);
	
		
		//Exemplul 6: Declarati 2 numere intregi si afisati textul "Numarul " + nr1 " este mai mare decat numarul " + nr2, in functie de relatia dintre cele 2
		int ac = 7;	
		int ad = 9;
		if(ad > ac){
			System.out.println("Numarul " + ad + " este mai mare decat numarul " + ac);
		}
		else System.out.println("Numarul " + ac + " este mai mare decat numarul " + ad);
		
		//Exemplul 7: Declarati o variabile de tip boolean care sa fie true daca cele doua numere declarate in exemplul anterior sunt egale
		boolean ae;
				if(ac == ad){
					ae = true;
				}else{
					ae = false;
					
				}
				System.out.println(ae);
				
		//Exemplul 8: Determinati si afisati rezultatul ridicarii la putere a doua numere intregi (declarate de voi), folosind operatiunea "for"
		
		
		//Exemplul 8b: Declarati un numar intreg si gasiti si afisati, printr-o instructiune repetitiva si una de decizie, cel mai mare numar par, mai mic sau egal cu cel initial
		
		
		//Exemplul 9: Declarati 2 numere intregi si verificati rezultatul adunarii lor astfel: daca este 4, atunci afisati "Numerele sunt bune", daca este 8, afisati "Numerele sunt okay", iar in orice alt caz afisati "Numere nu sunt bune"
		
		
		//Exemplul 10: Declarati un vector de numere intregi de dimensiune 8. Adaugati, utilizand o instructiune repetitiva, numerele de la 1 la 8, in ordine crescatoare
		
		
		//Exemplul 10b: Declarati un vector cu 4 elemente (2 negative si 2 pozitive), calculati si afisati suma elementelor pozitive
		
		//Exemplul 10c: Afisati vectorul declarat anterior. Apoi afisati-l in ordinea inversa a elementelor (utilizand o instructiune repetitiva)
		
		
		//Exemplul 11: Declarati un vector de numere reale de dimensiune 4. Adaugati manual 4 elemente in acest vector si afisati-l.
		
		
		//Exemplul 12: Cautati si afisati cel mai mare element din vectorul declarat anterior.
	
		
		//Exemplul 13: Declarati un vector de obiecte de tip String, de orice dimensiune, populati-o cu cuvinte random si, utilizand o instructiune repetitiva, adaugati, la finalul fiecarui cuvant, sufixul "ului"
		
		
		//Exemplul 14: Declarati doi vectori de minim 3 numere intregi si, utilizand instructiuni repetitive si decizionale, afisati pe ecran cate elemente au in comun
		
		
		//Exemplul 15: Declarati o matrice patratica de numere intregi (2,2) si populati-o cu valori de 0. Apoi setati valoarea de pe pozitia 1,2 sa fie 1
		
		
		
	}
}