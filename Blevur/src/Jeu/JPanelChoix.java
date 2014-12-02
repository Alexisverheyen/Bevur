package Jeu;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JPanelChoix extends JPanel {
	
	int choix=0;
	int tu=0;
	
	/**
	 * Create the this.
	 * @param jFramePrincipale 
	 * @param combat 
	 */
	public JPanelChoix(JFramePrincipale mainFrame, Combat combat) {
		int i=0;
		setBorder(null);
		setBackground(Color.GRAY);
		this.setSize(600,600);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setSize(600, 600);
		this.setOpaque(false);
		
		JButton btnRetour = new JButton("RETOUR");
		btnRetour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainFrame.switchPanel(0);
			}
		});
		btnRetour.setBounds(500, 550, 100, 50);
		add(btnRetour);
		add(panel);
		
		JButton btnEau = new JButton("EAU");
		btnEau.setBounds(0, 0, 200, 150);
		btnEau.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				choix=1;
				combat.getJoueurActif().choixCreature(choix, tu);
			}
		});
		panel.setLayout(null);
		panel.add(btnEau);
		
		
		JLabel lblIco = new JLabel();
		lblIco.setBounds(200, 0, 200, 150);
		lblIco.setHorizontalAlignment(SwingConstants.CENTER);
		lblIco.setIcon(new ImageIcon("D:\\Bureau\\Blevur\\Images\\eau.png"));
		panel.add(lblIco);
		
		JTextPane Info1 = new JTextPane();
		Info1.setBounds(400, 0, 200, 150);
		Creature c1 = new Eau();
		Info1.setBackground(Color.LIGHT_GRAY);
		Info1.setEditable(false); 
		Info1.setText("Nom : Eau\nType : Eau\nAttaques : \n -Charge\n -Bubulle\n -Robinet");
		panel.add(Info1);
		
		JButton btnFeu = new JButton("FEU");
		btnFeu.setBounds(0, 150, 200, 150);
		panel.add(btnFeu);
		
		JLabel lblIco2 = new JLabel();
		lblIco2.setBounds(200, 150, 200, 150);
		lblIco2.setHorizontalAlignment(SwingConstants.CENTER);
		lblIco2.setIcon(new ImageIcon("D:\\Bureau\\Blevur\\Images\\feu.png"));
		panel.add(lblIco2);
		Creature c2 = new Feu();
		
		JTextPane Info2 = new JTextPane();
		Info2.setBounds(400, 150, 200, 150);
		Info2.setBackground(Color.LIGHT_GRAY);
		Info2.setText("Nom : Feu\nType : Feu\nAttaques :\n - Charge\n - Flammeche\n - Feufeu\n - AAA");
		panel.add(Info2);
		
		JButton btnPlante = new JButton("Plante");
		btnPlante.setBounds(0, 300, 200, 150);
		panel.add(btnPlante);
		
		JLabel lblIco3 = new JLabel();
		lblIco3.setBounds(200, 300, 200, 150);
		lblIco3.setHorizontalAlignment(SwingConstants.CENTER);
		lblIco3.setIcon(new ImageIcon("D:\\Bureau\\Blevur\\Images\\plante.png"));
		panel.add(lblIco3);
		
		JTextPane Info3 = new JTextPane();
		Info3.setBounds(400, 450, 200, 150);
		Info3.setBackground(Color.LIGHT_GRAY);
		Creature c3 = new Plante();
		panel.add(Info3);
		Info3.setText("Nom : Plante\nType : Plante\nAttaques :\n - Charge\n - Fouet lianes\n - Feufeuille\n - AAA");
		
		JButton btnNormal = new JButton("Normal");
		btnNormal.setBounds(0, 450, 200, 150);
		panel.add(btnNormal);
		
		JLabel lblIco4 = new JLabel();
		lblIco4.setBounds(200, 450, 200, 150);
		lblIco4.setHorizontalAlignment(SwingConstants.CENTER);
		lblIco4.setIcon(new ImageIcon("D:\\Bureau\\Blevur\\Images\\normal.png"));
		panel.add(lblIco4);
		
		JTextPane Info4 = new JTextPane();
		Info4.setBounds(400, 300, 200, 150);
		Info4.setBackground(Color.LIGHT_GRAY);
		panel.add(Info4);
		Creature c4 = new Normal();
		Info4.setText("Nom : Normal\nType : Normal\nAttaques :\n - Charge\n - Picpic\n - Vol\n - AAA");
	}
}

