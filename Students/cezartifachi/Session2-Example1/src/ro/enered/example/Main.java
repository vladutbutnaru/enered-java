package ro.enered.example;

public class Main {
	public static void main(String args[]){
package ro.enered.example;

import org.omg.CORBA.SystemException;

public class Main {
	public static void main(String args[]){
		// In acest exemplu vom exersa lucrul cu primitivele din limbajul Java, cu operatiile de baza, cu conditionalele, cu structurile repetitive si cu vectorii
		
		//Exemplul 1: Declarati 2 numere intregi si afisati suma lor
		int a = 6;
		int b = 4;
		System.out.println("Adunarea celor 2 numere este: " + (a + b));
		
		//Exemplul 2: Declarati 4 numere reale si afisati rezultatul inmultirii lor
		int a1 = 2;
		int b1 = 3;
		int c1 = 4;
		int d1 = 5;
		System.out.println("Rezultatul inmultirii celor 4 numere este: " + (a1*b1*c1*d1));
		
		//Exemplul 2b: Declarati 2 numere intregi si afisati catul si restul impartirii lor
		double a2,b2;
		a2 = 12;
		b2 = 4;
		  System.out.println("Catul impartirii este:" +(a2/b2));
	      System.out.println("Restul impartirii este:" +(a2%b2));
		//Exemplul 3: Declarati 2 numere intregi pozitive si unul negativ si afisati rezultatul adunarii primelor 2, inmultit cu al treilea numar (cel negativ)
		int a3 = 6;
		int b3 = 9;
		int c3 = -5;
		System.out.println("Rezultatul adunarii primelor 2 numar, inmultit cu al treilea numar (cel negativ) este:" + ((a3+b3)*c3));
		//Exemplul 4: Declarati 2 variabile de tip String si concatenati-le, astfel incat sa afisati textul "Ma numesc " + nume + " si invat " + curs
		String Nume = "Sorin";
		String Curs = "Java";
		System.out.println("Ma numesc " + Nume + " si invat " + Curs + "!");
		
		//Exemplul 5: Declarati 2 numere intregi si afisati-l pe cel mai mare
		int a4 = 6;
		int b4 = 9;
		    if (a4>b4) {
		    	System.out.println("a4>b4");
		    } else {
		        System.out.println("a4<b4");
		    } 
		}
		
		//Exemplul 6: Declarati 2 numere intregi si afisati textul "Numarul " + nr1 " este mai mare decat numarul " + nr2, in functie de relatia dintre cele 2
		int nr1 = 23;
		int nr2 = 44; {
		if (nr1>nr2){
			System.out.println("Numarul " + nr1 + " este mai mare decat numarul " + nr2);
		} else {
			System.out.println("Numarul " + nr1 + " este mai mic decat numarul " + nr2);
		}}

		//Exemplul 7: Declarati o variabile de tip boolean care sa fie true daca cele doua numere declarate in exemplul anterior sunt egale
			
		boolean exemplu;{
		if (nr1==nr2) {
			System.out.println(exemplu);
		}
		//Exemplul 8: Determinati si afisati rezultatul ridicarii la putere a doua numere intregi (declarate de voi), folosind operatiunea "for"
		
		
		//Exemplul 8b: Declarati un numar intreg si gasiti si afisati, printr-o instructiune repetitiva si una de decizie, cel mai mare numar par, mai mic sau egal cu cel initial
		
		
		//Exemplul 9: Declarati 2 numere intregi si verificati rezultatul adunarii lor astfel: daca este 4, atunci afisati "Numerele sunt bune", daca este 8, afisati "Numerele sunt okay", iar in orice alt caz afisati "Numere nu sunt bune"
		
		
		//Exemplul 10: Declarati un vector de numere intregi de dimensiune 8. Adaugati, utilizand o instructiune repetitiva, numerele de la 1 la 8, in ordine crescatoare
		
		
		//Exemplul 10b: Afisati vectorul declarat anterior. Apoi afisati-l in ordinea inversa a elementelor (utilizand o instructiune repetitiva)
		
		
		//Exemplul 11: Declarati un vector de numere reale de dimensiune 4. Adaugati manual 4 elemente in acest vector si afisati-l.
		
		
		//Exemplul 12: Cautati si afisati cel mai mare element din vectorul declarat anterior.
	
		
		
		
	}}
		
	}
}
