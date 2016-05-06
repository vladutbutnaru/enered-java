package ro.enered.examples;

public class Main {
	

			public static void main(String [] args) {
				// In acest exemplu vom exersa lucrul cu primitivele din limbajul Java, cu operatiile de baza, cu conditionalele, cu structurile repetitive si cu vectorii
				
				//Exemplul 1: Declarati 2 numere intregi si afisati suma lor
				
				int a = 3;
				int b = 4;
				int c = a+b;
				
				System.out.println(c);

				
				//Exemplul 2: Declarati 4 numere reale si afisati rezultatul inmultirii lor
				
				double d = 2.3;
				double r = 4.5;
				double s = 2.5;
				double w = 1.7;
				double l = d*r*s*w;
				
				System.out.println(l);
				//Exemplul 2b: Declarati 2 numere intregi si afisati catul si restul impartirii lor
				
				int h = 3;
				int g = 6;
				int k = h/g;
				int t = h%g;
				
				System.out.println(k);
				System.out.println(t);
				
				
				//Exemplul 3: Declarati 2 numere intregi pozitive si unul negativ si afisati rezultatul adunarii primelor 2, inmultit cu al treilea numar (cel negativ)
				
				int primul = 4;
				int doilea = 6;
				int trei = -3;
				int rezultat = (primul+doilea)*trei;
				
				System.out.println(rezultat);
				
				
				//Exemplul 4: Declarati 2 variabile de tip String si concatenati-le, astfel incat sa afisati textul "Ma numesc " + nume + " si invat " + curs
				
				String nume = "Bogdan ";
				String curs = " Java";
				
				System.out.println("Ma numesc "+ nume + " si invatz "+ curs);
				//Exemplul 5: Declarati 2 numere intregi si afisati-l pe cel mai mare
				
				int pnum = 4;
				int dnum = 8;
				
				if (pnum<dnum){
					
					System.out.println(dnum);
				}else {
					System.out.println(pnum);
				}
					
				
				
				//Exemplul 5b: Declarati 2 numere intregi pozitive care reprezinta lungimile laturilor unui triunghi dreptunghic. Calculati si afisati aria acestuia
				
			
				
				//Exemplul 6: Declarati 2 numere intregi si afisati textul "Numarul " + nr1 " este mai mare decat numarul " + nr2, in functie de relatia dintre cele 2
				
				int nr1 = 9;
				int nr2 = 8;
				
				System.out.println("Numarul "+ nr1 +" este mai mare decat numarul "+ nr2);
				//Exemplul 7: Declarati o variabile de tip boolean care sa fie true daca cele doua numere declarate in exemplul anterior sunt egale
				
			 
				//Exemplul 8: Determinati si afisati rezultatul ridicarii la putere a doua numere intregi (declarate de voi), folosind operatiunea "for"
				
				int yy = 2;
				int zz = 3;
				int qq = 1;
				for (int i=0;i<zz;i++){
				  qq=qq*yy;
				}
				System.out.println(qq);
				
				
				
				//Exemplul 8b: Declarati un numar intreg si gasiti si afisati, printr-o instructiune repetitiva si una de decizie, cel mai mare numar par, mai mic sau egal cu cel initial
				
				
				int u = 10;
				
				for (int j=u;j>=2;j--){
					if (j%2==0){
						System.out.println(j);
					break;
					}
					
				}
				
				
				//Exemplul 9: Declarati 2 numere intregi si verificati rezultatul adunarii lor astfel: daca este 4, atunci afisati "Numerele sunt bune", daca este 8, afisati "Numerele sunt okay", iar in orice alt caz afisati "Numere nu sunt bune"
				
				int iu = 4;
				int lo = 6;
				int adu = iu+lo;
				
				if (adu == 4){
					System.out.println("numerele sunt bune");
				}else {
						if (adu == 8){
							System.out.println("numerele sunt ok");
						}else {
								System.out.println("numerele nu sunt bune");
								
							}
						}
					}
				    
				
				
				
				
				//Exemplul 10: Declarati un vector de numere intregi de dimensiune 8. Adaugati, utilizand o instructiune repetitiva, numerele de la 1 la 8, in ordine crescatoare
				int vec [] = new int[8];{
				 
				for (int v = 0; v<7 ;v++){
					vec[v]=v+1;
				
					System.out.println(v+1);
			
			
				}
				
				//Exemplul 10b: Declarati un vector cu 4 elemente (2 negative si 2 pozitive), calculati si afisati suma elementelor pozitive
				
				int vector =new int [4];
				vector[0]=-1;
				vector[1]=7;
				vector[2]=-3;
				vector[3]=9;
				
				int sun=0;
				
				for (int re=0;re<4;re++){
					if(vector[re]>0){
						sum+=vector[v];
					}
				}
				//Exemplul 10c: Afisati vectorul declarat anterior. Apoi afisati-l in ordinea inversa a elementelor (utilizand o instructiune repetitiva)
				
				
				//Exemplul 11: Declarati un vector de numere reale de dimensiune 4. Adaugati manual 4 elemente in acest vector si afisati-l.
				
				
				//Exemplul 12: Cautati si afisati cel mai mare element din vectorul declarat anterior.
			
				
				//Exemplul 13: Declarati un vector de obiecte de tip String, de orice dimensiune, populati-o cu cuvinte random si, utilizand o instructiune repetitiva, adaugati, la finalul fiecarui cuvant, sufixul "ului"
				
				
				//Exemplul 14: Declarati doi vectori de minim 3 numere intregi si, utilizand instructiuni repetitive si decizionale, afisati pe ecran cate elemente au in comun
				
				
				//Exemplul 15: Declarati o matrice patratica de numere intregi (2,2) si populati-o cu valori de 0. Apoi setati valoarea de pe pozitia 1,2 sa fie 1
				
				
				
			
		
		
		
		
	}
}

