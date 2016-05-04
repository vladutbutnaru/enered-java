package ro.enered.exemple;

public class Stoc {

public String calcNr(){
	Produs p1,p2,p3,p4,p5;
	p1 = new Produs();
	p2 = new Produs();
	p3 = new Produs();
	p4 = new Produs();
	p5 = new Produs();
	p1.nume="Carne";
	p1.tip="Alimentar";
	p1.cantitate = 3;
	p2.cantitate = 5;
	p3.cantitate = 8;
	p4.cantitate = -3;
	p5.cantitate = 0;
	int cantTotal =//...
	String rezultat = "Sunt " + cantTotal + " produse"
			+ "pe stoc";
	return rezultat;
	
}
}
