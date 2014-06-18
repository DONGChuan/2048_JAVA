package org.game.view;

import javax.swing.JFrame;
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
