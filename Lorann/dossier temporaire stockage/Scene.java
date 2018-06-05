package Element;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;



@SuppressWarnings("serial")
public class Scene extends JPanel{

	private ImageIcon icoWallCross;
	private Image imgWallCross;
	
	private ImageIcon icoWallH; 
	private Image imgWallH;
	
	private ImageIcon icoWallV;
	private Image imgWallV;
	
	private ImageIcon icoBubble;
	private Image imgBubble;
	
	private ImageIcon icoFireball1;
	private Image imgFireball1;
	
	private ImageIcon icoFireball2;
	private Image imgFireball2;

	private ImageIcon icoFireball3;
	private Image imgFireball3;
	
	private ImageIcon icoFireball4; 
	private Image imgFireball4;

	private ImageIcon icoFireball5; 
	private Image imgFireball5;
	
	private ImageIcon icoDoorclose; 
	private Image imgDoorclose;
	
	private ImageIcon icoDooropen;
	private Image imgDooropen;
	
	private ImageIcon icoLorannB; 
	private Image imgLorannB;
	
	private ImageIcon icoLorannBG; 
	private Image imgLorannBG;
	
	private ImageIcon icoLorannBD; 
	private Image imgLorannBD;
	
	private ImageIcon icoLorannD; 
	private Image imgLorannD;
	
	private ImageIcon icoLorannG; 
	private Image imgLorannG;
	
	private ImageIcon icoLorannH; 
	private Image imgLorannH;
	
	private ImageIcon icoLorannHD; 
	private Image imgLorannHD;
	
	private ImageIcon icoLorannHG; 
	private Image imgLorannHG;
	
	private ImageIcon icoMonster1; 
	private Image imgMonster1;

	private ImageIcon icoMonster2; 
	private Image imgMonster2;
	
	private ImageIcon icoMonster3; 
	private Image imgMonster3;
	
	private ImageIcon icoMonster4; 
	private Image imgMonster4;

	private ImageIcon icoMoney; 
	private Image imgMoney;
	

