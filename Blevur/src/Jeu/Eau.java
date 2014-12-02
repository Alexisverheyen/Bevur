package Jeu;

public class Eau extends Creature{

	public Eau(){
		super();

		setNom("Eau");
		setType('e');
		
		setImage("Images\\eau.jpg");
		setImageBack("Images\\eauBack.jpg");

		setAttaque(0,"Charge");
		setAttaque(1,"Bulle");
		setAttaque(2,"Robinet");
		setAttaque(3,"Torrent");
	}	
}
