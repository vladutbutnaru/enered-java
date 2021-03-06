package ro.enered.example;

public class main3 {
	public static void main(String[] args) {
		String[] animale = {"caine", "pisica", "tigru", "sarpe", "peste", "veverita"};
	//Folosind o structura de tip Switch, Case, Break, verificati cuvintele din vectorul animale astfel:
    //Daca este animal domestic (Caine, Pisica, Peste) - afisati pe ecran animale[x] (pozitia curenta) " este animal domestic"
		for (String x:animale){
			switch(x){
			case"caine":
			case"pisica":
			case"peste":
				System.out.println(x + " este animal domestic");
				break;
			case"sarpe":
			case"tigru":
			case"veverita":
				System.out.println(x + " este animal salbatic");
				break;
			}
		}
		
	//Daca ne aflam in cazul Tigru sau Sarpe - afisati pe ecrane animale[x] " este animal salbatic"
		
	//In orice alt caz afisati "Nu stim ce tip de animal este " + animale[x]
		
		
		
		
		
		
		int a = 8;
		int b = 10;
		//Folosind o conditionala cu conditii multiple, daca numarul stocat in variabila a este mai mic decat 10 si mai mare decat 8, afisati 
		//Textul "Numarul este bun", altfel, afisati textul "Numarul nu este bun"
		switch (a){
		case 9:
			System.out.println("Numarul este bun");
			break;
		default:
			System.out.println("Numarul nu este bun");
		}
		
		
		
		
		
		
		
		int n = 15;
		double arm = 0;
		//Calculati si afisati suma armonica. Formula este: harmonic(x) = 1 + 1/2 + 1/3 + 1/4 + ...+ 1/x
		for(int x=1; x<=n; x++){
			arm = (1/(double)x);
			System.out.println(arm);
			
		}
		//Daca aceasta este mai mare decat 1.3 sau este mai mica decat 3, afisati patratul acesteia
		
		
		//Afisati, folosind 2 structuri repetitive, un patrat de 5/5, care contine doar elemente "#".
		for (int q=0; q<=4; q++){
			for (int o=0; o<=4; o++) {
				if (q==o){
					System.out.print("*");
				}else{
					System.out.print("#");
				}
			}
			System.out.println();
	}
		//Apoi, folosind acelasi patrat, inlocuiti elementele de pe diagonala principala cu "*";
		
		
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
		int n1=0;
		while (m>0){
			n1=n1*10 + m%10;
			m = m/10;
		}
		System.out.println(+n1); 
		
		int h = 3;
		int min = 30;
		//Mai sus aveti 2 variabile care semnifica un cronometru care porneste de la 3 ore, 30 de minute.
		//Afisati, folosind structuri repetitive, toate iteratiile prin care trece acest cronometru (sub forma h:min), pana ajunge la 2 ore si 50 de minute
		while(h>=0){
			System.out.println(h +":" + min);
			if(min>=0){
				min-=1;
			}else {
				h-=1;
				min=59;
			}
		
			if(h==2 && min==50){
				break;
			}
		}
		
		//Gasiti cea mai mare cifra a numarului 9 factorial
		int n2 = 9;
        int fact = 1;
        for (int i = 1; i <= n2; i++) {
            fact *= i;
           
        }
        System.out.println(fact);
        
		//Formati un numar din prima si ultima cifra a ariei unui triunghi dreptunghic cu catetele egale cu 18;
        int c = 18;
        int n3 = 0;
        int aria = (c * c)/2;
        int lnr= aria%10;
        int fnr =0;
		while (aria>0){
			n3=n3*10 + aria%10;
			aria = aria/10;
		}
		if(n3 > 0) {
			fnr = n3%10;
		}
		System.out.println(fnr*10 + lnr);		
		
		
		
		
		int x = 7;
		int y = 194;
		double nrsticle = y/x;
		/*Folosind operatorul conditional, calculati de cate sticle de cate x litri fiecare este nevoie pentru a umple un vas de y litri. 
		Exemplu: 
		daca x=4 si y=20 , atunci e nevoie de 5 sticle 
		daca x=4 si y=23 , atunci e nevoie de 6 sticle
		
		*/
		if (nrsticle%2!=0){
			System.out.println(nrsticle+1);
		}
		
		
		
		
		//Se citeste un numar natural j. Sa se determine daca este cub perfect.
		int j = 1024534;
        double cub = Math.cbrt(j);
        System.out.println(cub);
        double r = Math.round(cub);
        if (j==r * r * r) {
            System.out.println(j + " este cub perfect");
        }
        else {
            System.out.println(j + " nu este cub perfect");

        }
		
		

	    /*
	     * Se afiseze pe ecran un triunghi de forma:
* 
** 
*** 
..... 
***...* (k caractere *)
	     * 
	     */
        for(int i=0;i<14;i++) {
            for(int j4=0;j4<14-i;j4++) {
                System.out.print(" ");

            }
           for(int k=0;k<=i;k++) {
               
               if (i==12){
             	   System.out.print(". ");
                }
               else{
            	   System.out.print("* ");
               }

           }

           System.out.println();  
       }

	}
}
