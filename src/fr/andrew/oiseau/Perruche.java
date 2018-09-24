package fr.andrew.oiseau;

public class Perruche extends Oiseau implements OiseauVolant{

	public Perruche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perruche(String nom, int taille, int poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void voler() {
		System.out.println(nom+ "vole");
	}
	
	
}
