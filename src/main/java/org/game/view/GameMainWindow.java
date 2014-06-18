package org.game.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class GameMainWindow extends JFrame{
	
	public GameMainWindow(){
		setParameterWindow();
		setLayoutWindow();
	}
    	
	public void setParameterWindow(){
		setTitle("Game Java 2048");
		getContentPane().setLayout(null);
	    setResizable(false);
	    setLocationRelativeTo(null); //This line will center the window on the screen.
	    setBounds(0,0,500, 615); //Moves and resizes this component.
	    setDefaultCloseOperation(EXIT_ON_CLOSE);//Exit the application using the System exit method.  
	}
	
	public void setLayoutWindow(){
		
		JLabel gameTitle = new JLabel();
		gameTitle.setText("2048");
		gameTitle.setFont(new Font("", Font.BOLD,30));
		
		JLabel gameSlogan = new JLabel();
		gameSlogan.setText("Join the numbers and get to the 2048 tile!");
		gameSlogan.setFont(new Font("", Font.BOLD,15));
		
		JLabel currentScore = new JLabel();
		currentScore.setBackground(Color.decode("#bbada0"));
		
		JLabel bestScore = new JLabel();
		bestScore.setBackground(Color.decode("#bbada0"));
		
		JButton newGame = new JButton();
		newGame.setText("New Game");
		newGame.setFont(new Font("", Font.BOLD,15));
		newGame.setBackground(Color.decode("#8f7a66"));
		
		JLabel copyRight = new JLabel();
		copyRight.setText("Chuan DONG");
		newGame.setFont(new Font("", Font.BOLD,10));
	}
	    
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
		    public void run() {
				GameMainWindow ex = new GameMainWindow();
				ex.setVisible(true);
		    }
		});
    }
	
}
