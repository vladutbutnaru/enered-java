package com.enered.examples;

public class Main {

	public static void main(String args[]){
		int x = 100;
		int sum = 0;
		//Calculati si afisati suma primelor x numere pare (folosind o structura repetitiva
		for (int i = 0; i <x+1; i++) {
			
			if(i%2 == 0){
				sum += i;
			}
			
		}
		System.out.print("Sum of even numbers is:"+ sum);
		
		int[] numereFaine = {1,2,3,8,50,120,400,7,3,3,90,-4,-124,824,0};
		int sum1 = 0;
		//Fie vectorul numereFaine. Calculati si afisati minimul, maximul si media aritmetica a elementelor lui.
        int smallest = numereFaine[0];
        int largetst = numereFaine[0];
        for(int i1=0; i1< numereFaine.length; i1++)
        {
                if(numereFaine[i1] > largetst)
                        largetst = numereFaine[i1];
                else if (numereFaine[i1] < smallest)
                        smallest = numereFaine[i1];
               
        }
        for(int i2=0; i2< numereFaine.length; i2++){
        	sum1 =sum1 + numereFaine[i2];
        	                	
        }
        System.out.println("\n"+"Largest Number is : " + largetst);
        System.out.println("Smallest Number is : " + smallest);
        System.out.println("Arithmetic mean is  : " + sum1/numereFaine.length);

		String[] cuvinte = {"nume","mers","activitate","sofer","tablou","caiet","program"};
		//Fie vectorul cuvinte. Adaugati fiecarui cuvant din el prefixul "pre" si sufixul "lui" si afisati-le, despartite prin caracterul ","
		for(int n=0; n<cuvinte.length; n++){
			System.out.println("Pre" + "," + cuvinte[n] + "," + "lui");
		}
		
		int numarator = 7;
		int numitor = 3;
		//Avand numaratorul si numitorul de mai sus, calculati si afisati catul si restul impartirii lor
		int w = numarator / numitor;
		double v = numarator % numitor;
		System.out.println(w);
		System.out.println(v);
		//Folosind vectorul numereFaine de mai sus, inlocuiti elementele impare cu numarul 0
		for (int column = 0; column < numereFaine.length; column++ )
		     {
			if(numereFaine[column]%2 != 0)
				numereFaine[column] = 0;
		    	 System.out.println( numereFaine[column]);
		     }
		
		int[][] matrice = new int[2][2];
		matrice[0][0] = 1;
		matrice[0][1] = 2;
		matrice[1][0] = 2;
		matrice[1][1] = 7;
		int sumadp = 0;
		int sumaad = 0;
		//Avand matricea de mai sus, calculati si afisati produsul numerelor de pe diagonala principala, impartit la produsul numerelor de pe diagonala secundara
        // Suma diagonalei principale
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (i == j) {
                	sumadp += matrice[i][j];
                }
            }
        }
        // Suma diagonalei secundare
        for (int i = 0, j = matrice[i].length - 1; i < matrice.length; i++, j--) {
        	sumaad += matrice[i][j];
        }
 
		System.out.println("Suma diagonalei secundare este " + sumaad);
        System.out.println("Suma diagonalei principale este " + sumadp);
        System.out.println("Suma diagonalei principale impartita la suma diagonalei secundare " + sumadp / sumaad);

		
		//Creati un vector de cuvinte, apoi concatenati-le pentru a alcatui 2 propozitii corecte dpdv gramatical (si afisati-le)
		String[] cuvinteFaine = {"Astazi ","am ","invatat ","JAVA ","toata ","ziua!"};
		String primaprop = cuvinteFaine[0] + cuvinteFaine[1] + cuvinteFaine[2] + cuvinteFaine[4] + cuvinteFaine[5];
		String adouaprop = cuvinteFaine[0] + cuvinteFaine[1] + cuvinteFaine[2] + cuvinteFaine[3];
		System.out.println(primaprop);
		System.out.println(adouaprop);
		//Calculati (printr-o instructiune repetitiva) si afisati 8! (factorial)
		int n = 8;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            System.out.println(fact);
        }
        
		
		double[] vectorFain = {2.1, 5.4, 4.3, 9.8, 7.11, 4.13, 8, 9, -4.2, 48};
		
		//Folosind vectorFain, creati un alt vector al carui elemente sa fie egale cu formula (element * pozitieElement) din vectorul principal
		//ex: vectorNou[0] = 2.1 (elementul de pe pozitia 0 din vectorFain) * 0 (pozitia lui)
		//ex2: vectorNou[4] = 7.11 * 4 ...etc
		
		for (int q3 = 0; q3 < vectorFain.length; q3++) 
		{
			vectorFain[q3] *= q3;
			System.out.println(vectorFain[q3]);
		}
		
	}
}
