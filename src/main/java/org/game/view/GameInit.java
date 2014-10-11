package org.game.view;

import javax.swing.JLabel;

/**
 *Title: InitGame
 *Description: This class is used to restart the game.
 *Copyright: Copyright(c)2014
 *@author DONG Chuan
 *@version 1.0
 */
public class GameInit {
	
	public static void startNewGame(JLabel[][] matrixGame){
		
		for(int i=0; i<4 ;i++){
			for(int j=0; j<4; j++){
				GameMatrix.setMatrix(matrixGame, i, j, "");
			}
		}
		
		//Creat two random positions "2" elements for a new game
		GameNewCell.CreateNew(matrixGame);
		GameNewCell.CreateNew(matrixGame);
	}
}
