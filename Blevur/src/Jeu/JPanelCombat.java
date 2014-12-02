package Jeu;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JPanelCombat extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPanelCombat() {
		setLayout(null);

		JPanel panel_Creature = new JPanel();
		panel_Creature.setBounds(0, 0, 600, 450);
		this.add(panel_Creature);
		panel_Creature.setLayout(null);

		JLabel lblAttaquant = new JLabel();
		lblAttaquant.setBounds(0, 225, 300, 225);
		lblAttaquant.setHorizontalAlignment(SwingConstants.CENTER);
		lblAttaquant.setVerticalAlignment(SwingConstants.BOTTOM);
		lblAttaquant.setIcon(new ImageIcon(c1.getJoueurActif().team[0].getImageBack()));
		panel_Creature.add(lblAttaquant);

		JLabel lblAttaqué = new JLabel();
		lblAttaqué.setBounds(300, 0, 300, 225);
		lblAttaqué.setVerticalAlignment(SwingConstants.BOTTOM);
		lblAttaqué.setHorizontalAlignment(SwingConstants.CENTER);
		lblAttaqué.setIcon(new ImageIcon(c1.getJoueurPassif().team[0].getImage()));
		panel_Creature.add(lblAttaqué);

		JLabel lblPVCrea1 = new JLabel();
		lblPVCrea1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPVCrea1.setBounds(300, 375, 300, 75);
		lblPVCrea1.setFont(new Font("Old School United Stencil", Font.PLAIN, 90));
		panel_Creature.add(lblPVCrea1);
		lblPVCrea1.setText("PV : " + String.valueOf(c1.getJoueurActif().team[0].getPv()));

		JLabel lblPVCrea2 = new JLabel();
		lblPVCrea2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPVCrea2.setBounds(0, 150, 300, 75);
		lblPVCrea2.setFont(new Font("Old School United Stencil", Font.PLAIN, 90));
		panel_Creature.add(lblPVCrea2);
		lblPVCrea2.setText("PV : " + String.valueOf(c1.getJoueurPassif().getTeam()[0].getPv()));

		JLabel lblNomcrea1 = new JLabel();
		lblNomcrea1.setFont(new Font("Old School United Stencil", Font.PLAIN, 50));
		lblNomcrea1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomcrea1.setBounds(300, 300, 300, 75);
		panel_Creature.add(lblNomcrea1);
		lblNomcrea1.setText("");

		JLabel lblNomCrea2 = new JLabel();
		lblNomCrea2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomCrea2.setBounds(0, 75, 300, 75);
		lblNomCrea2.setFont(new Font("Old School United Stencil", Font.PLAIN, 50));
		panel_Creature.add(lblNomCrea2);
		lblNomCrea2.setText("");

		JLabel lblNomJ1 = new JLabel();
		lblNomJ1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomJ1.setFont(new Font("Old School United Stencil", Font.PLAIN, 50));
		lblNomJ1.setBounds(300, 225, 300, 75);
		panel_Creature.add(lblNomJ1);
		lblNomJ1.setText("");

		JLabel lblNomJ2 = new JLabel();
		lblNomJ2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomJ2.setFont(new Font("Old School United Stencil", Font.PLAIN, 50));
		lblNomJ2.setBounds(0, 0, 300, 75);
		panel_Creature.add(lblNomJ2);
		lblNomJ2.setText("");

		JLabel lblAaa = new JLabel("separation");
		lblAaa.setBackground(Color.BLACK);
		lblAaa.setBounds(0, 232, 600, 1);
		lblAaa.setOpaque(true);
		panel_Creature.add(lblAaa);

		JLabel label = new JLabel();
		label.setBounds(0, 0, 600, 450);
		label.setIcon(new ImageIcon("D:\\Bureau\\Blevur\\Images\\fond.jpg"));
		label.setBackground(Color.GRAY);
		label.setOpaque(true);
		panel_Creature.add(label);

		JPanel panel_Actions = new JPanel();
		panel_Actions.setBounds(0, 450, 600, 150);
		this.add(panel_Actions);
		panel_Actions.setLayout(null);

		JLabel lblFondtxt = new JLabel();
		lblFondtxt.setForeground(Color.WHITE);
		lblFondtxt.setHorizontalAlignment(SwingConstants.CENTER);
		lblFondtxt.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblFondtxt.setBounds(0, 0, 300, 150);
		panel_Actions.add(lblFondtxt);
		lblFondtxt.setBackground(Color.DARK_GRAY);
		lblFondtxt.setOpaque(true);

		JButton btnAttaquer = new JButton("ATTAQUER");
		btnAttaquer.setBounds(300, 0, 150, 75);
		panel_Actions.add(btnAttaquer);

		JButton btnSwap = new JButton("SWAP");
		btnSwap.setBounds(450, 0, 150, 75);
		panel_Actions.add(btnSwap);

		JButton btnRepos = new JButton("REPOS");
		btnRepos.setBounds(300, 75, 150, 75);
		panel_Actions.add(btnRepos);

		JButton btnFf = new JButton("FF");
		btnFf.setBounds(450, 75, 150, 75);
		panel_Actions.add(btnFf);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 10, 10);
		add(panel);
	}
}
