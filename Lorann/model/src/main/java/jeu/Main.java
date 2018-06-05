package jeu;

import java.sql.SQLException;

import javax.swing.JFrame;

import controller.ControllerFacade;
import jeu.Scene;
import model.ModelFacade;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {
	
	public static Scene scene;
    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
		//Création de la fenetre
		JFrame fenetre = new JFrame ("Jeu Lorann"); //Fenetre de type Jframe du nom de fenetre
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // permet de se fermer quand on appuit sur la croix
		fenetre.setSize( 640, 320); //longueur, largeur
		fenetre.setLocationRelativeTo(null); //permet de centrer la fenetre
		fenetre.setResizable(false); //interdit de redimensioner
		fenetre.setAlwaysOnTop(true); //toujours au dessus des autres fenetres
		
		
		//Instanciation de l'objet scene
		scene= new Scene ();
		fenetre.setContentPane(scene); //On associe la scene à la fentre de l'application
		fenetre.setVisible(true); //rend notre fenetre visible, a mettre en dernier sinon probleme
		}

    final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade()) ;{

    try {
        controller.start();
    } catch (final SQLException exception) {
        exception.printStackTrace();
}
}
}
}