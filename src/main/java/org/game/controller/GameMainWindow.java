package org.game.controller;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GameMainWindow extends JFrame{
	
	public GameMainWindow(){
		super();
		setTitle("Game Java 2048");
		getContentPane().setLayout(null);
	    setResizable(false);
	    setLocationRelativeTo(null); //This line will center the window on the screen.
	    setSize(500, 700);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);//Exit the application using the Systexit method.
	     
	    /*
		 * Components
		 */
		JLabel gameTitle = new JLabel();
		gameTitle.setText("2048");
		gameTitle.setFont(new Font("", Font.BOLD,30));
		gameTitle.setBounds(20, 20, 150, 50);
		add(gameTitle);
		
		JLabel gameSlogan = new JLabel();
		gameSlogan.setText("Join the numbers and get to the 2048 tile!");
		gameSlogan.setFont(new Font("", Font.BOLD,15));
		gameSlogan.setBounds(20, 70, 320, 50);
		add(gameSlogan);
		
		JLabel currentScore = new JLabel();
		currentScore.setText("CURRENT");
		currentScore.setOpaque(true); 
		currentScore.setBackground(Color.decode("#bbada0"));
		currentScore.setBounds(280, 20, 80, 50);
		add(currentScore);
		
		JLabel bestScore = new JLabel();
		bestScore.setText("BEST");
		bestScore.setOpaque(true); 
		bestScore.setBackground(Color.decode("#bbada0"));
		bestScore.setBounds(400, 20, 80, 50);
		add(bestScore);
		
		JButton newGame = new JButton();
		newGame.setText("New Game");
		newGame.setFont(new Font("", Font.BOLD,15));
		newGame.setBackground(Color.decode("#8f7a66"));
		newGame.setBounds(330, 80, 130, 30);
		add(newGame);
		
		JLabel copyRight = new JLabel();
		copyRight.setText("Chuan DONG");
		copyRight.setFont(new Font("", Font.BOLD,10));
		copyRight.setBounds(20, 630, 150, 50);
		add(copyRight);
		
		/*
		 * Panel
		 */
		JPanel mainPanel = new JPanel();
		
		/*
		 * Layout
		 */
		mainPanel.setBounds(20, 150, 460, 500);	//设置主面板位置尺寸
		mainPanel.setLayout(null);			
		
		JLabel[][] matrixGame = new JLabel[4][4];		
		for(int i = 0; i < 4; i++){			
			for(int j = 0; j < 4; j++){
				matrixGame[i][j] = new JLabel();
				matrixGame[i][j].setHorizontalAlignment(SwingConstants.CENTER);
				matrixGame[i][j].setText("");
				matrixGame[i][j].setBounds(120 * j, 120 * i, 100, 100);		

				matrixGame[i][j].setOpaque(true);
				matrixGame[i][j].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.green));
				mainPanel.add(matrixGame[i][j]);							
				
			}
		}
			
		add(mainPanel);
		
	}
	
	public void setLayoutWindow(){
					
	}
	    
	public static void main(String[] args) {
		GameMainWindow ex = new GameMainWindow();
		ex.setVisible(true);
		
//		EventQueue.invokeLater(new Runnable() {
//			@Override
//		    public void run() {
//				GameMainWindow ex = new GameMainWindow();
//				ex.setVisible(true);
//		    }
//		});
    }
}
