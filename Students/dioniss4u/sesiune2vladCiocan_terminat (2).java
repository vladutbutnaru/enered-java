package ro.enered.sesiune2;

public class main {
	public static void main(String args[]){
		// In acest exemplu vom exersa lucrul cu primitivele din limbajul Java, cu operatiile de baza, cu conditionalele, cu structurile repetitive si cu vectorii
		
		//Exemplul 1: Declarati 2 numere intregi si afisati suma lor
		int ex1nr1=2;
		int ex1nr2=5;
		int sum=ex1nr1+ex1nr2;
		System.out.println("Suma numerelor definite " + ex1nr1 + " si " + ex1nr2 + " este " + sum );
		
		//Exemplul 2: Declarati 4 numere reale si afisati rezultatul inmultirii lor
		double ex2nr1=4.2;
		double ex2nr2=5.5;
		double ex2nr3=6.2;
		double ex2nr4=7.7;
		double sum2=ex2nr1+ex2nr2+ex2nr3+ex2nr4;
		System.out.println(sum2);
		//Exemplul 2b: Declarati 2 numere intregi si afisati catul si restul impartirii lor
		int a=7;
		int b=2;
		int rest=a%b;
		int cat=a/b;
		System.out.println("Restul impartirii este " + rest);
		System.out.println("Catul impartirii este " + cat);;
		
		//Exemplul 3: Declarati 2 numere intregi pozitive si unul negativ si afisati rezultatul adunarii primelor 2, inmultit cu al treilea numar (cel negativ)
		int a1= 2;
		int b1=4;
		int c1= -6;
		int sum1 =(a1+b1)*c1;
		System.out.println("rezultatul inmultirii celor 3 variabile este " +sum1);
		
		
		//Exemplul 4: Declarati 2 variabile de tip String si concatenati-le, astfel incat sa afisati textul "Ma numesc " + nume + " si invat " + curs
		String nume1 = "Vlad";
		String nume2 = "Java";
		System.out.println("ma numesc " + nume1 + " si invat " + nume2 );
		
		//Exemplul 5: Declarati 2 numere intregi si afisati-l pe cel mai mare
		if(a1<b1){
			System.out.println("Numarul " + a1 + " este mai mare ca numerul " + b1);
		}else if(a1>b1){
			System.out.println("Numarul " + a1 + " este mai mic ca numerul " + b1);
			
		}else{
			System.out.println("Numerele sunt egale");
		}
		
		//Exemplul 5b: Declarati 2 numere intregi pozitive care reprezinta lungimile laturilor unui triunghi dreptunghic. Calculati si afisati aria acestuia
		int a2=3;
		int b2=4;
		System.out.println("aria triunghiului este " + (a2*b2)/2);
	
		
		//Exemplul 6: Declarati 2 numere intregi si afisati textul "Numarul " + nr1 " este mai mare decat numarul " + nr2, in functie de relatia dintre cele 2
		if(a2<b2){
			System.out.println("Numarul " + a2 + " este mai mare ca numerul " + b2);
		}else if(a2>b2){
			System.out.println("Numarul " + a2 + " este mai mic ca numerul " + b2);
			
		}else{
			System.out.println("Numerele sunt egale");
		}
		
		//Exemplul 7: Declarati o variabile de tip boolean care sa fie true daca cele doua numere declarate in exemplul anterior sunt egale
		boolean egale = false;
		if(a2==b2){
			egale=true;
		}
		System.out.println(egale);
		//Exemplul 8: Determinati si afisati rezultatul ridicarii la putere a doua numere intregi (declarate de voi), folosind operatiunea "for"
		int a3=3;
		int b3=7;
		int c3=1;
		for(int i=0;i<b3;i++){
			c3=c3*a3;
		}
		
		//Exemplul 8b: Declarati un numar intreg si gasiti si afisati, printr-o instructiune repetitiva si una de decizie, cel mai mare numar par, mai mic sau egal cu cel initial
		int x1=10;
		for(int i=x1;i<=x1;i--){
			if(i%2==0){
				System.out.println("Cel mai mare numar par este " + i);
				break;
			}
			
		}
		for(int o=1;o<x1;o++){
			if(o%2==0){
				System.out.println("Cel mai mic numar par a lui 10 este " + o);
				break;
			}
		}
		
		//Exemplul 9: Declarati 2 numere intregi si verificati rezultatul adunarii lor astfel: daca este 4, atunci afisati "Numerele sunt bune", daca este 8, afisati "Numerele sunt okay", iar in orice alt caz afisati "Numere nu sunt bune"
		int s1=2;
		int s2=5;
		int stotal = s1+s2;
		if(stotal == 4){
			System.out.println("Numerele sunt bune");
		}else if(stotal == 8){
			System.out.println("numerele sunt okey");
		}else{
			System.out.println("numerele nu sunt bune");
		}
		
		
		//Exemplul 10: Declarati un vector de numere intregi de dimensiune 8. Adaugati, utilizand o instructiune repetitiva, numerele de la 1 la 8, in ordine crescatoare
		int k[]=new int[8];
		for(int l=0;l<8;l++){
			int p = l+1;
			k[l]=p;
			System.out.println(k[l]);
		}
		
		//Exemplul 10b: Declarati un vector cu 4 elemente (2 negative si 2 pozitive), calculati si afisati suma elementelor pozitive
		int k1[]={2,-7,-19,3};
		int sumk=0;
		for(int h=0;h<k1.length;h++){
			if(k1[h]>=0){
				sumk=sumk+k1[h];
			}
		}
		System.out.println(sumk);
		
		//Exemplul 10c: Afisati vectorul declarat anterior. Apoi afisati-l in ordinea inversa a elementelor (utilizand o instructiune repetitiva)
		for(int t=0;t<k1.length;t++){
		
			System.out.println(k1[t]);
		}
		for(int t=k1.length-1;t>=0;t--){
			
			System.out.println(k1[t]);
		}
		
		//Exemplul 11: Declarati un vector de numere reale de dimensiune 4. Adaugati manual 4 elemente in acest vector si afisati-l.
		double q[]=new double[4];
		q[0]=2.3;
		q[1]=200.00;
		q[2]=6.9;
		q[3]=99.14;
		for(int i1=0;i1<q.length;i1++){
			System.out.println(q[i1]);
			
		}
		
		//Exemplul 12: Cautati si afisati cel mai mare element din vectorul declarat anterior.
		double max=0;
		double min=0;
		for(int e=1;e<q.length;e++){
			if(q[e]>max){
				max=q[e];
				
			}else if(q[e]<min){
				min=q[e];
			}
		}
			System.out.println("Cel mai mare numar declarat in vectorul q este " + max);
		
		//Exemplul 13: Declarati un vector de obiecte de tip String, de orice dimensiune, populati-o cu cuvinte random si, utilizand o instructiune repetitiva, adaugati, la finalul fiecarui cuvant, sufixul "ului"
		String nume3[]={"caine","capac","jeton","furtun"};
		for(int t=0;t<nume3.length;t++){
			nume3[t]=nume3[t] + "ului";
			
		}
		
		//Exemplul 14: Declarati doi vectori de minim 3 numere intregi si, utilizand instructiuni repetitive si decizionale, afisati pe ecran cate elemente au in comun
		int ex1[]={3,4,6};
		int ex2[]={4,1,3};
		System.out.println("Numerele care le au in comun cei doi vectori sunt :");
		for(int t1=0;t1<3;t1++){
			if(ex1[0]==ex2[t1]){
				System.out.print(ex2[t1]);
				
			}else if(ex1[1]==ex2[t1]){
				System.out.print(ex2[t1]);
			
			}else if(ex1[2]==ex2[t1]){
				System.out.print(ex2[t1]);
		
			}
			
		}
		
		//Exemplul 15: Declarati o matrice patratica de numere intregi (2,2) si populati-o cu valori de 0. Apoi setati valoarea de pe pozitia 1,2 sa fie 1
		
		int[][] hex={{0,0},{0,0}};
		hex[0][1]=1;
		
		
		
		}
	}


