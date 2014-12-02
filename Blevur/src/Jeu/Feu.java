package Jeu;

public class Feu extends Creature {
	
	public Feu(){
		super();
		
		setNom("Feu");
		setType('f');
		
		setImage("Images\\feu.jpg");
		setImageBack("Images\\feuBack.jpg");

		setAttaque(0,"Charge");
		setAttaque(1,"Flammeche");
		setAttaque(2,"Etincelle");
		setAttaque(3,"Lance flammes");
		
	}

}
