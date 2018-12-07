import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class PongAnimationPanel extends JPanel{
	// PROPERTIES
	int intBallY = 0;
	int intBallY2 = 0;
	
	boolean blnGoUp = false;
	boolean blnGoDown = false;
	boolean blnGoUp2 = false;
	boolean blnGoDown2 = false;
	
	int intPlayer1Score = 0;
	int intPlayer2Score = 0;
	
	// METHODS
	public void paintComponent(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0,0,1000,500);
		
		// Player 1 (white)
		g.setColor(Color.WHITE);
		g.fillRect(50,intBallY,50,150);
		
		if(blnGoUp){
			intBallY = intBallY - 10;
		}else if(blnGoDown){
			intBallY = intBallY + 10;
		}
		
		// Player 2 (pink)
		g.setColor(Color.PINK);
		g.fillRect(900,intBallY2,50,150);
		
		if(blnGoUp2){
			intBallY2 = intBallY2 - 10;
		}else if(blnGoDown2){
			intBallY2 = intBallY2 + 10;
		}
		
		
	}
	
	// CONSTRUCTOR
	public PongAnimationPanel(){
		super();
	}
	



}
