package org.game.view;

import javax.swing.JLabel;

public class InitGame {
	
	private MatrixTextColor MatrixController;
	private GameCreatNew CreatNewController;
	
	public InitGame(){}
	
	public void startNewGame(JLabel[][] matrixGame){
		
		MatrixController = new MatrixTextColor();
		CreatNewController = new GameCreatNew();
		
		for(int i=0; i<4 ;i++){
			for(int j=0; j<4; j++){
				MatrixController.setMatrix(matrixGame, i, j, "");
			}
		}
		
		CreatNewController.CreateNew(matrixGame);
		CreatNewController.CreateNew(matrixGame);
	}
}
