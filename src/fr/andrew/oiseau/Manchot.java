package fr.andrew.oiseau;

public class Manchot extends Oiseau implements OiseauNageur{
	
	public Manchot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manchot(String nom, int taille, int poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);
		// TODO Auto-generated constructor stub
	}

	//action
	public void nager() {
		System.out.println(nom+ " nage");
	}
	
	public void glisser() {
		System.out.println(nom+ " glisse");
	}
	
}
