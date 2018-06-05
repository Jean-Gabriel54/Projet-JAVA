package controller;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;


public class clock extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// components
	JTextField timeF;
	JPanel panel;
	
	public clock() {
		// housekeeping
		super("Java Clock by [insert your name here]");
		setSize(50,50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(true);// for now
		setLocationRelativeTo(null);
		
		//initialize the panel
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		//initialize the textField
		timeF = new JTextField(10);
		timeF.setEditable(false);
		timeF.setFont(new Font("Arial",Font.PLAIN,10));
		
		panel.add(timeF);
		
		add(panel);
		Timer t = new Timer(1000, new Listener());
		t.start();
		
	
 }
	class Listener implements ActionListener{   
		public void actionPerformed (ActionEvent e ) {
		
			
			Calendar rightNow = Calendar.getInstance();
			
			int hour = rightNow.get (Calendar.HOUR_OF_DAY);
			int min = rightNow.get (Calendar.MINUTE);
			int sec = rightNow.get (Calendar.SECOND);
			
			timeF.setText(hour+":"+min+":"+sec);
			
		}
		
		
	}
}





