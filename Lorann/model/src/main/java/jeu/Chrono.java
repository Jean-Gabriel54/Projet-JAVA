package jeu;

public class Chrono implements Runnable {

	private final int PAUSE = 100; // temps d'attente entre 2 boucles pour repeindre l'écran

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			
			Main.scene.repaint();
		
			
			try {
				Thread.sleep (PAUSE);
			} catch (InterruptedException e) {}
			
		}
		
	}

}
