package ro.enered.examples;

public class Main {
	public static void main(String args[]){
		// In acest exemplu vom exersa lucrul cu primitivele din limbajul Java, cu operatiile de baza, cu conditionalele, cu structurile repetitive si cu vectorii
		
		//Exemplul 1: Declarati 2 numere intregi si afisati suma lor
		int a = 1;
		int b = 1;
		System.out.println(a + b);

		//Exemplul 2: Declarati 4 numere reale si afisati rezultatul inmultirii lor
		int c = 2;
		int d = 3;
		double w = 5;
		System.out.println(a * b * c * d);
		
		//Exemplul 2b: Declarati 2 numere intregi si afisati catul si restul impartirii lor
		System.out.println(w / c);
				
		//Exemplul 3: Declarati 2 numere intregi pozitive si unul negativ si afisati rezultatul adunarii primelor 2, inmultit cu al treilea numar (cel negativ)
		int e = -3;
		System.out.println((a + b)* e);
		
		//Exemplul 4: Declarati 2 variabile de tip String si concatenati-le, astfel incat sa afisati textul "Ma numesc " + nume + " si invat " + curs
		String f = "Ma numesc ";
		String g = " si invat ";
		System.out.println(f + "Silviu" + g + "JAVA");
		
		//Exemplul 5: Declarati 2 numere intregi si afisati-l pe cel mai mare
		System.out.println(d);
		
		//Exemplul 5b: Declarati 2 numere intregi pozitive care reprezinta lungimile laturilor unui triunghi dreptunghic. Calculati si afisati aria acestuia
		double h = 4;
		double i = 3;
		System.out.println((h + i)/ 2);
			
		
		//Exemplul 6: Declarati 2 numere intregi si afisati textul "Numarul " + nr1 " este mai mare decat numarul " + nr2, in functie de relatia dintre cele 2
		System.out.println("Numarul " + h + " este mai mare decat numarul " + i);
		
		//Exemplul 7: Declarati o variabile de tip boolean care sa fie true daca cele doua numere declarate in exemplul anterior sunt egale
		boolean Asu = true;
		if(a==b){
			 Asu = true;
		}else {
			Asu = false;
		}
		System.out.println(Asu);
		
		//Exemplul 8: Determinati si afisati rezultatul ridicarii la putere a doua numere intregi (declarate de voi), folosind operatiunea "for"
		for (int j=0; j<d; j++ ){
			b = b * c;
		}
		System.out.println(b);
		//Exemplul 8b: Declarati un numar intreg si gasiti si afisati, printr-o instructiune repetitiva si una de decizie, cel mai mare numar par, mai mic sau egal cu cel initial
		int par = 16;
		for (int o=par-1; o>=2; o--){
			if(o%2 == 0){
				System.out.println(o);
				break;
			}
		}
		
		//Exemplul 9: Declarati 2 numere intregi si verificati rezultatul adunarii lor astfel: daca este 4, atunci afisati "Numerele sunt bune", daca este 8, afisati "Numerele sunt okay", iar in orice alt caz afisati "Numere nu sunt bune"
		int unu = 2;
		int doi = 2;
		if (unu + doi == 4) {
			System.out.println("Numerele sunt bune");
		} else if(unu + doi == 8) {
			System.out.println("Numerele sunt okay");
		} else {
			System.out.println("Numere nu sunt bune");
		}
		
		//Exemplul 10: Declarati un vector de numere intregi de dimensiune 8. Adaugati, utilizand o instructiune repetitiva, numerele de la 1 la 8, in ordine crescatoare
		int vector[] = new int[8];
		for(int m=0; m<8; m++){
			vector[m] = m+1;
			System.out.println(m+1);
		}
		
		//Exemplul 10b: Declarati un vector cu 4 elemente (2 negative si 2 pozitive), calculati si afisati suma elementelor pozitive
		int[] anArray = {100, 200, -300, -400};
		for(int i6=0; i6<anArray.length; i6++){
			if(anArray[i6]>-1){
				System.out.println(anArray[i6]);
			}
		}
//CUM ADUN ELEMENTELE?
		//Exemplul 10c: Afisati vectorul declarat anterior. Apoi afisati-l in ordinea inversa a elementelor (utilizand o instructiune repetitiva)
		System.out.println(anArray[0]);
		System.out.println(anArray[1]);
		System.out.println(anArray[2]);
		System.out.println(anArray[3]);
		for	(int a1=anArray.length-1; a1>-1; a1--){
			System.out.println(anArray[a1]);
		}
		System.out.println(anArray.length);
		//Exemplul 11: Declarati un vector de numere reale de dimensiune 4. Adaugati manual 4 elemente in acest vector si afisati-l.
		double vector2[]=new double[4];
		vector2[0] = 2.1;
		vector2[1] = 8.1;
		vector2[2] = 4.1;
		vector2[3] = 5.7;
		for	(int a1=0; a1<vector2.length; a1++){
			System.out.println(vector2[a1]);
		}
		
		//Exemplul 12: Cautati si afisati cel mai mare element din vectorul declarat anterior.
	        double largest = Integer.MIN_VALUE;
	        for(int i4 =0; i4<vector2.length; i4++) {
	            if(vector2[i4] > largest) {
	                largest = vector2[i4];
	            }
	        }
	        System.out.println("Largest number in array is : " +largest);
		//Exemplul 13: Declarati un vector de obiecte de tip String, de orice dimensiune, populati-o cu cuvinte random si, utilizand o instructiune repetitiva, adaugati, la finalul fiecarui cuvant, sufixul "ului"
		String[] nextArray = new String[4];
		nextArray[0] = "Tip";
		nextArray[1] = "Catel";
		nextArray[2] = "Sand";
		nextArray[3] = "Petr";
		for(int n=0; n<nextArray.length; n++){
			System.out.println(nextArray[n] + "ului");
		}
		//Exemplul 14: Declarati doi vectori de minim 3 numere intregi si, utilizand instructiuni repetitive si decizionale, afisati pe ecran cate elemente au in comun
		int[] Array3 = {350, 240, -300, -400};
		int[] Array4 = {100, -300, 240, 400};
		for(int i3=0; i3<Array3.length; i3++)
			for(int i4=0; i4<Array3.length; i4++){
				if(Array3[i3] == Array4[i4]){
					System.out.println(Array3[i3]);
					break;
				}
			}
		
		
		//Exemplul 15: Declarati o matrice patratica de numere intregi (2,2) si populati-o cu valori de 0. Apoi setati valoarea de pe pozitia 1,2 sa fie 1
		int[][] matrice = new int[2][2];
		for (int row = 0; row < matrice.length; row++ )
		     for (int column = 0; column < matrice.length; column++ )
		     {
		    	 matrice[row][column] = 0;
		    	 matrice[1][0] = 1;
		    	 System.out.println( matrice[row][column]);
		     }

	}
}
