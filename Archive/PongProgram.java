import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// My first swing animation game 
// Using KeyListener, MouseMotionListener
// Created by: Angelica C. F. Manansala
// Last Updated: December 10, 2018

public class PongProgram implements ActionListener, KeyListener{
	// PROPERTIES
	JFrame theframe;
	PongAnimationPanel thepanel;
	Timer thetimer;
	JLabel Player1Score;
	JLabel Player2Score;

	// METHODS - ACTIONLISTENER
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource() == thetimer){
			thepanel.repaint();
		}
	}
	
	// METHODS - KEYLISTENER	
	public void keyReleased(KeyEvent evt){
		// PLAYER 1 - WHITE
		if(evt.getKeyCode() == 87){
			thepanel.blnGoUp = false;
		}else if(evt.getKeyCode() == 83){
			thepanel.blnGoDown = false;
		}	
	
		// PLAYER 2 - PINK
		if(evt.getKeyCode() == 73){
			thepanel.blnGoUp2 = false;
		}else if(evt.getKeyCode() == 75){
			thepanel.blnGoDown2 = false;
		}
	}	
	
	
	public void keyPressed(KeyEvent evt){
		//System.out.println("Key Pressed");
		//System.out.println(evt.getKeyCode());
		
		// PLAYER 1 - WHITE
		if(evt.getKeyCode() == 87){
			thepanel.blnGoUp = true;
		}else if(evt.getKeyCode() == 83){
			thepanel.blnGoDown = true;
		}
		
		// PLAYER 2 - PINK
		if(evt.getKeyCode() == 73){
			thepanel.blnGoUp2 = true;
		}else if(evt.getKeyCode() == 75){
			thepanel.blnGoDown2 = true;
		}
		
		// BALL
		//if(evt.getKeyCode() == 87 || evt.getKeyCode() == 83 || evt.getKeyCode() == 73 || evt.getKeyCode() == 75){
		if(evt.getKeyCode() == 87 || evt.getKeyCode() == 83){
			thepanel.blnGoPlay1 = true;
			thepanel.blnGoPlay2 = false;
		}else if(evt.getKeyCode() == 73 || evt.getKeyCode() == 75){
			thepanel.blnGoPlay2 = true;
			thepanel.blnGoPlay1 = false;
		}
		
	}	
		
	
	public void keyTyped(KeyEvent evt){
	}	
	
		
	// CONSTRUCTORS
	public PongProgram(){
		theframe = new JFrame("Welcome to Pong");
		thepanel = new PongAnimationPanel();
		thepanel.setLayout(null);
		thepanel.setPreferredSize(new Dimension(1000,500));
		
		Player1Score = new JLabel("0");
		Player1Score.setForeground(Color.white);
		Player1Score.setLocation(100,100);
		thepanel.add(Player1Score);
		
		Player2Score = new JLabel("0");
		Player1Score.setForeground(Color.white);
		Player2Score.setLocation(250,250);
		thepanel.add(Player2Score);
				
		Player1Score.addKeyListener(this);
		Player2Score.addKeyListener(this);
		theframe.addKeyListener(this);
		
		thetimer = new Timer(1000/60, this);
		thetimer.start();
		
		theframe.setContentPane(thepanel);
		theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theframe.pack();
		theframe.setVisible(true);
			
		
	}
	
	// MAIN METHOD
	public static void main(String[] args){
		new PongProgram();
	}






}
