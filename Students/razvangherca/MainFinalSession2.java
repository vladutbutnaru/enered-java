package ro.enered.exemples;

public class MainFinalSession2 {
	public static void main(String args[]){
		// In acest exemplu vom exersa lucrul cu primitivele din limbajul Java, cu operatiile de baza, cu conditionalele, cu structurile repetitive si cu vectorii
		
		//Exemplul 1: Declarati 2 numere intregi si afisati suma lor
		
		int a=4;
		int b=7;
		System.out.println("Suma celor 2 numere este: ");
		System.out.println(a+b);
		
		
		//Exemplul 2: Declarati 4 numere reale si afisati rezultatul inmultirii lor
		float c=(float) 5.7;
		float d=(float) 4.3;
		float e=(float) 3.3;
		float f=(float) 4.9;
		System.out.println("Produsul celor 4 numere este: ");
		System.out.println(c*d*e*f);
		
		
		
		//Exemplul 2b: Declarati 2 numere intregi si afisati catul si restul impartirii lor
		
		int ab=78;
		int cd=40;
		System.out.println("Catul impartirii celor 2 numere este: ");
		System.out.println(ab/cd);
		System.out.println("Restul impartirii celor 2 numere este: ");
		System.out.println(ab%cd);
		
		
		
		//Exemplul 3: Declarati 2 numere intregi pozitive si unul negativ si afisati rezultatul adunarii primelor 2, inmultit cu al treilea numar (cel negativ)
		
		int ap=3;
		int bp=7;
		int cn=-2;
		System.out.println("Primele 2 nr pozitive adunate,apoi suma lor inmultita cu nr negativ este: ");
		System.out.println((ap+bp)*cn);
		
		
		//Exemplul 4: Declarati 2 variabile de tip String si concatenati-le, astfel incat sa afisati textul "Ma numesc " + nume + " si invat " + curs
		
		String numePrenume="Gherca Razvan";
		String curs="Java";
		System.out.println("Ma numesc "+numePrenume+" si invat "+curs+".");
		
		
		//Exemplul 5: Declarati 2 numere intregi si afisati-l pe cel mai mare
		int amax=7;
		int bmax=3;
		System.out.println("Maximul dintre 7 si 3 este: ");
		if(amax>bmax) System.out.println(amax);
		else System.out.println(bmax);
		
		
		//Exemplul 5b: Declarati 2 numere intregi pozitive care reprezinta lungimile laturilor unui triunghi dreptunghic. Calculati si afisati aria acestuia
		
		int lat1=9;
		int lat2=4;
		System.out.println("Aria triunghiului cu laturile 9 si 4 este: ");
		System.out.println((lat1*lat2)/2);
	
		
		//Exemplul 6: Declarati 2 numere intregi si afisati textul "Numarul " + nr1 " este mai mare decat numarul " + nr2, in functie de relatia dintre cele 2
		
		int nr1=17;
		int nr2=13;
		if(nr1>nr2) System.out.println("Numarul "+nr1+" este mai mare decat numarul "+nr2+".");
		else System.out.println("Numarul "+nr2+" este mai mare decat numarul "+nr1+".");
		
		//Exemplul 7: Declarati o variabile de tip boolean care sa fie true daca cele doua numere declarate in exemplul anterior sunt egale
		
		boolean test=true;
		if(nr1!=nr2) test=false;
		else test=true;
		System.out.println("Valoarea de adevar a intrebarii '17==13?' este: ");
		System.out.println(test);
		
		//Exemplul 8: Determinati si afisati rezultatul ridicarii la putere a doua numere intregi (declarate de voi), folosind operatiunea "for"
		int nr=7;
		int putere=3;
		int ridicare=1;
		for(int i=0;i<=putere-1;i++) ridicare=ridicare*nr;
		System.out.println("Valoarea numarului 7^3 este: ");
		System.out.println(ridicare);
		
		
		//Exemplul 8b: Declarati un numar intreg si gasiti si afisati, printr-o instructiune repetitiva si una de decizie, cel mai mare numar par, mai mic sau egal cu cel initial
		int nrinitial=57;
		int maxpar=-1;
		for(int i=1;i<=nrinitial;i++) if(i%2==0&& i>maxpar) maxpar=i;
		System.out.println("Cel mai mare numar par pana la valoarea 57 este: ");
		System.out.println(maxpar);
		
		
		//Exemplul 9: Declarati 2 numere intregi si verificati rezultatul adunarii lor astfel: daca este 4, atunci afisati "Numerele sunt bune", daca este 8, afisati "Numerele sunt okay", iar in orice alt caz afisati "Numere nu sunt bune"
		
		int number1=7;
		int number2=1;
		if(number1+number2==4) System.out.println("Numerele sunt bune! ");
		else if(number1+number2==8) System.out.println("Numerele sunt okay! ");
		else System.out.println("Numerele nu sunt bune! ");
		
		//Exemplul 10: Declarati un vector de numere intregi de dimensiune 8. Adaugati, utilizand o instructiune repetitiva, numerele de la 1 la 8, in ordine crescatoare
		
		int vect[]=new int[9];
		for(int i=1;i<=8;i++) vect[i]=i;
		System.out.println("Vectorul are urmatoarele valori");
		for(int i=1;i<=7;i++) System.out.print(vect[i]+",");
		System.out.print(vect[8]);
		System.out.println();
		
		
		//Exemplul 10b: Declarati un vector cu 4 elemente (2 negative si 2 pozitive), calculati si afisati suma elementelor pozitive
		
		int vectb[]={1,16,-3,-7};
		int summ=0;
		int i;
		for(i=0;i<=3;i++) if(vectb[i]>=0) summ=summ+vectb[i];
		System.out.println("Suma elementelor pare din vector este= "+summ);
		
		
		//Exemplul 10c: Afisati vectorul declarat anterior. Apoi afisati-l in ordinea inversa a elementelor (utilizand o instructiune repetitiva)
		System.out.println("Ordinea normala a elementelor: ");
		for(i=0;i<=2;i++) System.out.print(vectb[i]+",");
		System.out.print(vectb[3]);
		System.out.println();
		System.out.println("Ordinea inversa a elementerlor :");
		for(i=3;i>=1;i--) System.out.print(vectb[i]+",");
		System.out.print(vectb[0]);
		System.out.println();
		
		
		//Exemplul 11: Declarati un vector de numere reale de dimensiune 4. Adaugati manual 4 elemente in acest vector si afisati-l.
		
		float nrreale[]=new float[4];
		nrreale[0]=(float)12.3;
		nrreale[1]=(float)53.25;
		nrreale[2]=(float)3.14;
		nrreale[3]=(float)7.03;
		System.out.print("Vectorul de numere reale este : ");
		for(i=0;i<=2;i++) System.out.print(nrreale[i]+",");
		System.out.print(nrreale[3]);
		System.out.println();
		
		
		//Exemplul 12: Cautati si afisati cel mai mare element din vectorul declarat anterior.
		
		float maxi=(float)nrreale[0];
		for(i=1;i<=3;i++) if(nrreale[i]>maxi) maxi=nrreale[i];
		System.out.print("Elementul maxim din vectorul de numere reale este = "+maxi);
		System.out.println();
		
		//Exemplul 13: Declarati un vector de obiecte de tip String, de orice dimensiune, populati-o cu cuvinte random si, utilizand o instructiune repetitiva, adaugati, la finalul fiecarui cuvant, sufixul "ului"
		
		String words[]=new String[100];
		words[0]="masina";
		words[1]="camion";
		words[2]="barosan";
		for(i=0;i<=2;i++) words[i]=words[i]+"ului";
		System.out.println("Obiectele de tip string dupa adaugarea sufixlului 'ului' sunt : ");
		for(i=0;i<=1;i++) System.out.print(words[i]+",");
		System.out.print(words[2]);
		System.out.println();
		
		
		//Exemplul 14: Declarati doi vectori de minim 3 numere intregi si, utilizand instructiuni repetitive si decizionale, afisati pe ecran cate elemente au in comun
		
		int vect1[]={1,7,5};
		int vect2[]={1,3,5};
		int elemComune=0;
		for(i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
				if(vect1[i]==vect2[j]) elemComune=elemComune+1;
		}
		System.out.print("Cei doi vectori au "+elemComune+" elemente comune .");
		System.out.println();
		
		//Exemplul 15: Declarati o matrice patratica de numere intregi (2,2) si populati-o cu valori de 0. Apoi setati valoarea de pe pozitia 1,2 sa fie 1
		
		int matr[][]=new int[10][10];
		int j;
		for(i=0;i<=9;i++) for(j=0;j<=9;j++) matr[i][j]=0;
		matr[1][2]=1;
		System.out.println("Matricea obtinuta este: ");
		for(i=0;i<=9;i++)
		{
			for(j=0;j<=9;j++) System.out.print(matr[i][j]+" ");
			System.out.println();
		}
		
		
	}
}