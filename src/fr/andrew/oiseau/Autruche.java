package fr.andrew.oiseau;

public class Autruche extends Oiseau{

	public Autruche() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Autruche(String nom, int taille, int poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void voler() {
		System.out.println("Je suis une autruche je ne vole pas");
	}

}
