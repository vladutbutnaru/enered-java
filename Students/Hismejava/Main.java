package ro.hisme.example;

public class Main { 
 	public static void main(String args[]){ 
 		// In acest exemplu vom exersa lucrul cu primitivele din limbajul Java, cu operatiile de baza, cu conditionalele, cu structurile repetitive si cu vectorii 
 		 
 		//Exemplul 1: Declarati 2 numere intregi si afisati suma lor 
 	//	int a = 4;
 	//	int b = 5;
 	//	int c= a+b;
 	//	System.out.println(c);
 		 
 		 
 		//Exemplul 2: Declarati 4 numere reale si afisati rezultatul inmultirii lor 
 	//	float x = 6.4f;
 	//	float y = 8;
 	//	float z = 3;
 		//float i = 4;
 	//	float j = x*y*z*i;
 	//	System.out.println(j);
 		
 		
 		
 				
 		 
 		 
 		//Exemplul 2b: Declarati 2 numere intregi si afisati catul si restul impartirii lor 
 	//	int a = 3;
 	//	int b = 2;
 	//	int c = a/b;
 	//	int d = a%b;
 	//	System.out.println(c);
 		//System.out.println(d);
 		 
 		 
 		//Exemplul 3: Declarati 2 numere intregi pozitive si unul negativ si afisati rezultatul adunarii primelor 2, inmultit cu al treilea numar (cel negativ) 
 		
 		//int a = 2;
 		//int b = 5;
 		//int c =-4;
 		//int d = (a+b)*c;
 		//System.out.println(d);
 		 
		 
 		//Exemplul 4: Declarati 2 variabile de tip String si concatenati-le, astfel incat sa afisati textul "Ma numesc " + nume + " si invat " + curs 
 		
 	//	String a = "Vasile bate ";
 	//	String b = "femeia vinerea";
 	//	String c =a+b;
 	//	System.out.println(c);
 		
 		 
 		//Exemplul 5: Declarati 2 numere intregi si afisati-l pe cel mai mare 
 		
 	//	int a = 2;
 	//	int b = 4;
 	//	if (a/b <1){
 	//		System.out.println("b este mai mare ");
 	//	}else{System.out.println("a este mai mare");}
 		
 		 
 		 
 		//Exemplul 5b: Declarati 2 numere intregi pozitive care reprezinta lungimile laturilor unui triunghi dreptunghic. Calculati si afisati aria acestuia 
 		 
 	//	int a = 2;
 	 //   int b = 4;
 	//    int c = a*b;
 	//   System.out.println(c);
 		 
 		//Exemplul 6: Declarati 2 numere intregi si afisati textul "Numarul " + nr1 " este mai mare decat numarul " + nr2, in functie de relatia dintre cele 2 
 		 
    		 
 		//Exemplul 7: Declarati o variabile de tip boolean care sa fie true daca cele doua numere declarate in exemplul anterior sunt egale 
 		//  boolean a = true;
 		  
 		 
 		//Exemplul 8: Determinati si afisati rezultatul ridicarii la putere a doua numere intregi (declarate de voi), folosind operatiunea "for" 
 	//	 int a = 3;
 	//	 int b = 4;
 	//	 int c = 1;
 	//	 for (int i=0; i<b; i++){
 	//		 c = c* a;
 			 
 		// }
 		// System.out.println(c);
 		 
 		//Exemplul 8b: Declarati un numar intreg si gasiti si afisati, printr-o instructiune repetitiva si una de decizie, cel mai mare numar par, mai mic sau egal cu cel initial 
 	//	 int x = 10;
 //		 for (int x = 0; i >11; i++){
 			 
 		 
 		 
 		//Exemplul 9: Declarati 2 numere intregi si verificati rezultatul adunarii lor astfel: daca este 4, atunci afisati "Numerele sunt bune", daca este 8, afisati "Numerele sunt okay", iar in orice alt caz afisati "Numere nu sunt bune" 
 		 
 		 
 		//Exemplul 10: Declarati un vector de numere intregi de dimensiune 8. Adaugati, utilizand o instructiune repetitiva, numerele de la 1 la 8, in ordine crescatoare 
 		 
 		 
 		//Exemplul 10b: Declarati un vector cu 4 elemente (2 negative si 2 pozitive), calculati si afisati suma elementelor pozitive 
 		 
 		 
 		//Exemplul 10c: Afisati vectorul declarat anterior. Apoi afisati-l in ordinea inversa a elementelor (utilizand o instructiune repetitiva) 
 		 
 		 
 		//Exemplul 11: Declarati un vector de numere reale de dimensiune 4. Adaugati manual 4 elemente in acest vector si afisati-l. 
 		 
 		 
 		//Exemplul 12: Cautati si afisati cel mai mare element din vectorul declarat anterior. 
 	 
 		 
 		//Exemplul 13: Declarati un vector de obiecte de tip String, de orice dimensiune, populati-o cu cuvinte random si, utilizand o instructiune repetitiva, adaugati, la finalul fiecarui cuvant, sufixul "ului" 
 		 
 		 
 		//Exemplul 14: Declarati doi vectori de minim 3 numere intregi si, utilizand instructiuni repetitive si decizionale, afisati pe ecran cate elemente au in comun 
 		 
 		 
 		//Exemplul 15: Declarati o matrice patratica de numere intregi (2,2) si populati-o cu valori de 0. Apoi setati valoarea de pe pozitia 1,2 sa fie 1 
 		
			//Folosind o structura de tip Switch, Case, Break, verificati cuvintele din vectorul animale astfel:  

 		 
 	/*	String[] animale = {"caine", "pisica", "tigru", "sarpe", "peste", "veverita"};  
 		
 		for (String x:animale)
 		{
 			switch (x){
 			case "caine":
 			case  "pisica":
 			case  "veverita":	
 			System.out.println("animalele sunt domestice");
 			break;
 			case  "tigru":
 			case "sarpe":
 			case  "peste":	
 			System.out.println("animalele sunt salbatice");	
 			break;
 			
 			default :
 				System.out.println("nu stim");
 				break;
 			}
 		}
 			//Folosind o structura de tip Switch, Case, Break, verificati cuvintele din vectorul animale astfel:  
 		   //Daca este animal domestic (Caine, Pisica, Peste) - afisati pe ecran animale[x] (pozitia curenta) " este animal domestic"  
 			//Daca ne aflam in cazul Tigru sau Sarpe - afisati pe ecrane animale[x] " este animal salbatic"  
 		 //In orice alt caz afisati "Nu stim ce tip de animal este " + animale[x]  

 double arm= 0.00;		 	
 int n=15;
 for(int x=1;x<=n;x++){
	 arm+=(1/(double)x);
	 System.out.println(arm);
 }*/
 
 System.out.println("*\t|\t1\t2\t3\t4\t5\t6\t7\t8\t9\n");
 System.out.println("-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-");
 
 int[][] inmultire=new int[9][9];
 for(int x=0;x<inmultire.length;x++){
  System.out.print((x+1) + "\t|\t");
  for(int y=0;y<inmultire.length;y++){
   inmultire[x][y]=(x+1)*(y+1);
   System.out.print(inmultire[x][y] + "\t");
   
  }
  System.out.println();
 }
	 
 		int m = 1223451;
 		int n = 0;
while (m>0){
	n=n*10+m%10;
	m=m/10;
}

int h=3;
int min=30;

while (int h => 0){
	if(min >= 0){
		
	}
}


 	} 
 } 
