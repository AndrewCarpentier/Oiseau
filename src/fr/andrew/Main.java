package fr.andrew;

import fr.andrew.oiseau.Aigle;
import fr.andrew.oiseau.Autruche;
import fr.andrew.oiseau.Manchot;
import fr.andrew.oiseau.Oiseau;
import fr.andrew.oiseau.Perruche;
import fr.andrew.oiseau.Pigeon;

public class Main {

	public static void main(String[] args) {
		
		Oiseau autruche = new Autruche();
		autruche.setNom("Hortense");
		autruche.setPlumes(true);
		autruche.setPoids(120);
		autruche.setRace("molybdophanes");
		autruche.setTaille(210);
		System.out.println(autruche.getNom());
		autruche.isPlumes();
		System.out.println(autruche.getPoids());
		System.out.println(autruche.getRace());
		System.out.println(autruche.getTaille());
		autruche.manger();
		autruche.boire();
		autruche.voler();
		autruche.jouer();
		autruche.courir();
		autruche.sauter();
		
		System.out.println("==========================================================");
		
		Oiseau manchot = new Manchot();
		Manchot manchot2 = (Manchot) manchot;
		manchot2.setNom("Pablo");
		manchot2.setPlumes(false);
		manchot2.setPoids(13);
		manchot2.setRace("royal");
		manchot2.setTaille(90);	
		System.out.println(manchot2.getNom());
		manchot2.isPlumes();
		System.out.println(manchot2.getPoids());
		System.out.println(manchot2.getRace());
		System.out.println(manchot2.getTaille());
		manchot2.nager();
		manchot2.manger();
		manchot2.boire();
		manchot2.voler();
		manchot2.jouer();
		manchot2.courir();
		manchot2.sauter();
		
		System.out.println("==========================================================");
		
		Oiseau pigeon = new Pigeon();
		pigeon.setNom("Vaillant");
		pigeon.setPlumes(true);
		pigeon.setPoids(0.6);
		pigeon.setRace("bleu de Gascogne");
		pigeon.setTaille(55);	
		System.out.println(pigeon.getNom());
		pigeon.isPlumes();
		System.out.println(pigeon.getPoids());
		System.out.println(pigeon.getRace());
		System.out.println(pigeon.getTaille());
		pigeon.manger();
		pigeon.boire();
		pigeon.voler();
		pigeon.jouer();
		pigeon.courir();
		pigeon.sauter();
		
		System.out.println("==========================================================");
		
		Oiseau aigle = new Aigle();
		Aigle aigle2 = (Aigle) aigle;
		aigle2.setNom("Sitka");
		aigle2.setPlumes(true);
		aigle2.setPoids(3.6);
		aigle2.setRace("aigle royal");
		aigle2.setTaille(80);			
		System.out.println(aigle2.getNom());
		aigle2.isPlumes();
		System.out.println(aigle2.getPoids());
		System.out.println(aigle2.getRace());
		System.out.println(aigle2.getTaille());
		aigle2.chasser("lapin");
		aigle2.manger();
		aigle2.boire();
		aigle2.voler();
		aigle2.jouer();
		aigle2.courir();
		aigle2.sauter();
		
		System.out.println("==========================================================");
		
		Oiseau perruche = new Perruche();
		perruche.setNom("Alpha");
		perruche.setPlumes(true);
		perruche.setPoids(0.9);
		perruche.setRace("calopsitte");
		perruche.setTaille(30);	
		System.out.println(perruche.getNom());
		perruche.isPlumes();
		System.out.println(perruche.getPoids());
		System.out.println(perruche.getRace());
		System.out.println(perruche.getTaille());
		perruche.manger();
		perruche.boire();
		perruche.voler();
		perruche.jouer();
		perruche.courir();
		perruche.sauter();
		
	}

}
