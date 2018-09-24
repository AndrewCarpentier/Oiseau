package fr.andrew;

public class Utils {

	public static void verifierplume(boolean plumes, String nom) {
		if (plumes) {
			System.out.println(nom+ " à des plumes");
		}else {
			System.out.println(nom+ " n'a pas de plumes");			
		}	
	}
	
	public static void differencePoids(double poidsOiseau1, double poidsOiseau2) {
		if((poidsOiseau1-poidsOiseau2)>0) {
			System.out.println("Il y à une difference de poids de " +(poidsOiseau1 - poidsOiseau2)+"kg entre ces deux oiseaux");
		}else if((poidsOiseau1-poidsOiseau2)==0){
			System.out.println("Il n'y a pas de difference de poids entre ces deux oiseaux");
		}else {
			System.out.println("Il y à une difference de poids de " +(poidsOiseau2 - poidsOiseau1)+"kg entre ces deux oiseaux");
		}
	}
}
