package Jeu;

public class Plante extends Creature {

	public Plante(){
		super();

		setNom("Bulbie");
		setType('p');
		
		setImage("Images\\plante.jpg");
		setImageBack("Images\\planteBack.jpg");

		setAttaque(0,"Charge");
		setAttaque(1,"Lianes");
		setAttaque(2,"Fleur");
		setAttaque(3,"Boules d'herbe");
	}
}
