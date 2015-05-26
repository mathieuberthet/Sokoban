package fr.iutvalence.info.m2103.project.sokoban;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;


public class Affichage implements Runnable
{
		
	JSplitPane splitPane;
	@Override
		public void run()
		{
			// Cr�ation du composant graphique associé à la fenêtre
			JFrame fenetre = new JFrame();

			// Modification des propri�t�s de la fenêtre
			// Titre, dimensions (en pixel)
			fenetre.setTitle("Une fen�tre qui s'affiche");
			fenetre.setSize(400, 400);
			
			// Affiche la fenêtre au centre
			fenetre.setLocationRelativeTo(null);
			
			//Termine le processus lorsqu'on clique sur la croix rouge
		    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
		    //Cr�ation des boutons en ligne
		    
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
		    
		    JPanel rest = new JPanel();
		    
			splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,rest,fin);
			splitPane.setDividerLocation(200);
			splitPane.setOneTouchExpandable(true);

		    fenetre.getContentPane().add(fin);
		    // Affichage de la fen�tre
			fenetre.setVisible(true);
		}
}



