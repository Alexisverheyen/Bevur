package Jeu;

import java.awt.EventQueue;

public class Blevur {
	
	private JFramePrincipale mainFrame;
	private JPanelAccueil panelAccueil;
	private JPanelChoix panelChoix;
	
	public Blevur(){
		Combat c1 = new Combat();
		mainFrame = new JFramePrincipale(c1);
		//mainFrame.setContentPane(panelAccueil);
	}
	
	public static void main(String[] args) {
		Blevur d1 = new Blevur();
	}
}