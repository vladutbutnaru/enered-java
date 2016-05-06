package exercitiu2;

public class main {
	public static void main(String[] args){
		System.out.println("-----------------------------------EXERCITII-------------------------------------");
		System.out.println("Avem variabilele a,b si c cu valorile 1,5 respectiv 6");
		System.out.println("Exemplu AND a > 1 && b < 7");
		int a = 1 ;
		int b = 5 ;
		int c = 6 ;
		//exemplu AND si if/else
		if( a > 1 && b < 7){
			System.out.println("a!>1 && b!<7"); //semnul exclamarii inseamna negatie sau opus iar && inseamna AND
		}else{
			System.out.println("Propozitia este falsa");
		}
		System.out.println("Sfarsit de exemplu");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("exemplu switch");
		//exemplu switch
		switch(c){
		case 1:
			System.out.println("Variabila c are valoarea 1");
			break;
		case 2:
			System.out.println("Variabila c are valoarea 2");
			break;
		case 3:
			System.out.println("Variabila c are valoarea 3");
			break;
		case 4:
			System.out.println("Variabila c are valoarea 4");
			break;
		case 5:
			System.out.println("Variabila c are valoarea 5");
			break;
		case 6:
			System.out.println("Variabila c are valoarea 6");
			break;
		default:
			System.out.println("nu se stie valoarea lui c");
		
			
		}
		System.out.println("Sfarsit de exemplu");
		
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("exemplu While");
		//exemplu while
		while( c < 0 ){
			System.out.println(c);
			c--;
		}
		System.out.println("Sfarsitul loop-ului");
		System.out.println("Sfarsit de exemplu");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("exemplu do while");
		
		//exemplu de do while
		do{
			System.out.println(c);
			c++;
		}while(c<25);
		System.out.println("Sfarsit de exemplu");
		
	}

}
