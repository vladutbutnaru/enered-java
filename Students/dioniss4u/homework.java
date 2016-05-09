package homework;

public class homework {
	
	public static void main(String[] args) {

		
		int x=100;
	    
		int sum=0;
	     
		int y=2;
	    
		for(int z=0;z < x ; z++){
	            y=z*2;
	            sum= sum+y;
	            
	        }
	    
		System.out.println(sum);
	        
	        
		int[] numereFaine = {1,2,3,8,50,120,400,7,3,3,90,-4,-124,824,0};

		int min=0;

		int max=0;

		int suma=0;

		for(int a=0;a<numereFaine.length;a++){

			if(numereFaine[a]>max){
	                max=numereFaine[a];

			}else if(numereFaine[a]<min){
	                    min=numereFaine[a];
	                }
	                suma=suma+numereFaine[a];
	            }

		System.out.println("Cel mai mare numare din vector este " + max + " si cel mai mic este " + min );

		System.out.println("Media aritmetica a vectorului este " + (suma/numereFaine.length));
	            
	            

		String[] cuvinte = {"nume","mers","activitate","sofer","tablou","caiet","program"};

		System.out.print("Noile valori ale vectorului cuvine sunt : ");
	            

		for(int x1=0;x1<cuvinte.length;x1++){
	                cuvinte[x1]="pre"+cuvinte[x1]+"lui";

	                System.out.print(cuvinte[x1] + ",");
	                
	                
	            }
	            
	            int numarator = 7;


	            int numitor = 3;

	            int rest=numarator%numitor;

	            int cat=numarator/numitor;

	            System.out.println("restul impartirii este " + rest + " iar catul este " + cat);


	            for(int x2=0;x2<numereFaine.length;x2++){

	            	int x3=numereFaine[x2] % 2;

	            	if(x3 == 1){

	            		numereFaine[x2]=0;

	            	}

	            }
	            
	            int[][] matrice = new int[2][2];
	    		matrice[0][0] = 1;
	    		matrice[0][1] = 2;
	    		matrice[1][0] = 2;
	    		matrice[1][1] = 7;
	    		//Avand matricea de mai sus, calculati si afisati produsul numerelor de pe diagonala principala,
	    		//impartit la produsul numerelor de pe diagonala secundara
	    		int diagonala1=1;
	    		int diagonala2=1;
	    		
	    		
	    		for(int d1=0;d1<matrice.length;d1++){
	    			diagonala1=matrice[d1][d1] * diagonala1;
	    			int z2=(matrice.length-1)-d1;
	    			diagonala2=matrice[d1][z2] * diagonala2;
	    			
	    		}
	    		System.out.println("Produsul diagonalei 1 este " + diagonala1);
	    		System.out.println("Produsul diagonalei 1 este " + diagonala2);
	    		System.out.println("Rezultatul impartirii dintre produsul numerelor de pe fiecare diagonala este " + (diagonala1/diagonala2));
	    		
	    		//Creati un vector de cuvinte, apoi concatenati-le pentru a alcatui 2 propozitii corecte dpdv gramatical (si afisati-le)

	    		String cuvinteSuper[]={"Java","super","fain","cursuri","cursurile","de","sunt","faine","acest","string","este","si","plin","fainosag",":))"};
	    		System.out.println(cuvinteSuper[4] + " " + cuvinteSuper[5] + " " + cuvinteSuper[0] + " " + cuvinteSuper[6] + " " + cuvinteSuper[1] + " " + cuvinteSuper[7] );
	    		System.out.println(cuvinteSuper[8] + " " + cuvinteSuper[9] + " " + cuvinteSuper[10] + " " + cuvinteSuper[12] + " " + cuvinteSuper[5] + " " + cuvinteSuper[13] + " " + cuvinteSuper[14]);
	    		
	    		//Calculati (printr-o instructiune repetitiva) si afisati 8! (factorial)
	    		int factTotal = 1;
	    		
	    		for(int fact=1;fact<=8;fact++){
	    			factTotal *= fact;
	    			
	    		}
	    		
	            System.out.println("8! este egal cu " + factTotal);
	            
	            
	            double[] vectorFain = {2.1,5.4,4.3,9.8,7.11,4.13,8,9,-4.2,48};
	    		//Folosind vectorFain, creati un alt vector al carui elemente sa fie egale cu formula (element * pozitieElement) din vectorul principal
	    		//ex: vectorNou[0] = 2.1 (elementul de pe pozitia 0 din vectorFain) * 0 (pozitia lui)
	    		//ex2: vectorNou[4] = 7.11 * 4 ...etc
	    		double[] vectorNou = new double[vectorFain.length];
	    		System.out.print("Noul vector VectorNou are urmatoarele elemente : ");
	    		for(int el =0;el<vectorNou.length;el++){
	    			vectorNou[el]=vectorFain[el] * el;
	    			System.out.print(vectorNou[el] + "\t");
	    		}
	        }
	        
	    }

