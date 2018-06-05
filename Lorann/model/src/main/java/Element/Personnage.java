package personnage;

import java.awt.Image;

import javax.swing.ImageIcon;

import jeu.Main;

public class Personnage {
	
	private int largeur, hauteur; //dimension perso
	private int x,y; //position perso
	private boolean marche; //il marche ou pas
	private boolean versDroite; // si il va vers la droite
	public int compteur; //frequence des pas du personnage
	public boolean versHaut;
	
	
	public Personnage(int x, int y, int largeur, int hauteur) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
		this.largeur=largeur;
		this.hauteur=hauteur;
		this.compteur=0;
		this.marche=false;
		this.versDroite= true;
		
	}

	public int getLargeur() {
		return largeur;
	}
	
	
	public int getHauteur() {
		return hauteur;
	}


	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	
	public boolean isMarche() {
		return marche;
	}
	public void setMarche(boolean marche) {
		this.marche = marche;
	}

	
	public boolean isVersDroite() {
		return versDroite;
	}
	public void setVersDroite(boolean versDroite) {
		this.versDroite = versDroite;
	}

	
	public boolean isVersHaut() {
		return versHaut;
	}
	public void setVersHaut(boolean versHaut) {
		this.versHaut = versHaut;
	}

	public int getCompteur() {
		return compteur;
	}
	public void setCompteur(int compteur) {
		this.compteur = compteur;
	}

	
	public Image marche (String nom, int frequence) {
		
		String str;
		ImageIcon ico;
		Image img;
		
		
		if (this.marche == false || Main.scene.getxPos()<=0){Main.scene.repaint();
			if(this.versDroite == true){str = "/images/" + nom + "ArretDroite.png";
				Main.scene.repaint();}
			else {str = "/images/" + nom + "ArretGauche.png";}
		}else{
			this.compteur++;
			if(this.compteur/frequence == 0) {
				if (this.versDroite == true) {	str = "/images/" + nom + "ArretDroite.png";	}
					else {str = "/images/" + nom + "ArretGauche.png";}	
			}else{
				if (this.versDroite == true) {	str = "/images/" + nom + "MarcheDroite.png";}
				else {str = "/images/" + nom + "MarcheGauche.png";}	
			}
			if(this.compteur == 2*frequence) {this.compteur = 0;}
		}
		
		
		/*if (this.marche == false || Main.scene.getyPos()<=150){
			if(this.versHaut == true){str = "/images/" + nom + "ArretHaut.png";}
			else {str = "/images/" + nom + "ArretBas.png";}
		}/*else{
			this.compteur++;
			if(this.compteur/frequence == 0) {
				if (this.versHaut== true) {	str = "/images/" + nom + "ArretHaut.png";}
					else {str = "/images/" + nom + "ArretBas.png";}	
			}else{
				if (this.versDroite == true) {	str = "/images/" + nom + "MarcheDroite.png";}
				else {str = "/images/" + nom + "MarcheGauche.png";}	
			}
			if(this.compteur == 2*frequence) {this.compteur = 0;}*/
		
		
		

		
	
		//affichage de l'image du personnage
		ico= new ImageIcon(getClass().getResource(str));
		img=ico.getImage();
		return img;
		
		
		
	}
	
	
}
