package ro.enered.exemple;

public class Student {
	// proprietatitle studentului
	public String nume;
	public int grup;

	public String invata(String numeCurs, int ore) {
		String rezultat = "Studentul " + nume + " a invatat la " + numeCurs + " timp de "+ ore +" ore";
		return rezultat;
		//Studentul "nume" din grupa "grup" a invatat "numeCurs" timp de "ore" ore
	}

}
