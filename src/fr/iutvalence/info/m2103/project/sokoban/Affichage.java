package fr.iutvalence.info.m2103.project.sokoban;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;

public class Affichage implements Runnable
{
	private JPanel container;
	@Override
		public void run()
		{
			// Création du composant graphique associÃ© Ã  la fenÃªtre
			JFrame fenetre = new JFrame();

			// Modification des propriétés de la fenÃªtre
			// Titre, dimensions (en pixel)
			fenetre.setTitle("Une fenêtre qui s'affiche");
			fenetre.setSize(400, 400);
			
			// Affiche la fenÃªtre au centre
			fenetre.setLocationRelativeTo(null);
			
			//Termine le processus lorsqu'on clique sur la croix rouge
		    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
		    JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		    //Création des boutons en ligne
		    
		    JPanel ligne1 = new JPanel();
		    ligne1.setLayout(new BoxLayout(ligne1, BoxLayout.LINE_AXIS));
		    ligne1.add(new JButton("Haut"));
		    
		    JPanel ligne2 = new JPanel();
		    ligne2.setLayout(new BoxLayout(ligne2, BoxLayout.LINE_AXIS));
		    ligne2.add(new JButton("Gauche"));
		    ligne2.add(new JButton("Droite"));

		    JPanel ligne3 = new JPanel();
		    ligne3.setLayout(new BoxLayout(ligne3, BoxLayout.LINE_AXIS));
		    ligne3.add(new JButton("Bas"));
		    
		    //Mise en colonne est 3 lignes de boutons pour faire le panneau de direction
		    
		    JPanel fin = new JPanel();
		    fin.setLayout(new BoxLayout(fin, BoxLayout.PAGE_AXIS));
		    fin.add(ligne1);
		    fin.add(ligne2);
		    fin.add(ligne3);
		    
		    splitPane.setBottomComponent(fin);
		    
		    this.container = new JPanel();
		    this.container.setLayout(new GridLayout(10, 10));
		    for (int i = 0; i< 20; i++)
		    {
		    	for (int j = 0; j< 20; j++)
		    	{
		    		this.container.add(new JButton());
		    	}
		    }
		    splitPane.setTopComponent(container);
		    fenetre.getContentPane().add(splitPane);
		   
		    // Affichage de la fenêtre
			fenetre.setVisible(true);
		}
}