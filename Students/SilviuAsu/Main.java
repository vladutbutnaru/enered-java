package Exercitii;
//THIS IS THE MAIN CLASS AND AS PER BELOW WE HAVE A CONSTRUCTOR AND 3 METHODS
public class Main {
	
	//CONSTRUCTOR???
	public static void main (String[]args) {
		System.out.println("CEVA");
		//INT IS THE TYPE OF THE VARIABLES VALUE
		int a = 4;
		int b = 3;
		int c;
		int d;
		//a and b are related to 'adunare'|| 'scadere' method and they are attributes(NOT SURE) of it.
		//in order to print out the sum or dif i need to create a variable to call the method in it! In this case is 'c' and 'd'
		c = adunare(a,b);
		d = scadere(a,b);
		System.out.println(c);
		System.out.println(d);
		//if i want to print in the console i need to type the method name in the constructor!!!
		initializareAmount();
		
	}
	//METHOD
	private static int adunare(int a1, int b1){
		return a1+b1;
	}
	//METHOD
	private static int scadere(int a2, int b2){
		return a2-b2;
	}
	//METHOD
	public static void initializareAmount(){
		//Amount is the name of the class created separately. I NEED TO CREATE A NEW VARIABLE HERE TO CALL THE METHOD???
		Amount d = new Amount();
		//.calcNr is the way we connect the method to the separated class.
		//System.out.println-this is how we print the method.
		//!!!!!!!!! I THINK 'd' IS A VARIABLE
		System.out.println(d.calcNr());
	}
}
