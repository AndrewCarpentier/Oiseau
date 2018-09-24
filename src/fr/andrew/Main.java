package fr.andrew;

import fr.andrew.oiseau.Aigle;
import fr.andrew.oiseau.Autruche;
import fr.andrew.oiseau.Manchot;
import fr.andrew.oiseau.Oiseau;
import fr.andrew.oiseau.Perruche;
import fr.andrew.oiseau.Pigeon;

public class Main {

	public static void main(String[] args) {
		System.out.println("----Autruche----");
		
		Oiseau autruche = new Autruche();
		autruche.setNom("Hortense");
		autruche.setPlumes(true);
		autruche.setPoids(120);
		autruche.setRace("molybdophanes");
		autruche.setTaille(210);
		System.out.println("l'autruche ce nomme " +autruche.getNom());
		Utils.verifierplume(autruche.isPlumes(),autruche.getNom());
		System.out.println("l'autruche pese " +autruche.getPoids()+ " kg");
		System.out.println("la rache de l'autruche est " +autruche.getRace());
		System.out.println("l'autruche mesure " +autruche.getTaille()+ "cm");
		autruche.manger();
		autruche.boire();
		autruche.voler();
		autruche.jouer();
		autruche.courir();
		autruche.sauter();
		
		System.out.println("==========================================================");
		System.out.println("----Manchot----");
		
		Oiseau manchot = new Manchot();
		Manchot manchot2 = (Manchot) manchot;
		manchot2.setNom("Pablo");
		manchot2.setPlumes(true);
		manchot2.setPoids(13);
		manchot2.setRace("royal");
		manchot2.setTaille(90);	
		System.out.println("le manchot ce nomme " +manchot2.getNom());
		Utils.verifierplume(manchot.isPlumes(),manchot.getNom());
		System.out.println("le manchot pese " +manchot2.getPoids()+ " kg");
		System.out.println("la rache du manchot est " +manchot2.getRace());
		System.out.println("le manchot mesure " +manchot2.getTaille()+ " cm");
		manchot2.nager();
		manchot2.manger();
		manchot2.boire();
		manchot2.voler();
		manchot2.jouer();
		manchot2.courir();
		manchot2.sauter();
		manchot2.glisser();
		
		System.out.println("==========================================================");
		System.out.println("----Pigeon----");
		
		Oiseau pigeon = new Pigeon();
		pigeon.setNom("Vaillant");
		pigeon.setPlumes(true);
		pigeon.setPoids(0.6);
		pigeon.setRace("bleu de Gascogne");
		pigeon.setTaille(55);	
		System.out.println("le pigeon ce nomme " +pigeon.getNom());
		Utils.verifierplume(pigeon.isPlumes(),pigeon.getNom());
		System.out.println("le pigeon pese " +pigeon.getPoids()+ " kg");
		System.out.println("la rache du pigeon est " +pigeon.getRace());
		System.out.println("le pigeon mesure " +pigeon.getTaille()+ " cm");
		pigeon.manger();
		pigeon.boire();
		pigeon.voler();
		pigeon.jouer();
		pigeon.courir();
		pigeon.sauter();
		
		System.out.println("==========================================================");
		System.out.println("----Aigle----");
		
		Oiseau aigle = new Aigle();
		Aigle aigle2 = (Aigle) aigle;
		aigle2.setNom("Sitka");
		aigle2.setPlumes(true);
		aigle2.setPoids(3.6);
		aigle2.setRace("aigle royal");
		aigle2.setTaille(80);			
		System.out.println("l'aigle ce nomme " +aigle2.getNom());
		Utils.verifierplume(aigle.isPlumes(),aigle.getNom());
		System.out.println("l'aigle pese " +aigle2.getPoids()+ " kg");
		System.out.println("la rache de l'aigle est " +aigle2.getRace());
		System.out.println("l'aigle mesure " +aigle2.getTaille()+ " cm");
		aigle2.manger();
		aigle2.boire();
		aigle2.voler();
		aigle2.jouer();
		aigle2.courir();
		aigle2.sauter();
		aigle2.chasser("lapin");
		
		System.out.println("==========================================================");
		System.out.println("----Perruche----");
		
		Oiseau perruche = new Perruche();
		perruche.setNom("Alpha");
		perruche.setPlumes(true);
		perruche.setPoids(0.9);
		perruche.setRace("calopsitte");
		perruche.setTaille(30);	
		System.out.println("la perruche ce nomme " +perruche.getNom());
		Utils.verifierplume(perruche.isPlumes(),perruche.getNom());
		System.out.println("la perruche pese " +perruche.getPoids()+ " kg");
		System.out.println("la rache de la perruche est " +perruche.getRace());
		System.out.println("la perruche mesure " +perruche.getTaille()+ " cm");
		perruche.manger();
		perruche.boire();
		perruche.voler();
		perruche.jouer();
		perruche.courir();
		perruche.sauter();
		
		Utils.differencePoids(autruche.getPoids(), aigle.getPoids());
		Utils.differencePoids(aigle.getPoids(), autruche.getPoids());
	}

}
