package Jeu;

import java.util.Scanner;

public class Combat {

	private Joueur[] tabJoueurs;
	private Joueur joueurActif;
	private Joueur joueurPassif;
	public JPanelChoix JPanel;


	public Combat(){
	}

	public void creationParticipant(){
		tabJoueurs = new Joueur[2];
		tabJoueurs[0] = new Joueur("Joueur1");
		tabJoueurs[1] = new Joueur("Joueur2");
		joueurActif = tabJoueurs[0];
		joueurPassif = tabJoueurs[1];
	}

	public void actions(JPanelChoix PanelChoix){
		boolean abandon = false;
		boolean tousMort = false;
		boolean chgmntJoueurOK;
		do{
			System.out.println("A " + joueurActif.getJnom() + " de jouer");
			chgmntJoueurOK = true;
			afficherAction();
			int choix = choixAction(PanelChoix);

			switch(choix){

			case 1:
				Attaquer(joueurActif.getTeam()[0], joueurPassif.getTeam()[0]);
				if (joueurPassif.team[0].getPv()==0) changerCreature(joueurPassif);
				if (!testTousMort(joueurPassif)) System.out.println("Changement automatique de la creature");
				tousMort = testTousMort(joueurPassif);
				break;
			case 2:
				repos(joueurActif.getTeam()[0]);
				break;
			case 3:
				chgmntJoueurOK = changerCreature(joueurActif);
				break;
			case 4:
				abandon = abandonner();
				break;
			}
			if (!abandon && chgmntJoueurOK && !tousMort){
				joueurActif=changerJoueur(joueurActif);
				joueurPassif=changerJoueur(joueurPassif);
			}

		}while (!tousMort && !abandon);
		if (tousMort) setGagnant(0); 
		if (abandon) setGagnant(1);
	}

	public void setGagnant(int i){
		//gagnant=i;
	}
	
	public Joueur getJoueurActif() {
		return joueurActif;
	}

	public void afficherAction(){
		System.out.println("Quelle action choisissez vous?");
		System.out.println("1 : Attaquer");
		System.out.println("2 : Repos");
		System.out.println("3 : Changer Creature");
		System.out.println("4 : Abandon");
	}

	public void affichageGagnant(int gagnant){
		if (gagnant == 0) System.out.println(joueurActif.getJnom() + "a gagné");
		if (gagnant == 1) System.out.println(joueurPassif.getJnom() + "a gagné");
	}

	public int choixAction(JPanelChoix PanelChoix){
		JPanel = PanelChoix;
		int choixAction;
		Scanner sc = new Scanner(System.in);
		do{
			choixAction = sc.nextInt();
			if (choixAction<0 || choixAction>4) 
				System.out.println("Valeur incorrecte, veuillez réitérer votre choix");
		}while(choixAction<0 || choixAction>4);
		return choixAction;
	}

	public boolean abandonner(){
		return true;
	}

	public void repos(Creature Attaquant) {
		Attaquant.setPv(Attaquant.getPv()+25);
		if (Attaquant.getPv() > 150) Attaquant.setPv(150);
	}

	public boolean changerCreature(Joueur joueurActif) {
		try{joueurActif.swapCreature();}
		catch (KOException e) {
			e.getMessage();
			return false;}
		return true;
	}
	
	public void Attaquer(Creature attaquant,Creature attaqué){
		Attaque atk = new Attaque(attaquant, attaqué);
		attaqué.setPv(attaqué.getPv()-atk.getDamage());
	}
	public Joueur changerJoueur(Joueur joueur){
		/*
		 Joueur tmp;
		 tmp=tabJoueur[0];
		 tabJoueur[0]=tabJoueur[1];
		 tabJoueur[1]=tmp;
		*/
		
		if (joueur==tabJoueurs[0]) {
			return tabJoueurs[1];
		}		
		else
			return tabJoueurs[0];
			
	}

	public boolean testTousMort(Joueur joueurPassif){
		if (joueurPassif.getTeam()[0].getPv()==0 && joueurPassif.getTeam()[1].getPv()==0) return true;
		else return false;
	}
}
