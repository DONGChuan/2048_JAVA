package org.game.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class GameMainWindow extends JFrame{
	
	public GameMainWindow(){
		setParameterWindow();
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
		JLabel gameSlogan = new JLabel();
		JLabel currentScore = new JLabel();
		JLabel bestScore = new JLabel();
		JButton newGame = new JButton();
		JLabel copyRight = new JLabel();
		
		
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
