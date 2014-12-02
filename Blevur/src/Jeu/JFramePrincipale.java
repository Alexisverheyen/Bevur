package Jeu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JRadioButton;
import javax.swing.JProgressBar;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFramePrincipale extends JFrame {
	Combat combat;
	JPanel [] panels; 
	
	public void switchPanel(int numPanel){
		this.setContentPane(panels[numPanel]);
	}
	
	/**
	 * Create the frame.
	 * @param c1 
	 */
	public JFramePrincipale(Combat c1) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(606, 629);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setBackground(Color.BLACK);
		this.setTitle("BLEVUR ©");
		combat = c1;
		panels = new JPanel[4];
		panels[0] = new JPanelAccueil(this, combat);
		panels[1] = new JPanelChoix(this, combat);
		switchPanel(0);
		
		
	}
}
