package org.game.view;

import java.awt.Color;

import javax.swing.JLabel;

public abstract class GameSetColor {
	
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
