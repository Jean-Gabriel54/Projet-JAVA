package jeu;

import javax.swing.JFrame;

public class Main {
	
	public static Scene scene;
	
	
	public Main() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Création de la fenetre
		JFrame fenetre = new JFrame ("Jeu Lorann"); //Fenetre de type Jframe du nom de fenetre
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // permet de se fermer quand on appuit sur la croix
		fenetre.setSize( 625, 325); //longueur, largeur
		fenetre.setLocationRelativeTo(null); //permet de centrer la fenetre
		fenetre.setResizable(true); //interdit de redimensioner
		fenetre.setAlwaysOnTop(true); //toujours au dessus des autres fenetres
		
		
		//Instanciation de l'objet scene
		scene= new Scene ();
		fenetre.setContentPane(scene); //On associe la scene à la fenetre de l'application
		fenetre.setVisible(true); //rend notre fenetre visible, a mettre en dernier sinon probleme
		}


	}
