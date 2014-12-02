package Jeu;

public class Normal extends Creature {
	
	public Normal(){
		super();
		
		setNom("Rocool");
		setType('n');
		
		setImage("Images\\normal.jpg");
		setImageBack("Images\\normalBack.jpg");
		
		setAttaque(0,"Charge");
		setAttaque(1,"Tornade");
		setAttaque(2,"Vol");
		setAttaque(3,"PicPic");
	}

}
