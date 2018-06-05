package jeu;

public class Chrono implements Runnable {

	private final int PAUSE = 100; // temps d'attente entre 2 boucles pour repeindre l'écran

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) { //Boucle infini
			/*if(Main.scene.getxPos()<-1) {
				Main.scene.setxPos(0);
			
			}else if(Main.scene.getxPos()>641) {
				Main.scene.setxPos(640);
			}
				else if(Main.scene.getyPos()<-1) {
				Main.scene.setyPos(0);
			}
				else if(Main.scene.getyPos()>321) {
				Main.scene.setyPos(320);
			}
			*/

			
			Main.scene.repaint(); // repaint de la fenetre toute les PAUSES=100s
			try {
				Thread.sleep (PAUSE);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
	
