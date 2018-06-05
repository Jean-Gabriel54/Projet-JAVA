package jeu;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import objet.Money;
import objet.TuyauRouge;
import personnage.Lorann;

import java.awt.Graphics2D;


//Classe importante, contient le "moteur" de l'application

@SuppressWarnings("serial")
public class Scene extends JPanel{

	private ImageIcon icoground;
	private Image imgGround;
	private Image imgGround2;

	private ImageIcon icoChateau1;
	private Image imgChateau1;
	
	private ImageIcon icoDepart;
	private Image imgDepart;
	
	
	private int yPos;
	private int xFond1; //point d'absisses Haut gauche
	private int xFond2;
	private int dx; // ce qui va permettre de déplacer  horizontalement
	private int xPos; //reperer les elements du jeu en x
	private int dy;
	
	
	public Lorann lorann;
	public TuyauRouge tuyauRouge1;
	public Money bloc1;
	
	public Scene() {
		// TODO Auto-generated constructor stub
		super();
		//this.xFond2 = 700;
		this.xFond1=0; //deborde de l'écran
		this.dx=0;
		this.dy=0;
		this.xPos=-1;
		this.yPos =-1;
		
		
		icoground= new ImageIcon(getClass().getResource("/images/ground.png")); 
		this.imgGround = this.icoground.getImage();//associe icoFond avec la varible imgFond1
		this.imgGround2 = this.icoground.getImage();
		
		icoChateau1 =new ImageIcon(getClass().getResource("/images/chateau1.png"));
		this.imgChateau1= this.icoChateau1.getImage();
		
		icoDepart =new ImageIcon(getClass().getResource("/images/depart.png"));
		this.imgDepart= this.icoDepart.getImage();
		
		
		lorann= new Lorann(300,200);
		tuyauRouge1= new TuyauRouge (600,230);
		bloc1= new Money (256,96);
		
		
						
		this.setFocusable(true);//pour ecouter l'écran
		this.requestFocusInWindow();//pour récuperer le focus
		this.addKeyListener(new Clavier());
		
		Thread chronoEcran = new Thread(new Chrono());
		chronoEcran.start();
	}
	
	
	
	
	public int getxPos() {
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
		
		if(this.yPos>0) {
			this.yPos=this.yPos+this.dy;}
		else if(this.yPos<0) {
				this.yPos=this.yPos-this.dy;
			}
		
		
		
		
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
		
		
		g2.drawImage(this.imgGround, this.xFond1, 0, null);//on dessine les images avec g2
		//g2.drawImage(imgGround2, xFond2, 0, null);
		// l'orde est l'image, les x, les y, et l'observer tjr null
		g2.drawImage(this.lorann.marche("lorann",25), 0+this.getxPos(), 256+this.getyPos(), null);
		//g2.drawImage(imgChateau1, 10, 95, null);
		//g2.drawImage(imgDepart, 220, 234, null);
		//g2.drawImage(this.tuyauRouge1.getImgTuyauRouge(),this.tuyauRouge1.getX() ,this.tuyauRouge1.getY(),null);
		g2.drawImage(this.bloc1.getImgMoney(),this.bloc1.getX() ,this.bloc1.getY(),null);

	}
}
