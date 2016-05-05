package ro.enered.example;

public class main {
	public static void main(String args[]){
		// In acest exemplu vom exersa lucrul cu primitivele din limbajul Java, cu operatiile de baza, cu 
		//conditionalele, cu structurile repetitive si cu vectorii
		
		//Exemplul 1: Declarati 2 numere intregi si afisati suma lor
		
		int a=1;
		int b=3;
		int suma=a+b;
		System.out.println("suma lui a si b este " + suma);
		
		
		//Exemplul 2: Declarati 4 numere reale si afisati rezultatul inmultirii lor
		int x=2;
		int y=3;
		int z=6;
		int w=4;
		int inmultire = x*y*z*w;
		System.out.println("Rezultatul inmultirii este " + inmultire);
		
		
		//Exemplul 2b: Declarati 2 numere intregi si afisati catul si restul impartirii lor
		int rest=z%w;
		System.out.println("restul impartirii este " + rest);
		int cat=z%w;
		System.out.println("catul impartirii este " + cat);
		//Exemplul 3: Declarati 2 numere intregi pozitive si unul negativ si afisati rezultatul adunarii primelor 2,
		//inmultit cu al treilea numar (cel negativ)
		int d=-2;
		int inm2=(a+b)*d;
		System.out.println("rezultatul inmultirii lui d cu suma lui a si b este " + inm2);
		
		//Exemplul 4: Declarati 2 variabile de tip String si concatenati-le, astfel incat sa afisati textul
		//"Ma numesc " + nume + " si invat " + curs
		String nume= "Vlad";
		String curs= "Java";
		System.out.println("Ma numesc " + nume + " si invat " + curs);
		
		
		//Exemplul 5: Declarati 2 numere intregi si afisati-l pe cel mai mare
		if(a>b){
			System.out.println("a este mai mare ca b");
		}else if(a<b){
			System.out.println("b este mai mare ca a");
		}else{
			System.out.println("a este egal cu b");
		}
		
		//Exemplul 6: Declarati 2 numere intregi si afisati textul "Numarul " + nr1 " este mai mare decat numarul "
		//+ nr2, in functie de relatia dintre cele 2
		int nr1=3;
		int nr2=4;
		if(nr1>nr2){
			System.out.println("Numarul " + nr1 + " este mai mare decat numarul " + nr2);
		}else if(nr1==nr2){
			System.out.println("Numerele " + nr1 + " si " + nr2 + " sunt egale.");
		}else if(nr1<nr2){
			System.out.println("Numarul " + nr2 + " este mai mare decat numarul " + nr1);
		}
		
		//Exemplul 7: Declarati o variabile de tip boolean care sa fie true daca cele doua numere declarate 
		//in exemplul anterior sunt egale
		boolean egale;
		if(nr1==nr2){
			egale = true;
			
		}
		
		//Exemplul 8: Determinati si afisati rezultatul ridicarii la putere a doua numere intregi (declarate de voi),
		//folosind operatiunea "for"
		
		
		//Exemplul 8b: Declarati un numar intreg si gasiti si afisati, printr-o instructiune repetitiva si 
		//una de decizie, cel mai mare numar par, mai mic sau egal cu cel initial
		
		
		//Exemplul 9: Declarati 2 numere intregi si verificati rezultatul adunarii lor astfel:
		//daca este 4, atunci afisati "Numerele sunt bune", daca este 8, afisati "Numerele sunt okay",
		//iar in orice alt caz afisati "Numere nu sunt bune"
		
		
		//Exemplul 10: Declarati un vector de numere intregi de dimensiune 8. Adaugati, utilizand o
		//instructiune repetitiva, numerele de la 1 la 8, in ordine crescatoare
		
		
		//Exemplul 10b: Afisati vectorul declarat anterior. Apoi afisati-l in ordinea inversa a 
		//elementelor (utilizand o instructiune repetitiva)
		
		
		//Exemplul 11: Declarati un vector de numere reale de dimensiune 4. Adaugati manual 4 elemente in acest vector si afisati-l.
		
		
		//Exemplul 12: Cautati si afisati cel mai mare element din vectorul declarat anterior.
	
		
		
	}	

}
