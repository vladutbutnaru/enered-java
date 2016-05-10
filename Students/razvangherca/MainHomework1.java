package ro.enered.homework1;

public class MainHomework1 {
	public static void main(String args[]){
		int x = 100;
		//Calculati si afisati suma primelor x numere pare (folosind o structura repetitiva)
		int i=1,nr=0;
		int suma=0;
		while(nr<=x)
		{
			if(i%2==0)
			{
				suma=suma+i;
				nr=nr+1;
				i=i+1;
			}
			else
			{
				i=i+1;
			}
		}
		
		System.out.print("Suma primelor x numere pare este = "+suma);
		System.out.println();
		
		int[] numereFaine = {1,2,3,8,50,120,400,7,3,3,90,-4,-124,824,0};
		//Fie vectorul numereFaine. Calculati si afisati minimul, maximul si media aritmetica a elementelor lui.
		int minim=numereFaine[1];
		int maxim=numereFaine[2];
		float ma;
		suma=0;nr=0;
		for(i=0;i<=numereFaine.length-1;i++)
		{
			if(numereFaine[i]>maxim) maxim=numereFaine[i];
			else if(numereFaine[i]<minim) minim=numereFaine[i];
			suma=suma+numereFaine[i];
			nr=nr+1;
		}
		ma=(float)suma/nr;
		System.out.println("Minimul din vectorul numereFaine este = "+minim);
		System.out.println("Maximul din vectorul numereFaine este = "+maxim);
		System.out.println("Media aritmetica a numerelor din vectorul numereFaine este = "+ma);


		String[] cuvinte = {"nume","mers","activitate","sofer","tablou","caiet","program"};
		//Fie vectorul cuvinte. Adaugati fiecarui cuvant din el prefixul "pre" si sufixul "lui" si afisati-le, despartite prin caracterul ","
		System.out.println("Cuvintele obtinute sunt : ");
		for(i=0;i<=cuvinte.length-1;i++)
		{
			cuvinte[i]="pre"+cuvinte[i]+"lui";
		}
		for(i=0;i<=cuvinte.length-2;i++)
			System.out.print(cuvinte[i]+",");
		System.out.print(cuvinte[cuvinte.length-1]);
		System.out.println();
		
		
		int numarator = 7;
		int numitor = 3;
		//Avand numaratorul si numitorul de mai sus, calculati si afisati catul si restul impartirii lor
		
		int cat=0;
		int rest=0;
		cat=numarator/numitor;
		rest=numarator%numitor;
		System.out.println("Catul este "+cat);
		System.out.println("Restul este "+rest);
		
		//Folosind vectorul numereFaine de mai sus, inlocuiti elementele impare cu numarul 0
		
		for(i=0;i<=numereFaine.length-1;i++) if(numereFaine[i]%2==1) numereFaine[i]=0;
		System.out.println("Vectorul numereFaine dupa inlocuirea ceruta este :");
		for(i=0;i<=numereFaine.length-2;i++) System.out.print(numereFaine[i]+",");
		System.out.print(numereFaine[numereFaine.length-1]);
		System.out.println();
		
		
		int[][] matrice = new int[2][2];
		matrice[0][0] = 1;
		matrice[0][1] = 2;
		matrice[1][0] = 2;
		matrice[1][1] = 7;
		//Avand matricea de mai sus, calculati si afisati produsul numerelor de pe diagonala principala, impartit la produsul numerelor de pe diagonala secundara
		
		int prodDiagPrin=1;
		int prodDiagSec=1;
		int j;
		for(i=0;i<=1;i++)
			for(j=0;j<=1;j++) {
				if(i==j) prodDiagPrin=prodDiagPrin*matrice[i][j];
				else if(i+j==matrice.length-1) prodDiagSec=prodDiagSec*matrice[i][j];
			}
		System.out.println("Valoarea impartirii produsului numerelor de pe diag.prin. la prod. numerelor de pe diag.sec. este = ");
		System.out.println(prodDiagPrin/prodDiagSec);
		
		//Creati un vector de cuvinte, apoi concatenati-le pentru a alcatui 2 propozitii corecte dpdv gramatical (si afisati-le)
		
		String words[]={"Masina ","este ","puternica ","Viata ","este ","frumoasa "};
		words[0]=words[0]+words[1]+words[2]+".";
		words[3]=words[3]+words[4]+words[5]+".";
		words[1]=words[3];
		System.out.println("Prima propozitie este: "+words[0]);
		System.out.println("A doua propoztie este: "+words[1]);
		
		//Calculati (printr-o instructiune repetitiva) si afisati 8! (factorial)
		
		int fact=1;
		int nrfact=1;
		while(nrfact<=8) { fact=fact*nrfact; nrfact=nrfact+1;}
		System.out.println("Valoarea lui 8! este = "+fact);
		
		
		
		double[] vectorFain = {2.1,5.4,4.3,9.8,7.11,4.13,8,9,-4.2,48};
		//Folosind vectorFain, creati un alt vector al carui elemente sa fie egale cu formula (element * pozitieElement) din vectorul principal
		//ex: vectorNou[0] = 2.1 (elementul de pe pozitia 0 din vectorFain) * 0 (pozitia lui)
		//ex2: vectorNou[4] = 7.11 * 4 ...etc
		
		double[] vectorFain2=new double[10];
		for(i=0;i<=9;i++) vectorFain2[i]=vectorFain[i]*(i+1);
		System.out.println("Vectorul nou format este : ");
		for(i=0;i<=8;i++) System.out.print(vectorFain2[i]+",");
		System.out.print(vectorFain2[9]);
		
	}
}
