package objet;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Money extends Objet{
	

	private ImageIcon icoMoney; 
	private Image imgMoney;
	
	public Money(int x, int y) {
		// TODO Auto-generated constructor stub
		super(x,y,43,65);
		icoMoney= new ImageIcon(getClass().getResource("/images/purse.png")); 
		this.imgMoney = this.icoMoney.getImage();
		
	}

	public Image getImgMoney() {
		return imgMoney;
	}
	public void setImgMoney(Image imgMoney) {
		this.imgMoney= imgMoney;
	}


	}

