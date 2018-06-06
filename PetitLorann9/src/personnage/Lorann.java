package personnage;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Lorann extends Personnage{
	
	private Image imgLorann;
	private ImageIcon icoLorann;

	public Lorann(int x, int y) {
		// TODO Auto-generated constructor stub
	super(x, y, 28, 50);
	this.icoLorann= new ImageIcon("src/images/lorannMarcheDroite.png");
	this.imgLorann=this.icoLorann.getImage();
	
	}

	public Image getImgLorann() {
		return imgLorann;
	}
	
	
	
}
