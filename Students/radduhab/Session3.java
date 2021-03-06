package ro.enered.session3;

public class Main {
	public static void main(String[] args) {
		String[] animale = {"caine", "pisica", "tigru", "sarpe", "peste", "veverita"};
	//Folosind o structura de tip Switch, Case, Break, verificati cuvintele din vectorul animale astfel:
    //Daca este animal domestic (Caine, Pisica, Peste) - afisati pe ecran animale[x] (pozitia curenta) " este animal domestic"
	//Daca ne aflam in cazul Tigru sau Sarpe - afisati pe ecrane animale[x] " este animal salbatic"
	//In orice alt caz afisati "Nu stim ce tip de animal este " + animale[x]
		for(String x:animale){
			switch(x){
			case "caine":
			case "pisica":
			case "veverita":
				System.out.println(x + " este animal domestic");
				break;
			case "tigru":
			case "sarpe":
				System.out.println(x + " este animal salbatic");
				break;
				default:
					System.out.println("Nu stim ce animal este " + x);
			}
		}

		
		
		int a = 8;
		//Folosind o conditionala cu conditii multiple, daca numarul stocat in variabila a este mai mic decat 10 si mai mare decat 8, afisati 
		//Textul "Numarul este bun", altfel, afisati textul "Numarul nu este bun"
		if(a<10&&a>8){
			System.out.println("Numarul este bun");
		}
		else 
		System.out.println("Numarul nu este bun");
		
		//sau varianta cu switch case
		
		int p=8;
		switch (p){
		case 9:
			System.out.println("Numarul nu este bun");
			break;
			default:
				System.out.println("Numarul este bun");
		}
		
		
		//sau varianta 3
		/*
		int ab=8;
		boolean itsok =ab>8;
		int itsokInt = Integer.parseInt("" + itsok);
		switch (itsokInt){
		case 1:
			System.out.println("Numarul este bun");
			break;
			default:
				System.out.println("Numarul nu este bun");
		}
		*/
		int n = 15;
		//Calculati si afisati suma armonica. Formula este: harmonic(x) = 1 + 1/2 + 1/3 + 1/4 + ...+ 1/x
		//Daca aceasta este mai mare decat 1.3 sau este mai mica decat 3, afisati patratul acesteia
		double arm=0.00;
		for(int x=1;x<=n;x++){
			arm+=(1/(double)x);
		}
		System.out.println(arm);
		//Afisati, folosind 2 structuri repetitive, un patrat de 5/5, care contine doar elemente "#".
		//Apoi, folosind acelasi patrat, inlocuiti elementele de pe diagonala principala cu "*";
	int i;
	int j;
			for(i=0;i<=4;i++){
				for(j=0;j<=4;j++)
					System.out.print("#");
				System.out.println();
			}
			System.out.println();
			for(i=0;i<=4;i++){
				for(j=0;j<=4;j++)
					if(i==j) System.out.print("*");
					else System.out.print("#");
				System.out.println();
			}
		
		//Construiti si afisati tabla inmultirii lui 9 
		/*
		 *  * |  1  2  3  4  5  6  7  8  9
			-------------------------------
 			1 |  1  2  3  4  5  6  7  8  9
 			2 |  2  4  6  8 10 12 14 16 18
 			3 |  3  6  9 12 15 18 21 24 27
 			4 |  4  8 12 16 20 24 28 32 36
 			5 |  5 10 15 20 25 30 35 40 45
			6 |  6 12 18 24 30 36 42 48 54
 			7 |  7 14 21 28 35 42 49 56 63
 			8 |  8 16 24 32 40 48 56 64 72
 			9 |  9 18 27 36 45 54 63 72 81
		 * 
		 * 
		 */
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
		
		int m = 1234994;
		//Calculati si afisati inversul numarului m (4994321).
		//Formati un numar nou, utilizand doar cifrele pare ale numarului m.
		//Daca noul numar are un numar impar de cifre si ele sunt mai mici decat 9 (toate), afisati "OK", altfel, afisati "KO"
		int r=0;
		while(m>0){
			r=m*10+m%10;
			m=m/10;
		}
		
		int h = 3;
		int min = 30;
		//Mai sus aveti 2 variabile care semnifica un cronometru care porneste de la 3 ore, 30 de minute.
		//Afisati, folosind structuri repetitive, toate iteratiile prin care trece acest cronometru (sub forma h:min), pana ajunge la 2 ore si 50 de minute
		while(h>=0){
			System.out.println(h +":" + min);
			if(min>0){
				min-=1;
			} else{
				h-=1;
				min=59;
			}
			if(h==2&&min==50){
				break;
			}
		}
		//Gasiti cea mai mare cifra a numarului 9 factorial
		
		int a1=1239173;
		int max=0;
		while(a1>0){
			if(a%10>max)
				max=a%10;
			a1/=10;
			if(max==9)
				break;
		}
	
		//Formati un numar din prima si ultima cifra a ariei unui triunghi dreptunghic cu catetele egale cu 18;
	
		
		int x = 7;
		int z = 194;
		/*Folosind operatorul conditional, calculati de cate sticle de cate x litri fiecare este nevoie pentru a umple un vas de y litri. 
		Exemplu: 
		daca x=4 si y=20 , atunci e nevoie de 5 sticle 
		daca x=4 si y=23 , atunci e nevoie de 6 sticle
		*/
		if(z%x==0)
			System.out.println(z/x);
		else
			System.out.println(z/x+1);
		
		int q = 1024534;
		//Se citeste un numar natural j. Sa se determine daca este cub perfect.
		
		int k = 13;
	    /*
	     * Se afiseze pe ecran un triunghi de forma: 
* 
** 
*** 
..... 
***...* (k caractere *)
	     * 
	     */
	
			
	
	}
}