	private int xFond1; //point d'absisses Haut gauche
	private int dx; // ce qui va permettre de déplacer l'écran horizontalement
	private int xPos; //reperer les elements du jeu en x
	
	
	public Scene () {
		
		super();
		this.xFond1=-50; //deborde de l'écran
		this.dx=0;
		this.xPos=-1;
		
		icoWallCross= new ImageIcon(getClass().getResource("/images/bone.png")); 
		this.imgWallCross = this.icoWallCross.getImage();//associe icoWallCross a imgWallCross
		
		icoWallH= new ImageIcon(getClass().getResource("/images/horizontal_bone.png")); 
		this.imgWallH = this.icoWallH.getImage();
		
		
		icoWallV= new ImageIcon(getClass().getResource("/images/vertical_bone.png")); 
		this.imgWallV = this.icoWallV.getImage();
		

		icoFireball1= new ImageIcon(getClass().getResource("/images/fireball_1.png")); 
		this.imgFireball1 = this.icoFireball1.getImage();

		icoFireball2= new ImageIcon(getClass().getResource("/images/fireball_2.png")); 
		this.imgFireball2 = this.icoFireball2.getImage();
		

		icoFireball3= new ImageIcon(getClass().getResource("/images/fireball_3.png")); 
		this.imgFireball3 = this.icoFireball3.getImage();
		

		icoFireball4= new ImageIcon(getClass().getResource("/images/fireball_4.png")); 
		this.imgFireball4 = this.icoFireball4.getImage();
		

		icoFireball5= new ImageIcon(getClass().getResource("/images/fireball_5.png")); 
		this.imgFireball5 = this.icoFireball5.getImage();
		

		icoDoorclose= new ImageIcon(getClass().getResource("/images/gate_closed.png")); 
		this.imgDoorclose = this.icoDoorclose.getImage();
		

		icoDooropen= new ImageIcon(getClass().getResource("/images/gate_open.png")); 
		this.imgDooropen = this.icoDooropen.getImage();
		

		icoLorannB= new ImageIcon(getClass().getResource("/images/lorann_b.png")); 
		this.imgLorannB = this.icoLorannB.getImage();
		
		icoLorannBG= new ImageIcon(getClass().getResource("/images/lorann_bl.png")); 
		this.imgLorannBG = this.icoLorannBG.getImage();
		
		icoLorannBD= new ImageIcon(getClass().getResource("/images/lorann_br.png")); 
		this.imgLorannBD = this.icoLorannBD.getImage();
		
		
		
		icoLorannG= new ImageIcon(getClass().getResource("/images/lorann_l.png")); 
		this.imgLorannG = this.icoLorannG.getImage();
		
		icoLorannH= new ImageIcon(getClass().getResource("/images/lorann_u.png")); 
		this.imgLorannH = this.icoLorannH.getImage();
		
		icoLorannHD= new ImageIcon(getClass().getResource("/images/lorann_ur.png")); 
		this.imgLorannHD = this.icoLorannHD.getImage();

		icoLorannHG= new ImageIcon(getClass().getResource("/images/lorann_ul.png")); 
		this.imgLorannHG = this.icoLorannHG.getImage();
		

		icoMonster1= new ImageIcon(getClass().getResource("/images/monster1.png")); 
		this.imgMonster1 = this.icoMonster1.getImage();

		icoMonster2= new ImageIcon(getClass().getResource("/images/monster2.png")); 
		this.imgMonster2 = this.icoMonster2.getImage();
		
		icoMonster3= new ImageIcon(getClass().getResource("/images/monster3.png")); 
		this.imgMonster3 = this.icoMonster3.getImage();
		
		icoMonster4= new ImageIcon(getClass().getResource("/images/monster4.png")); 
		this.imgMonster4 = this.icoMonster4.getImage();

		icoMoney= new ImageIcon(getClass().getResource("/images/purse.png")); 
		this.imgMoney = this.icoMoney.getImage();
		
		icoMonster2= new ImageIcon(getClass().getResource("/images/monster2.png")); 
		this.imgMonster2 = this.icoMonster2.getImage();
	
	this.setFocusable(true);//pour ecouter l'écran
	this.requestFocusInWindow();//pour récuperer le focus
	this.addKeyListener(new Clavier());
	
	
	
	
	public int getxPos() {
		return xPos;
	}
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}


	public int getDx() {
		return dx;
	}
	public void setDx(int dx) {
		this.dx = dx;
	}



	public int getxFond1() {
		return xFond1;
	}
	public void setxFond1(int xFond1) {
		this.xFond1 = xFond1;
	}



	public void deplacementFond() {
	
		if(this.xPos>=0) {
			this.xPos= this.xPos +this.dx;
			this.xFond1=this.xFond1-this.dx;
			this.xFond2=this.xFond2 - this.dx;
		}
		
		if (this.xFond1 == -800) {
			this.xFond1=800;
		}
		else if (this.xFond2 == -800) {
				this.xFond2 =800;
			}
		else if (this.xFond1 == 800) {
			this.xFond1 = -800;
		}
		else if (this.xFond2 == 800) {
			this.xFond2 = -800;
		}
	}
}
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g; //permet d'ameliorer les graphics en 2D
		
		this.deplacementFond();
		
		
		g2.drawImage(this.imgFond1, this.xFond1, 0, null);//on dessine les images avec g2
		g2.drawImage(imgFond2, xFond2, 0, null);
		// l'orde est l'image, les x, les y, et l'observer tjr null
		g2.drawImage(this.mario.marche("mario",25), 300, 245, null);
		g2.drawImage(imgChateau1, 10-this.xPos, 95, null);
		g2.drawImage(imgDepart, 220-this.xPos, 234, null);
		g2.drawImage(this.tuyauRouge1.getImgTuyauRouge(),this.tuyauRouge1.getX()-this.xPos ,this.tuyauRouge1.getY(),null);
		g2.drawImage(this.bloc1.getImgBloc(),this.bloc1.getX()- this.xPos ,this.bloc1.getY(),null);

	}
}
