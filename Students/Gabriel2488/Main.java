package ro.curs2.exemples;

public class Main {
	
	public static void main(String[] args){

		// In acest exemplu vom exersa lucrul cu primitivele din limbajul Java, cu operatiile de baza, cu conditionalele, cu structurile repetitive si cu vectorii
		
				//Exemplul 1: Declarati 2 numere intregi si afisati suma lor
				
				int a=9;
				int b=5;
				int suma=a+b;
				System.out.println("Exercitiu 1 -->"+suma);
		
				//Exemplul 2: Declarati 4 numere reale si afisati rezultatul inmultirii lor
				
				double c=6.6;
				double d=3.4;
				int e=-3;
				System.out.println("Exercitiu 2 -->"+c*d*a*b);
				
				
				//Exemplul 2b: Declarati 2 numere intregi si afisati catul si restul impartirii lor
				
				System.out.println("Exercitiu 2b--> Catul este "+a/b+" iar restul este "+a%b);
				
				//Exemplul 3: Declarati 2 numere intregi pozitive si unul negativ si afisati rezultatul adunarii primelor 2, inmultit cu al treilea numar (cel negativ)
				System.out.println("Exercitiu 3 -->"+(a+b)/e);
				
				//Exemplul 4: Declarati 2 variabile de tip String si concatenati-le, astfel incat sa afisati textul "Ma numesc " + nume + " si invat " + curs
				
				String nume="Gabriel";
				String curs="Java";
				System.out.println("Exercitiu 4 --> Ma numesc "+nume+"si invat "+curs);
				
				//Exemplul 5: Declarati 2 numere intregi si afisati-l pe cel mai mare
				System.out.print("Exercitiu 5 -->");
				if(a>b){
					
					System.out.println("Numarul mai mare dintre " +a+ " si " +b+ " este "+a);
					
				}
				else{
					
					System.out.println("Numarul mai mare este"+b);
				}
				
				//Exemplul 5b: Declarati 2 numere intregi pozitive care reprezinta lungimile laturilor unui triunghi dreptunghic. Calculati si afisati aria acestuia
				
				System.out.println("Exercitiu 5b --> Aria dreptunghi este: "+(a*b)*2);
				
				//Exemplul 6: Declarati 2 numere intregi si afisati textul "Numarul " + nr1 " este mai mare decat numarul " + nr2, in functie de relatia dintre cele 2
				
				System.out.print("Exercitiu 6 --> ");
if(a>b){
					
					System.out.println("Numarul mai mare dintre " +a+ " si " +b+ " este "+a);
					
				}
				else{
					
					System.out.println("Numarul mai mare este"+b);
				}
				//Exemplul 7: Declarati o variabile de tip boolean care sa fie true daca cele doua numere declarate in exemplul anterior sunt egale
				Boolean bool;
				if(a==b){
					bool=true;
					
				}
				else{
					
				bool=false;	
				}
				System.out.println("Exercitiu 7 --> Boolean este "+bool );
				
				//Exemplul 8: Determinati si afisati rezultatul ridicarii la putere a doua numere intregi (declarate de voi), folosind operatiunea "for"
				
				for(int i=0; i<2; i++)
				{
					a=a*a;
					
					
				}
				
				System.out.print("Exercitiu 8 --> " );
				
				//Exemplul 8b: Declarati un numar intreg si gasiti si afisati, printr-o instructiune repetitiva si una de decizie, cel mai mare numar par, mai mic sau egal cu cel initial
				
				int numar=65;
				int max=0;
				for(int i=0; i<=numar; i++){
				if(i%2==0 && i<=65){
					max=i;
					
				}	
					
					
				}
				System.out.println(max);
				
				//Exemplul 9: Declarati 2 numere intregi si verificati rezultatul adunarii lor astfel: daca este 4, atunci afisati "Numerele sunt bune", daca este 8, afisati "Numerele sunt okay", iar in orice alt caz afisati "Numere nu sunt bune"
				System.out.print("Exercitiu 9 --> ");
				int n1=2;
				int n2=2;
				int rezultat=n1+n2;
				if(rezultat==4){
					
					System.out.println("Numerele sunt bune" );
					
				}
				else if(rezultat==8){
					
					System.out.println("Numerele sunt ok" );
				}
				else{
					
					System.out.println("Numerele nu sunt ok" );
					
				}
				
				
				//Exemplul 10: Declarati un vector de numere intregi de dimensiune 8. Adaugati, utilizand o instructiune repetitiva, numerele de la 1 la 8, in ordine crescatoare
				
				System.out.print("Exercitiu 10 --> ");
				int vector[]=new int[9];
				
				for(int i=1; i<9;i++){
	vector[i]=i;
					
					System.out.println(vector[i] );
					
				}
				//Exemplul 10b: Declarati un vector cu 4 elemente (2 negative si 2 pozitive), calculati si afisati suma elementelor pozitive
				System.out.print("Exercitiu 10b --> ");
				int a1[]=new int[4];
				a1[0]=-2;
				a1[1]=-8;
				a1[2]=4;
				a1[3]=5;
				int sum =0;
				
				for(int i=0; i<4; i++)
				{
				if(a1[i]>0)	{
					
					sum+=a1[i];
				}
				
				}
				
				System.out.println(sum);	
				//Exemplul 10c: Afisati vectorul declarat anterior. Apoi afisati-l in ordinea inversa a elementelor (utilizand o instructiune repetitiva)
				
				System.out.println("Exercitiu 10c --> ");
				
					for(int afiseaza:a1)
					System.out.println(afiseaza);
					for(int i=0; i<4; i++)
					{
						
						System.out.println(a1[i]);
						
						
					}
				
				//Exemplul 11: Declarati un vector de numere reale de dimensiune 4. Adaugati manual 4 elemente in acest vector si afisati-l.
				System.out.print("Exercitiu 11 --> ");
				double v3[]=new double[4];
				v3[0]=3.6;
				v3[1]=9.6;
				v3[2]=3.3;
				v3[3]=2.1;
				for(double vv:v3)
				System.out.println(vv);
				
				//Exemplul 12: Cautati si afisati cel mai mare element din vectorul declarat anterior.
				System.out.println("Exercitiu 12 --> ");
				
				//Exemplul 13: Declarati un vector de obiecte de tip String, de orice dimensiune, populati-o cu cuvinte random si, utilizand o instructiune repetitiva, adaugati, la finalul fiecarui cuvant, sufixul "ului"
				
				System.out.print("Exercitiu 13 --> ");
				//Exemplul 14: Declarati doi vectori de minim 3 numere intregi si, utilizand instructiuni repetitive si decizionale, afisati pe ecran cate elemente au in comun
				
				System.out.print("Exercitiu 14 --> ");
				//Exemplul 15: Declarati o matrice patratica de numere intregi (2,2) si populati-o cu valori de 0. Apoi setati valoarea de pe pozitia 1,2 sa fie 1
				System.out.print("Exercitiu 15 --> ");
	

}
}