package org.game.controller;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.game.view.GameCreatNew;
import org.game.view.GameKeyEvent;
import org.game.view.GameSetColor;

public class GameMainWindow extends JFrame{
	
	private GameCreatNew CreatNewController;
	private GameKeyEvent KeyEventController;
	private GameSetColor ColorController;
	
	private JLabel[][] matrixGame;
	
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
		
		JTextField currentScore = new JTextField();
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
		
		matrixGame = new JLabel[4][4];	
		
		ColorController = new GameSetColor();
		CreatNewController = new GameCreatNew();
		KeyEventController = new GameKeyEvent();
		
		for(int i = 0; i < 4; i++){			
			for(int j = 0; j < 4; j++){
				matrixGame[i][j] = new JLabel();
				matrixGame[i][j].setHorizontalAlignment(SwingConstants.CENTER);
				matrixGame[i][j].setText("");
				matrixGame[i][j].setBounds(120 * j, 120 * i, 100, 100);	
				matrixGame[i][j].setBackground(ColorController.getColor(""));
				matrixGame[i][j].setOpaque(true);
				matrixGame[i][j].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.green));
				mainPanel.add(matrixGame[i][j]);							
				
			}
		}
			
		add(mainPanel);
		
		
		currentScore.addKeyListener(new KeyAdapter(){				
			public void keyPressed(KeyEvent e){
				int code = e.getKeyCode();	//Returns the integer keyCode associated with the key in this event
				switch(code){
				//Left
				case KeyEvent.VK_LEFT:
				case KeyEvent.VK_A:		    
					KeyEventController.do_Left(matrixGame);
					break;
				//Right
				case KeyEvent.VK_RIGHT:
				case KeyEvent.VK_D:
					KeyEventController.do_Right(matrixGame);
					break;
				//Up
				case KeyEvent.VK_UP:
				case KeyEvent.VK_W:
					KeyEventController.do_Up(matrixGame);
					break;
				//Down
				case KeyEvent.VK_DOWN:
				case KeyEvent.VK_S:
					KeyEventController.do_Down(matrixGame);
					break;
				}
			}
		});
		
		CreatNewController.CreateNew(matrixGame);
		CreatNewController.CreateNew(matrixGame);
		
	}
	
	public void setLayoutWindow(){
					
	}
	    
	public static void main(String[] args) {
//		GameMainWindow ex = new GameMainWindow();
//		ex.setVisible(true);
		
		EventQueue.invokeLater(new Runnable() {
			@Override
		    public void run() {
				GameMainWindow ex = new GameMainWindow();
				ex.setVisible(true);
		    }
		});
//		EventQueue.invokeLater(new Runnable(){
//			public void run(){
//				try{
//					GameMainWindow frame = new GameMainWindow();
//					frame.setVisible(true);
//				//	Thread thread = new Thread(frame);
//				//	thread.start();
//				}
//				catch(Exception e1){
//					e1.printStackTrace();
//				}
//			}
//		});
	}
	
}
