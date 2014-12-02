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

public class JPanelAccueil extends JPanel {
	
	JPanelChoix panelChoix;
	JFramePrincipale mainFrame;
	
	/**
	 * Create the panel.
	 * @param combat 
	 */
	public JPanelAccueil(JFramePrincipale frame, Combat combat) {
		mainFrame = frame;
		setLayout(null);
		setVisible(true);
		this.setSize(600,600);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 600, 600);
		add(panel);
		panel.setLayout(null);
		
		JButton btnNewGame = new JButton("NEW GAME");
		btnNewGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				mainFrame.switchPanel(1);
			}
		});
		btnNewGame.setBounds(200, 400, 200, 50);
		panel.add(btnNewGame);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("D:\\Bureau\\Blevur\\Images\\fondBlevur.jpg"));
		label_1.setBounds(0, 0, 600, 300);
		panel.add(label_1);
		
		JLabel label = new JLabel();
		label.setBackground(Color.BLACK);
		label.setOpaque(true);
		label.setBounds(0, 0, 600, 600);
		panel.add(label);
	}
}
