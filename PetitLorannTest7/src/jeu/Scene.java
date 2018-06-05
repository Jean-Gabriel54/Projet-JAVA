package jeu;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import objet.Money;

import personnage.Lorann;

import java.awt.Graphics2D;


//Classe importante, contient le "moteur" de l'application

@SuppressWarnings("serial")
public class Scene extends JPanel{

	private ImageIcon icoground;
	private Image imgGround;

	private ImageIcon icoWallCross;
	private Image imgWallCross;
	
	private ImageIcon icoWallH; 
	private Image imgWallH;
	
	private ImageIcon icoWallV;
	private Image imgWallV;
	
	
	private int yPos;
	private int xFond1; //point d'absisses Haut gauche
	private int xFond2;
	private int dx; // ce qui va permettre de déplacer  horizontalement
	private int xPos; //reperer les elements du jeu en x
	private int dy;
	
	
	public Lorann lorann;
	public Money bloc1;
	
	public Scene() {
		// TODO Auto-generated constructor stub
		super();
		//this.xFond2 = 700;
		this.xFond1=0; //Initialisation des valeurs
		this.dx=0;
		this.dy=0;
		this.xPos=-1;
		this.yPos =-1;
		
		
		icoground= new ImageIcon(getClass().getResource("/images/ground.png")); 
		this.imgGround = this.icoground.getImage();//associe icoFond avec la variable imgFond1
		
		icoWallCross= new ImageIcon(getClass().getResource("/images/bone.png")); 
		this.imgWallCross = this.icoWallCross.getImage();//associe icoWallCross a imgWallCross
		
		icoWallH= new ImageIcon(getClass().getResource("/images/horizontal_bone.png")); 
		this.imgWallH = this.icoWallH.getImage();
		
		
		icoWallV= new ImageIcon(getClass().getResource("/images/vertical_bone.png")); 
		this.imgWallV = this.icoWallV.getImage();
		
	
		
	
		
		
						
		this.setFocusable(true);//pour ecouter l'écran
		this.requestFocusInWindow();//pour récuperer le focus
		this.addKeyListener(new Clavier()); //dire que Clavier s'occuper de Keylistener
		
		Thread chronoEcran = new Thread(new Chrono()); //Chrono s'occupe du thread de repaint
		chronoEcran.start();
	}
	

	
	
	
	
	public int getxPos() { //Getter et setters des variables
		return xPos;
	}
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}
	
	public int getyPos() {
		return yPos;
	}
	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	

	public int getDx() {
		return dx;
	}
	public void setDx(int dx) {
		this.dx = dx;
	}
	
	public int getDy() {
		return dx;
	}
	public void setDy(int dy) {
		this.dy = dy;
	}

	


	public int getxFond1() {
		return xFond1;
	}
	public void setxFond1(int xFond1) {
		this.xFond1 = xFond1;
	}



	public int getxFond2() {
		return xFond2;
	}
	public void setxFond2(int xFond2) {
		this.xFond2 = xFond2;
	}

		

	


	public void deplacementFond() {
		
		if(this.yPos>=0) {
			this.yPos=this.yPos+this.dy;}  //incrementer ou decrementer par rapport aux touches préssée
		
	
		

	
		if(this.xPos>=0) {
			this.xPos= this.xPos +this.dx;
		}
	/*	
		if (this.yPos>=-150) {
			this.yPos=this.yPos+this.dy;
			}
		
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
		}*/
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g; //permet d'ameliorer les graphics en 2D
		
		this.deplacementFond();
		
		
		g2.drawImage(this.imgGround, 0, 0, null);//on dessine les images avec g2
		//g2.drawImage(imgGround2, xFond2, 0, null);
		// l'orde est l'image, les x, les y, et l'observer tjr null
		g2.drawImage(this.lorann.marche("lorann",25), 32+this.getxPos(), 224+this.getyPos(), null);
		g2.drawImage(this.imgWallCross,0,0,null);
		g2.drawImage(this.imgWallCross,0,256,null);
		g2.drawImage(this.imgWallCross,576,0,null);
		g2.drawImage(this.imgWallCross,576,256,null);
		g2.drawImage(this.imgWallV,0,32,null);
		g2.drawImage(this.imgWallV,0,64,null);
		g2.drawImage(this.imgWallV,0,96,null);
		g2.drawImage(this.imgWallV,0,128,null);
		g2.drawImage(this.imgWallV,0,160,null);
		g2.drawImage(this.imgWallV,0,192,null);
		g2.drawImage(this.imgWallV,0,224,null);
		
		g2.drawImage(this.imgWallV,576,32,null);
		g2.drawImage(this.imgWallV,576,64,null);
		g2.drawImage(this.imgWallV,576,96,null);
		g2.drawImage(this.imgWallV,576,128,null);
		g2.drawImage(this.imgWallV,576,160,null);
		g2.drawImage(this.imgWallV,576,192,null);
		g2.drawImage(this.imgWallV,576,224,null);
		
		g2.drawImage(this.imgWallH,32,0,null);
		g2.drawImage(this.imgWallH,64,0,null);
		g2.drawImage(this.imgWallH,96,0,null);
		g2.drawImage(this.imgWallH,128,0,null);
		g2.drawImage(this.imgWallH,160,0,null);
		g2.drawImage(this.imgWallH,192,0,null);
		g2.drawImage(this.imgWallH,224,0,null);
		g2.drawImage(this.imgWallH,256,0,null);
		g2.drawImage(this.imgWallH,288,0,null);
		g2.drawImage(this.imgWallH,320,0,null);
		g2.drawImage(this.imgWallH,352,0,null);
		g2.drawImage(this.imgWallH,384,0,null);
		g2.drawImage(this.imgWallH,416,0,null);
		g2.drawImage(this.imgWallH,448,0,null);
		g2.drawImage(this.imgWallH,480,0,null);
		g2.drawImage(this.imgWallH,512,0,null);
		g2.drawImage(this.imgWallH,544,0,null);		
	
		g2.drawImage(this.imgWallH,32,256,null);
		g2.drawImage(this.imgWallH,64,256,null);
		g2.drawImage(this.imgWallH,96,256,null);
		g2.drawImage(this.imgWallH,128,256,null);
		g2.drawImage(this.imgWallH,160,256,null);
		g2.drawImage(this.imgWallH,192,256,null);
		g2.drawImage(this.imgWallH,224,256,null);
		g2.drawImage(this.imgWallH,256,256,null);
		g2.drawImage(this.imgWallH,288,256,null);
		g2.drawImage(this.imgWallH,320,256,null);
		g2.drawImage(this.imgWallH,352,256,null);
		g2.drawImage(this.imgWallH,384,256,null);
		g2.drawImage(this.imgWallH,416,256,null);
		g2.drawImage(this.imgWallH,448,256,null);
		g2.drawImage(this.imgWallH,480,256,null);
		g2.drawImage(this.imgWallH,512,256,null);
		g2.drawImage(this.imgWallH,544,256,null);		
	
		
		
		//g2.drawImage(imgChateau1, 10, 95, null);
		//g2.drawImage(imgDepart, 220, 234, null);
		//g2.drawImage(this.tuyauRouge1.getImgTuyauRouge(),this.tuyauRouge1.getX() ,this.tuyauRouge1.getY(),null);
		g2.drawImage(this.bloc1.getImgMoney(),this.bloc1.getX() ,this.bloc1.getY(),null);

	}
}
