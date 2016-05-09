package com.enered.examples;

public class Main {

	public static void main(String args[]) {
		int x = 100;
		//Calculati si afisati suma primelor x numere pare (folosind o structura repetitiva
		int suma = 0;
		int nr = 2;
		while (nr <=100){
			suma = suma + nr;
			nr = nr +2;
		}
			System.out.println("Suma primelor x numere pare este: " + suma);
	
		int[] numereFaine = {1,2,3,8,50,120,400,7,3,3,90,-4,-124,824,0};
		//Fie vectorul numereFaine. Calculati si afisati minimul, maximul si media aritmetica a elementelor lui.
		int min =0;
		int max =0;
		int mediearitm = 0;
		int suma2 = 0;
		for (int i=0; i<numereFaine.length; i++){
			if (numereFaine[i]>max){
				max = numereFaine[i];
		}else if (numereFaine[i]<min){
			min = numereFaine[i];
		}
			suma2 += numereFaine[i];
		}
		mediearitm = suma2/numereFaine.length;
				System.out.println("Numarul minim este: " + min);
				System.out.println("Numarul maxim este: " + max);
				System.out.println("Media aritmetica este: " + mediearitm);
				
		String[] cuvinte = {"nume","mers","activitate","sofer","tablou","caiet","program"};
		//Fie vectorul cuvinte. Adaugati fiecarui cuvant din el prefixul "pre" si sufixul "lui" si afisati-le, despartite prin caracterul ","
		
		for (int i =0; i<cuvinte.length; i++){
			cuvinte[i] = "pre " + cuvinte[i] + " lui ";
			System.out.print(cuvinte[i] + ",");
		}
			System.out.println("");
			
		int numarator = 7;
		int numitor = 3;
		//Avand numaratorul si numitorul de mai sus, calculati si afisati catul si restul impartirii lor
		int cat = numarator/numitor;
		int rest = numarator%numitor;
		System.out.println("Catul impartirii celor doua numere este: " + cat + " iar restul este: "+ rest);
		
		
		//Folosind vectorul numereFaine de mai sus, inlocuiti elementele impare cu numarul 0
		
		for (int i= 0; i<numereFaine.length; i++){
			if (numereFaine[i]%2==0){
				numereFaine[i] = 0;
			}	
		}
		
		int[][] matrice = new int[2][2];
		matrice[0][0] = 1;
		matrice[0][1] = 2;
		matrice[1][0] = 2;
		matrice[1][1] = 7;
		
		//Avand matricea de mai sus, calculati si afisati produsul numerelor de pe diagonala principala, impartit la produsul numerelor de pe diagonala secundara
		double produsdiag1, produsdiag2, rezultat;
		produsdiag1 = 1;
		produsdiag2 = 1;
		rezultat = 0;
		for (int h =0; h<matrice.length; h++){
			produsdiag1 = produsdiag1 * matrice[h][h];
			int j = (matrice.length -1)-h;
			produsdiag2 = produsdiag2*matrice[h][j];
			
		}
		rezultat = produsdiag1/produsdiag2;
		System.out.println("Rezultatul impartirii celor doua diagonale este: " + rezultat);
		
		
		
		//Creati un vector de cuvinte, apoi concatenati-le pentru a alcatui 2 propozitii corecte dpdv gramatical (si afisati-le)
		String cuvintelesunt[] = {"Cezar", "este", "catel", "are", "invata", "un", "Java"};
		System.out.println("Prima propozitie este: " + cuvintelesunt[0] + " " + cuvintelesunt[4] + " " + cuvintelesunt[6]);
		System.out.println("A doua propozitie este: " + cuvintelesunt[0] + " " + cuvintelesunt[3] + " " + cuvintelesunt[5] + " " + cuvintelesunt[2]);
		
				
		//Calculati (printr-o instructiune repetitiva) si afisati 8! (factorial)
		
		int rezultat2 = 1;
		for (int m = 8; m >=1;m--){
			rezultat2 *= m;
		}
		System.out.println("Rezultatul lui 8! este: " + rezultat2);
		
		double[] vectorFain = {2.1,5.4,4.3,9.8,7.11,4.13,8,9,-4.2,48};
		//Folosind vectorFain, creati un alt vector al carui elemente sa fie egale cu formula (element * pozitieElement) din vectorul principal
		//ex: vectorNou[0] = 2.1 (elementul de pe pozitia 0 din vectorFain) * 0 (pozitia lui)
		//ex2: vectorNou[4] = 7.11 * 4 ...etc
		double vectorNou[] = new double[vectorFain.length];
		for (int w =0; w<vectorFain.length; w++){
			vectorNou[w] = vectorFain[w]*w;
			System.out.println(vectorNou[w]);
		}
		
	}
	}

