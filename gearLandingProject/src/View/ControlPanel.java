package View;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

public class ControlPanel extends JPanel{
	private JButton commandeButton;
	private JLabel ecranLabel;
	private JLabel situationTrainLabel;
	private JLabel positionCommandeLabel;
	
	public ControlPanel(){
		//PANNEAU GAUCHE
		JPanel panneauGauche = new JPanel();
		TitledBorder title;
		title = BorderFactory.createTitledBorder("Position Train Atterrissage");
		ecranLabel = new JLabel();
		ecranLabel.setText("Sorti");
		panneauGauche.setPreferredSize(new Dimension(300,370));
		
		ecranLabel.setHorizontalAlignment(JLabel.CENTER);
		ecranLabel.setPreferredSize(new Dimension(290,390));
		
		panneauGauche.setBorder(title);
		panneauGauche.add(ecranLabel);
		
		//PANNEAU DROIT
		JPanel panneauDroite = new JPanel();
		
		commandeButton = new JButton("COMMANDE");
		situationTrainLabel = new JLabel();
		situationTrainLabel.setText("Tout OK");
		positionCommandeLabel = new JLabel();
		positionCommandeLabel.setText("Basse");
		panneauDroite.setPreferredSize(new Dimension(100,400));
		
		commandeButton.setPreferredSize(new Dimension(90,90));
		
		panneauDroite.setLayout(new BorderLayout());
		panneauDroite.add(situationTrainLabel, BorderLayout.NORTH);
		panneauDroite.add(positionCommandeLabel, BorderLayout.CENTER);
		panneauDroite.add(commandeButton, BorderLayout.SOUTH);
		
		
		//ON AJOUTE LES DEUX PANNEAUX AU PANNEAU PRINCIPAL
		this.setLayout(new BorderLayout());
		this.add(panneauDroite, BorderLayout.EAST);
		this.add(panneauGauche, BorderLayout.WEST);
	}

}
