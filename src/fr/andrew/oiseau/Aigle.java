package fr.andrew.oiseau;

public class Aigle extends Oiseau implements OiseauVolant{
	
	public Aigle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aigle(String nom, int taille, int poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);
		// TODO Auto-generated constructor stub
	}
	
	//action	
	public void chasser(String nomAnimal) {
		System.out.println(nom+ " chasse un " +nomAnimal);
	}
	
	@Override
	public void courir() {
		System.out.println("Je suis un aigle je ne cour pas je vole");
	}

	@Override
	public void voler() {
		System.out.println(nom+ "vole");
	}
	
}
