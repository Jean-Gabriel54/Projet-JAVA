package objet;

public class Objet {
	private int largeur, hauteur;
	private int x, y;
	
	
	
	public Objet(int x, int y, int largeur, int hauteur) {
		// TODO Auto-generated constructor stub
		
		this.x=x;
		this.y=y;
		this.largeur = largeur;
		this.hauteur=hauteur;
	}



	public int getLargeur() {
		return largeur;
	}
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}


	public int getHauteur() {
		return hauteur;
	}
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
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
	
}
