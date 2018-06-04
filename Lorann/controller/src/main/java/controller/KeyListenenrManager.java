package controller;


	import java.awt.BorderLayout;

	
	import java.awt.Container;
	
	import java.awt.event.KeyEvent;

	import java.awt.event.KeyListener;

	 
	
	import javax.swing.JFrame;
	
	import javax.swing.JTextField;
	
	 /**
	     * This code has for goal to control the key event of the game
	     */
	
	public class KeyListenenrManager {
	
		/**
		 * Name of the class in accordance with our class diagram controller
		 * @param args
		 */
	 
	
	    public static void main(String args[]) {
	
	 
	
	  JFrame frame = new JFrame("Key Listener");
      /**
       * JFrame allows us to create some object of window or screen type, in this case the window will be Key Listener
       */
	 
	
	  Container contentPane = frame.getContentPane();
	
	 /*
	  * The container is an graphic object able to contain other graphic object
	  */
	
	  KeyListener listener = new KeyListener() {
	
	 /*
	  * (non-Javadoc)
	  * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	  */
	
	
	
	 
	
	public void keyPressed(KeyEvent event) {
	
	 /*
	  * This class instantiates a unique key event namely key Pressed
	  */
	
	    printEventInfo("Key Pressed", event);
	/*
	 * This event allows us to know which key has been pressed
	 */
	 
	
	}
	
	 
	

	
	
	
	public void keyReleased(KeyEvent event) {
	
	 /*
	  * This class initiates a unique key event namely Key Released
	  */
	
	    printEventInfo("Key Released", event);
	/*
	 * This event allows us to know which key has been released after the pressing
	 */
	 
	
	}
	
	 
	

	
	 
	
	public void keyTyped(KeyEvent event) {
	
	 
	
	    printEventInfo("Key Typed", event);
	
	 
	
	}
	
	 
	
	private void printEventInfo(String str, KeyEvent e) {
	
	 /*
	  * 
	  */
	
	    System.out.println(str);
	/*
	 * Allow to display some text 
	 */
	 
	
	    int code = e.getKeyCode();
	
	 
	
	    System.out.println("   Code: " + KeyEvent.getKeyText(code));
	
	 
	
	    System.out.println("   Char: " + e.getKeyChar());
	
	 
	
	    int mods = e.getModifiersEx();
	
	 
	
	    System.out.println("    Mods: "
	
	 
	
	+ KeyEvent.getModifiersExText(mods));
	
	
	
	    System.out.println("    Location: "
	
	 
	
	+ keyboardLocation(e.getKeyLocation()));
	
	 
	
	    System.out.println("    Action? " + e.isActionKey());
	
	 
	
	}

	 
	
	private String keyboardLocation(int keybrd) {
	
	 /*
	  * Here we have all information about the location of our key
	  */
	
	    switch (keybrd) {
	
	 
	
	  case KeyEvent.KEY_LOCATION_RIGHT:
	
	
	
	return "Right";
	
	 
	
	  case KeyEvent.KEY_LOCATION_LEFT:
	
	 
	
	return "Left";
	
	 
	
	  case KeyEvent.KEY_LOCATION_NUMPAD:
	
	 
	
	return "NumPad";
	
	 
	
	  case KeyEvent.KEY_LOCATION_STANDARD:
	
	 
	
	return "Standard";
	
	 
	
	  case KeyEvent.KEY_LOCATION_UNKNOWN:
	
	 
	
	  default:
	
	 
	
	return "Unknown";
	
	 
	
	    }
	
	 
	
	}
	
	 
	
	  };
	
	 
	
	  JTextField textField = new JTextField();
	
	
	
	  textField.addKeyListener(listener);
	
	 
	
	  contentPane.add(textField, BorderLayout.NORTH);
	
	 
	
	  frame.pack();
	
	 
	
	  frame.setVisible(true);
	
	    }
	
	}


