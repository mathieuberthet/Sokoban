package fr.iutvalence.info.m2103.project.sokoban;
import javax.swing.SwingUtilities;

	/**
	 * Launcher for a Sokoban game
	 * 
	 * @author hugo, virgil
	 * 
	 *
	 */
public class Main 
{
		/**
		 * Create a new Sokoban game and play it
		 * 
		 * @param args command-line arguments (unused)
		 */
		public static void main(String[] args)
		{
			SwingUtilities.invokeLater(new Affichage());
			new SokobanGame();
			System.out.println("fin du main !");
		}
}

