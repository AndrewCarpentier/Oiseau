package fr.andrew.oiseau;

public class Pigeon extends Oiseau implements OiseauVolant{

	public Pigeon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pigeon(String nom, int taille, int poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void voler() {
		System.out.println(nom+ "vole");
	}
	
	
}
