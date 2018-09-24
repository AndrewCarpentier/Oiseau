package fr.andrew.oiseau;

public class Oiseau {

	protected String nom;
	protected int taille;
	protected double poids;
	protected String race;
	protected boolean plumes;
	
	public Oiseau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Oiseau(String nom, int taille, double poids, String race, boolean plumes) {
		this.nom = nom;
		this.taille = taille;
		this.poids = poids;
		this.race = race;
		this.plumes = plumes;
	}
	
	//action
		
	public void manger() {
		System.out.println(nom+ " mange");
	}
	
	public void boire() {
		System.out.println(nom+ " bois");
	}
	
	public void jouer() {
		System.out.println(nom+ " joue");
	}
	
	public void courir() {
		System.out.println(nom+ " cour");
	}
	
	public void sauter() {
		System.out.println(nom+ " saute");
	}
	
	
	//Getter Setter

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public boolean isPlumes() {
		return plumes;
				
	}

	public void setPlumes(boolean plumes) {
		this.plumes = plumes;
	}

	public void courrir() {
		// TODO Auto-generated method stub
		
	}

}
