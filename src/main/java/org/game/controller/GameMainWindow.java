package org.game.controller;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.game.view.GameCreatNew;
import org.game.view.GameKeyEvent;
import org.game.view.InitGame;
import org.game.view.MatrixTextColor;

public class GameMainWindow extends JFrame{
	
	private GameCreatNew CreatNewController;
	private GameKeyEvent KeyEventController;
	private MatrixTextColor MatrixController;
	private InitGame GameRestart;
	
	private int Score;
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
		gameTitle.setFont(new Font("", Font.BOLD,40));
		gameTitle.setForeground(Color.decode("#776e65"));
		gameTitle.setBounds(20, 20, 150, 50);
		add(gameTitle);
		
		JLabel gameSlogan = new JLabel();
		gameSlogan.setText("Join the numbers and get to the 2048 tile!");
		gameSlogan.setFont(new Font("", Font.BOLD,15));
		gameSlogan.setBounds(20, 70, 320, 50);
		add(gameSlogan);
		
		final JTextField currentScore = new JTextField(" SCORE :0");
		currentScore.setOpaque(true); 
		currentScore.setBackground(Color.decode("#bbada0"));
		currentScore.setForeground(Color.WHITE);
		currentScore.setFont(new Font("", Font.BOLD,15));
		currentScore.setBounds(200, 20, 130, 50);
		currentScore.setEditable(false);
		add(currentScore);
		
		JLabel bestScore = new JLabel();
		bestScore.setText(" BEST :0");
		bestScore.setOpaque(true); 
		bestScore.setBackground(Color.decode("#bbada0"));
		bestScore.setForeground(Color.WHITE);
		bestScore.setFont(new Font("", Font.BOLD,15));
		bestScore.setBounds(350, 20, 130, 50);
		add(bestScore);
		
		JButton newGame = new JButton();
		newGame.setText("New Game");
		newGame.setFont(new Font("", Font.BOLD,15));
		newGame.setBackground(Color.decode("#8f7a66"));
		newGame.setForeground(Color.decode("#f9f6f2"));
		newGame.setBounds(350, 80, 130, 30);
		add(newGame);
	
		JLabel copyRight = new JLabel();
		copyRight.setText("© 2014 Chuan Dong. Simulation of game 2048 by Java Swing");
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
		mainPanel.setBounds(20, 150, 460, 500);	
		mainPanel.setLayout(null);			
		
		matrixGame = new JLabel[4][4];	
		
		MatrixController = new MatrixTextColor();
		CreatNewController = new GameCreatNew();
		KeyEventController = new GameKeyEvent();
		GameRestart = new InitGame();
		
		for(int i = 0; i < 4; i++){			
			for(int j = 0; j < 4; j++){
				matrixGame[i][j] = new JLabel();
				matrixGame[i][j].setHorizontalAlignment(SwingConstants.CENTER);
				matrixGame[i][j].setBounds(120 * j, 120 * i, 100, 100);
				MatrixController.setMatrix(matrixGame, i, j, "");
				matrixGame[i][j].setOpaque(true);
				mainPanel.add(matrixGame[i][j]);							
				
			}
		}
			
		add(mainPanel);
		
		Score = 0;
		
		newGame.addMouseListener(new MouseAdapter()
		{
		    @Override
		    public void mouseClicked(MouseEvent arg0) 
		    {
		    	GameRestart.startNewGame(matrixGame);
		    }
		});
		
		currentScore.addKeyListener(new KeyAdapter(){				
			public void keyPressed(KeyEvent e){
				int code = e.getKeyCode();	//Returns the integer keyCode associated with the key in this event
				switch(code){
				//Left
				case KeyEvent.VK_LEFT:
				case KeyEvent.VK_A:		    
					Score += KeyEventController.do_Left(matrixGame);
					currentScore.setText(" SCORE : " + String.valueOf(Score));
					break;
				//Right
				case KeyEvent.VK_RIGHT:
				case KeyEvent.VK_D:
					Score += KeyEventController.do_Right(matrixGame);
					currentScore.setText(" SCORE : " + String.valueOf(Score));
					break;
				//Up
				case KeyEvent.VK_UP:
				case KeyEvent.VK_W:
					Score += KeyEventController.do_Up(matrixGame);
					currentScore.setText(" SCORE : " + String.valueOf(Score));
					break;
				//Down
				case KeyEvent.VK_DOWN:
				case KeyEvent.VK_S:
					Score += KeyEventController.do_Down(matrixGame);
					currentScore.setText(" SCORE : " + String.valueOf(Score));
					break;
				}
			}
		});
		
		/*
		 * Creat two random positions "2" elements for a new game
		 */
		CreatNewController.CreateNew(matrixGame);
		CreatNewController.CreateNew(matrixGame);
		
	}
	
	public void setLayoutWindow(){
					
	}
	    
	public static void main(String[] args) {

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
