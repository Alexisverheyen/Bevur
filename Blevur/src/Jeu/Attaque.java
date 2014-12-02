package Jeu;

import java.util.Scanner;

public class Attaque {
	private int choixAtk;
	private int damage;

	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public Attaque(){
		damage=0;
	}


	public Attaque(Creature attaquant,Creature attaqu�){
		boolean ok=true;
		affichageAtk(attaquant);
		do{
			choixAtk = choixAttaque();
			ok=atkDispo(choixAtk, attaquant);
		}while (!ok);
		moinsPP(choixAtk,attaquant);
		calcDmg(choixAtk, attaquant, attaqu�);
		//System.out.println(attaquant.getNom() + " a inflig� " + getDamage() + " � " + attaqu�.getNom());
		//System.out.println(attaqu�.getNom() + " a " + attaqu�.getPv() + " restants ");
	}


	private void atkFaible(){
		setDamage(getDamage()-5);
	}

	private void atkFort(){
		setDamage(getDamage()+5);
	}

	public void affichageAtk(Creature attaquant){
		for (int i=0 ; i<4; i++){
			System.out.println(attaquant.getAttaques(i));
		}
	}

	public int choixAttaque(){
		int choixAtk;
		Scanner sc = new Scanner(System.in);
		do{
			choixAtk = sc.nextInt();
			if (choixAtk<1 || choixAtk>4) 
				System.out.println("Valeur incorrecte, veuillez r�it�rer votre choix");
			
		}while(choixAtk<1 || choixAtk>4);
		return choixAtk;
		
		
	}

	public boolean atkDispo(int choixAtk,Creature attaquant){
		if (attaquant.getNbAtkDispo(choixAtk-1)>0) return true;
		else {
			System.out.println("Cette attaque n'est plus disponible, refaites un choix");
			return false;
		}
	}

	public void moinsPP(int choixAtk,Creature attaquant){
		attaquant.setNbAtkDispo(choixAtk-1, attaquant.getNbAtkDispo(choixAtk-1)-1);
	}

	public void calcDmg(int choixAtk,Creature attaquant,Creature attaqu�){
		System.out.println("CHOIXATK : " + choixAtk);
		switch(choixAtk){
		case 1:
			setDamage(10);
			break;

		case 2:
			setDamage(25);
			break;

		case 3:
			setDamage(35);
			break;

		case 4:
			System.out.println("Les degats sont de 50");
			setDamage(50);
			break;
		}

		switch(attaquant.getType()){
		case 'e':
			if(attaqu�.getType()=='f'){ //L'eau est fort contre le feu
				atkFort();
			}
			else if(attaqu�.getType()=='p'){ //L'eau est faible contre la plante
				atkFaible();
			}
			break;
		case 'f':
			if(attaqu�.getType()=='p'){ //Le feu est fort contre la plante
				atkFort();
			}
			else if(attaqu�.getType()=='e'){ //Le feu est faible contre l'eau
				atkFaible();
			}
			break;
		case 'p':
			if(attaqu�.getType()=='e'){ //La plante est forte contre l'eau
				atkFort(); 
			}
			else if(attaqu�.getType()=='f'){ //La plante est faible contre le feu
				atkFaible();
			}
			break;
		}	
	}
}