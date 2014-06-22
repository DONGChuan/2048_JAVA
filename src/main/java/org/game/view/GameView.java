package org.game.view;

import java.awt.Color;
import java.util.Random;

import javax.swing.JLabel;

public class GameView {
	
	private int times = 16;									
	Random random = new Random();
	
	public void CreateNew(JLabel[][] matrixGame){
		int i ,j;
		boolean flag = false;
		String str;
		
		if(times > 0){
			while(!flag){
				i = random.nextInt(4);// Random 0 ~ 3
				j = random.nextInt(4);
				str = matrixGame[i][j].getText();
				
				if((str.compareTo("") == 0)){
					matrixGame[i][j].setText("2");
					setColor(matrixGame, i, j, "2");
				
					times --;
					flag = true;	
				}
			}
		}
	}
	
	public void setColor(JLabel[][] matrixGame, int i, int j, String str){
		switch(str){
		case "2":
			matrixGame[i][j].setBackground(Color.yellow);
			break;
		case "4":
			matrixGame[i][j].setBackground(Color.red);
			break;
		case "8":
			matrixGame[i][j].setBackground(Color.pink);
			break;
		case "16":
			matrixGame[i][j].setBackground(Color.orange);
			break;
		case "32":
			matrixGame[i][j].setBackground(Color.magenta);
			break;
		case "64":
			matrixGame[i][j].setBackground(Color.LIGHT_GRAY);
			break;
		case "128":
			matrixGame[i][j].setBackground(Color.green);
			break;
		case "256":
			matrixGame[i][j].setBackground(Color.GRAY);
			break;
		case "512":
			matrixGame[i][j].setBackground(Color.DARK_GRAY);
			break;
		case "1024":
			matrixGame[i][j].setBackground(Color.cyan);
			break;
		case "2048":
			matrixGame[i][j].setBackground(Color.blue);
			break;
		case "":
		case "4096":
			matrixGame[i][j].setBackground(Color.white);
			break;
		default:
			break;
		}

	}
}
