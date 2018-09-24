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
		Autruche autruche2 = (Autruche) autruche;
		autruche2.setNom("Hortense");
		autruche2.setPlumes(true);
		autruche2.setPoids(120);
		autruche2.setRace("molybdophanes");
		autruche2.setTaille(210);
		System.out.println("l'autruche ce nomme " +autruche2.getNom());
		Utils.verifierplume(autruche2.isPlumes(),autruche2.getNom());
		System.out.println("l'autruche pese " +autruche2.getPoids()+ " kg");
		System.out.println("la rache de l'autruche est " +autruche2.getRace());
		System.out.println("l'autruche mesure " +autruche2.getTaille()+ "cm");
		autruche2.manger();
		autruche2.boire();
		autruche2.jouer();
		autruche2.courir();
		autruche2.sauter();
		
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
		manchot2.jouer();
		manchot2.courir();
		manchot2.sauter();
		manchot2.glisser();
		
		System.out.println("==========================================================");
		System.out.println("----Pigeon----");
		
		Oiseau pigeon = new Pigeon();
		Pigeon pigeon2 = (Pigeon) pigeon;
		pigeon2.setNom("Vaillant");
		pigeon2.setPlumes(true);
		pigeon2.setPoids(0.6);
		pigeon2.setRace("bleu de Gascogne");
		pigeon2.setTaille(55);	
		System.out.println("le pigeon ce nomme " +pigeon2.getNom());
		Utils.verifierplume(pigeon2.isPlumes(),pigeon2.getNom());
		System.out.println("le pigeon pese " +pigeon2.getPoids()+ " kg");
		System.out.println("la rache du pigeon est " +pigeon2.getRace());
		System.out.println("le pigeon mesure " +pigeon2.getTaille()+ " cm");
		pigeon2.manger();
		pigeon2.boire();
		pigeon2.voler();
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
		Perruche perruche2 = (Perruche) perruche;
		perruche2.setNom("Alpha");
		perruche2.setPlumes(true);
		perruche2.setPoids(0.9);
		perruche2.setRace("calopsitte");
		perruche2.setTaille(30);	
		System.out.println("la perruche ce nomme " +perruche2.getNom());
		Utils.verifierplume(perruche2.isPlumes(),perruche2.getNom());
		System.out.println("la perruche pese " +perruche2.getPoids()+ " kg");
		System.out.println("la rache de la perruche est " +perruche2.getRace());
		System.out.println("la perruche mesure " +perruche2.getTaille()+ " cm");
		perruche2.manger();
		perruche2.boire();
		perruche2.voler();
		perruche2.jouer();
		perruche2.courir();
		perruche2.sauter();
		
		Utils.differencePoids(autruche.getPoids(), aigle.getPoids());
		Utils.differencePoids(aigle.getPoids(), autruche.getPoids());
	}

}
