package Element;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier implements KeyListener {

	public Clavier() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {	
	}
		else if (e.getKeyCode()==KeyEvent.VK_LEFT) {
	}
		else if (e.getKeyCode()==KeyEvent.VK_UP) {
	}
		else if (e.getKeyCode()==KeyEvent.VK_DOWN) {
	}
			
}
		

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
