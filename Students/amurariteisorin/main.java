package ro.enered.examples;

public class main {
		public static void main(String args[]) {
			// In acest exemplu vom exersa lucrul cu primitivele din limbajul Java, cu operatiile de baza, cu conditionalele, cu structurile repetitive si cu vectorii
				
			//Exemplul 1: Declarati 2 numere intregi si afisati suma lor
				int a = 3;
				int b = 4;
				int c = 5;
				int d = 6;
				System.out.println("Suma celor 2 numere este: " + (a+b));
			
			//Exemplul 2: Declarati 4 numere reale si afisati rezultatul inmultirii lor
				double a1 = 1.2;
				double b1 = 1.3;
				double c1 = 1.4;
				double d1 = 1.5;
				System.out.println("Rezultatul inmultirii celor patru numere este: " + a1*b1*c1*d1);
			
			//Exemplul 2b: Declarati 2 numere intregi si afisati catul si restul impartirii lor
			
			System.out.println ("Rezultatul impartirii celor 2 numere este: " + a/b);
			System.out.println ("Restul impartirii celor 2 numere este: " + a%b);
			
			//Exemplul 3: Declarati 2 numere intregi pozitive si unul negativ si afisati rezultatul adunarii primelor 2, inmultit cu al treilea numar (cel negativ)
			int e = -4;
			System.out.println("Rezultatul final exemplu 3 este:" + (a+b)*e);
			
			//Exemplul 4: Declarati 2 variabile de tip String si concatenati-le, astfel incat sa afisati textul "Ma numesc " + nume + " si invat " + curs
			String nume = " Sorin ";
			String curs = " Java! ";
			System.out.println("Ma numesc" + nume + "si invat" + curs);
			//Exemplul 5: Declarati 2 numere intregi si afisati-l pe cel mai mare
			if (a>b){
				System.out.println("Dintre cele 2 variabile a este mai mare");
			} else {
				System.out.println("Dintre cele 2 variabile b este mai mare");
			}
			
			//Exemplul 5b: Declarati 2 numere intregi pozitive care reprezinta lungimile laturilor unui triunghi dreptunghic. Calculati si afisati aria acestuia
			
			System.out.println((a*b)/2);
			
			//Exemplul 6: Declarati 2 numere intregi si afisati textul "Numarul " + nr1 " este mai mare decat numarul " + nr2, in functie de relatia dintre cele 2
			int nr1 = 11;
			int nr2 = 8;
			if (nr1<nr2){
				System.out.println("nr1 este mai mic ca nr2");
			}else {
				System.out.println("nr1 este mai mare ca nr2");
			}
			
			//Exemplul 7: Declarati o variabile de tip boolean care sa fie true daca cele doua numere declarate in exemplul anterior sunt egale
			boolean numar = true;
			if (nr1==nr2) {
				System.out.println(numar);
			}else {
				System.out.println("Numerele nu sunt egale");
			}
			//Exemplul 8: Determinati si afisati rezultatul ridicarii la putere a doua numere intregi (declarate de voi), folosind operatiunea "for"
			int a2 = 2;
			int b2 = 3;
			int c2 = 1;
			int i = 0;
			for (i = 0; i<b2; i++){
				c2 = c2*a2;
			}
			System.out.println("a2 la puterea b2 este: " + c2);
			
			//Exemplul 8b: Declarati un numar intreg si gasiti si afisati, printr-o instructiune repetitiva si una de decizie, cel mai mare numar par, mai mic sau egal cu cel initial
			for (int j = a - 1; j <= 2; j--){
				if (j%2 == 0){
					System.out.println(j);
					break;
				}
			}
			
			//Exemplul 9: Declarati 2 numere intregi si verificati rezultatul adunarii lor astfel: daca este 4, atunci afisati "Numerele sunt bune", daca este 8, afisati "Numerele sunt okay", iar in orice alt caz afisati "Numere nu sunt bune"
			if (a + b == 4) {
				System.out.println("Numerele sunt bune");
			} else if (a + b == 8) {
				System.out.println ("Numerele sunt ok");
			} else {
				System.out.println("Numerele nu sunt bune");
			}
			
			//Exemplul 10: Declarati un vector de numere intregi de dimensiune 8. Adaugati, utilizand o instructiune repetitiva, numerele de la 1 la 8, in ordine crescatoare
			int A[] = new int[8];
			for (int k = 0 ; k < 8; k++  ){
				A[k]= k+1;
			}
			for (int k = 0 ; k < 8; k++ ){
				System.out.println(A[k]);
			}
			
			//Exemplul 10b: Declarati un vector cu 4 elemente (2 negative si 2 pozitive), calculati si afisati suma elementelor pozitive
			int B[] = new int[4];
			B[0] = -1 ;
			B[1] = 7;
			B[2] = -3;
			B[3] = 9;
			int sum = 0;
			for (int l = 0; l < 4; l++){
				if (B[l]>0) {
					sum+=B[l];
				}
			}
			System.out.println(sum);
			
			//Exemplul 10c: Afisati vectorul declarat anterior. Apoi afisati-l in ordinea inversa a elementelor (utilizand o instructiune repetitiva)
			
			
			//Exemplul 11: Declarati un vector de numere reale de dimensiune 4. Adaugati manual 4 elemente in acest vector si afisati-l.
			
			
			//Exemplul 12: Cautati si afisati cel mai mare element din vectorul declarat anterior.
		
			
			//Exemplul 13: Declarati un vector de obiecte de tip String, de orice dimensiune, populati-o cu cuvinte random si, utilizand o instructiune repetitiva, adaugati, la finalul fiecarui cuvant, sufixul "ului"
			
			
			//Exemplul 14: Declarati doi vectori de minim 3 numere intregi si, utilizand instructiuni repetitive si decizionale, afisati pe ecran cate elemente au in comun
			
			
			//Exemplul 15: Declarati o matrice patratica de numere intregi (2,2) si populati-o cu valori de 0. Apoi setati valoarea de pe pozitia 1,2 sa fie 1
			
			
			
		}
		
}
