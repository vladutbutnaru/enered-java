package ro.enered.examples;

public class Main {
	
	public static void main (String [] args){

	
	
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
	
	int n = 0;
	
	while (m>0){
		n=n*10+m%10;
		m=m/10;
	}
	
	
	
	int h = 3;
	int min = 30;
	//Mai sus aveti 3 variabile care semnifica un cronometru care porneste de la 3 ore, 30 de minute.
	//Afisati, folosind structuri repetitive, toate iteratiile prin care trece acest cronometru (sub forma h:min), pana ajunge la 2 ore si 50 de minute
	
	while(h>=0){
		
		if (min>0){
			min-=1;
			}else{
				h-=1;
				min=59;
			}System.out.println(h+":"+min);
		
		if (h==2 && min==59){
			break;
		
		}
		
	}
	
	
	//Gasiti cea mai mare cifra a numarului 9 factorial
	
	
	//Formati un numar din prima si ultima cifra a ariei unui triunghi dreptunghic cu catetele egale cu 18;
	
	
	
	
	
	int x = 7;
	int y = 194;
	/*Folosind operatorul conditional, calculati de cate sticle de cate x litri fiecare este nevoie pentru a umple un vas de y litri. 
	Exemplu: 
	daca x=4 si y=20 , atunci e nevoie de 5 sticle 
	daca x=4 si y=23 , atunci e nevoie de 6 sticle
	*/
	
	
	
	
	
	
	int j = 1024534;
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