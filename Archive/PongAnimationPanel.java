import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

// My first swing animation game 
// Using KeyListener, MouseMotionListener
// Created by: Angelica C. F. Manansala
// Last Updated: December 10, 2018

public class PongAnimationPanel extends JPanel{
	// PROPERTIES
	int intPaddleY = 175;
	int intPaddleY2 = 175;
	int intBallY = 250;
	int intBallX = 450;
	
	int intCount;
	
	boolean blnGoUp = false;
	boolean blnGoDown = false;
	boolean blnGoUp2 = false; 
	boolean blnGoDown2 = false;
	
	boolean blnGoPlay1 = false;
	boolean blnGoPlay2 = false;
	
	int intPlayer1Score = 0;
	int intPlayer2Score = 0;
		
		
	// RANDOM NUMBER GENERATOR
	int intrandx = (int)(Math.random() * 50 + 1);
	int intrandy = (int)(Math.random() * 50 + 1);	
	
	// METHODS
	public void paintComponent(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0,0,1000,500);
		
		// Player 1 (left)
		g.setColor(Color.WHITE);
		g.fillRect(50,intPaddleY,50,150);
		
		if(blnGoUp){
			intPaddleY = intPaddleY - 10;
		}else if(blnGoDown){
			intPaddleY = intPaddleY + 10;
		}
		
		// Player 2 (right)
		g.setColor(Color.WHITE);
		g.fillRect(900,intPaddleY2,50,150);
		if(blnGoUp2){
			intPaddleY2 = intPaddleY2 - 10;
		}else if(blnGoDown2){
			intPaddleY2 = intPaddleY2 + 10;
		}
		
		// BALL 
		if(blnGoPlay1){
			for(intCount = 1; intCount < 5; intCount++){
				intBallX--;
				//intrandy = intrandy - 2;
			}
		}else if(blnGoPlay2){
			for(intCount = 1; intCount < 5; intCount++){
				intBallX++;
				//intrandy = intrandy + 2;
			}
		}
		
		g.setColor(Color.WHITE);
		g.fillOval(intBallX, intBallY, 50, 50);
		
	}
	
	// CONSTRUCTOR
	public PongAnimationPanel(){
		super();
	}
	



}
