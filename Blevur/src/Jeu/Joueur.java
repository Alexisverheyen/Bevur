package Jeu;

import java.util.Arrays;
import java.util.Scanner;


public class Joueur {

	private String Jnom;
	public Creature[] team = new Creature[2];
	JPanelChoix panelChoix;
	JFramePrincipale mainFrame;
	Combat combat;

	public Joueur(){
		setJnom("");
	}

	public Joueur(String name){
		setJnom(name);
		choixCreature(panelChoix.choix, panelChoix.tu);
	}


	public void setTeam(Creature[] team) {
		this.team = team;
	}

	public Creature[] getTeam() {
		return team;
	}

	public String getJnom() {
		return Jnom;
	}

	public void setJnom(String jnom) {
		Jnom = jnom;
	}
	
	public void choixCreature(int choix, int i){
		switch(choix){

		case 1:
			this.team[i]= new Eau();
			break;
		case 2:
			this.team[i]= new Feu();
			break;
		case 3:
			this.team[i]= new Plante();
			break;
		case 4:
			this.team[i]= new Normal();
			break;
		}
	}
	
	/*public void choixCreature(){
		for (int i=0; i<2; i++){
			do{	
				System.out.println("Choix de la creature " + (i+1) + " pour "+ getJnom() +":\n"+ 
						"1.Eau | 2. Feu | 3.Plante | 4.Normal");
				Scanner sc = new Scanner(System.in);
				choix = sc.nextInt();
				switch(choix){

				case 1:
					team[i]= new Eau();
					break;
				case 2:
					team[i]= new Feu();
					break;
				case 3:
					team[i]= new Plante();
					break;
				case 4:
					team[i]= new Normal();
					break;
				default:
					System.out.println("Valeur incorrecte, veuillez réitérer votre choix");
					break;
				}
			}while(choix<0 || choix>4);
		}
		
	}*/

	public void swapCreature() throws KOException{
		if(this.team[1].isKO()==false){
			Creature temp;
			temp=team[0];
			team[0]=team[1];
			team[1]=temp;
		} else throw new KOException("Impossible, autre creature KO");
	}

	@Override
	public String toString() {
		return  "team de " + Jnom + "\n" + Arrays.toString(team);
	}
}
