package fr.andrew.oiseau;

public class Canard extends Oiseau implements OiseauVolant,OiseauNageur{

	public Canard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Canard(String nom, int taille, double poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void nager() {
		System.out.println("Je suis un canard qui nage");		
	}

	@Override
	public void voler() {
		System.out.println("Je suis un canard qui vole");		
	}
	
	

}
