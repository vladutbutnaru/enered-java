package ro.hisme.java;

public class Main {
	public static void main(String args[]){
		
		//int x = 100;
				
	//	for(int i=0;i<x;x-=2){
			
	//		System.out.println(x);
	//	}
			
		int[] numereFaine = {1,2,3,8,50,120,400,7,3,3,90,-4,-124,824,0};
		//Fie vectorul numereFaine. Calculati si afisati minimul, maximul si media aritmetica a elementelor lui.
		//Folosind vectorul numereFaine de mai sus, inlocuiti elementele impare cu numarul 0
		numereFaine[0] = 1;	
		numereFaine[1] = 2;	
		numereFaine[2] = 3;	
		numereFaine[3] = 8;	
		numereFaine[4] = 50;	
		numereFaine[5] = 120;	
		numereFaine[6] = 400;	
		numereFaine[7] = 7;	
		numereFaine[8] = 3;	
		numereFaine[9] = 3;	
		numereFaine[10] = 90;	
		numereFaine[11] = -4;	
		numereFaine[12] = -124;	
		numereFaine[13] = 824;	
		numereFaine[14] = 0;
		float media = 0;
		int min = 0;
		for(int i=0;i<numereFaine.length;i++){
		 min-=numereFaine.length;
			//	numereFaine[i]/2!=0;
			 media = media / numereFaine.length;
			 media = media +media;
			System.out.println(media);
			System.out.println(min);
		}
		
		
		
		String[] cuvinte = {"nume","mers","activitate","sofer","tablou","caiet","program"};
		//Fie vectorul cuvinte. Adaugati fiecarui cuvant din el prefixul "pre" si sufixul "lui" si afisati-le, despartite prin caracterul ","
		    
		    cuvinte[0]="nume";
			cuvinte[1]="mers";
			cuvinte[2]="activitate";
			cuvinte[3]="sofer";
			cuvinte[4]="tablou";
			cuvinte[5]="caiet";
			cuvinte[6]="program";
for(int i=0;i<cuvinte.length;i++){
	
	System.out.println("pre "+cuvinte[i]);
	
}		
		
		
int numarator = 7;
int numitor = 3;
	//Avand numaratorul si numitorul de mai sus, calculati si afisati catul si restul impartirii lor
int catul = 7/3;
int restul = 7%3;

System.out.println(catul);
System.out.println(restul);
		
		
		
		
		
		
	}
	
	
	
	
	
}
