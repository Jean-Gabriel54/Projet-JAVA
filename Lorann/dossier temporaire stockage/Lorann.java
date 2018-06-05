
import java.awt.Image;

import javax.swing.ImageIcon;

public class Lorann extends Personnage{
	
	private Image imgLorranD;
	private ImageIcon icoLorannD;

	public Lorann (int x, int y) {
		// TODO Auto-generated constructor stub
	super(x, y, 28, 50);
	icoLorannD= new ImageIcon(getClass().getResource("/images/lorann_r.png")); 
	this.imgLorannD = this.icoLorannD.getImage();
	}

	public Image getImgLorannD() {
		return imgLorannD;
	}
	
	
	
}