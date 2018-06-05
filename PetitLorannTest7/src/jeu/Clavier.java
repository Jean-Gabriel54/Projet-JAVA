package jeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier implements KeyListener{

	public Clavier() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_RIGHT){
			if (Main.scene.getxPos()<-0) {
				Main.scene.setxPos(0);}
			
			Main.scene.lorann.setMarche(true);
			Main.scene.lorann.setVersDroite(true);
			Main.scene.setDx(32);

		}
		
		
		else if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			if (Main.scene.getxPos()<-0) {
				Main.scene.setxPos(0);
			}
			
		
			Main.scene.lorann.setMarche(true);
			Main.scene.lorann.setVersDroite(false);
			Main.scene.setDx(-32);
		
		
	}
		else if(e.getKeyCode()==KeyEvent.VK_UP) {
			
			Main.scene.lorann.setMarche(true);
			Main.scene.lorann.setVersHaut(true);
			Main.scene.setDy(32);
			
		}
		
		else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			Main.scene.lorann.setMarche(true);
			Main.scene.lorann.setVersHaut(false);
			Main.scene.setDy(-32);
			
		}
		

}	

	@Override
	public void keyReleased(KeyEvent e) {
		
				
			
		Main.scene.lorann.setMarche(false);//lors du relachement des touches
		Main.scene.setDx(0);
		Main.scene.setDy(0);

		}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
