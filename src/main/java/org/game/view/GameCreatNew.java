package org.game.view;

import java.util.Random;

import javax.swing.JLabel;

public class GameCreatNew {
	
	private MatrixTextColor MatrixController;							
	Random random = new Random();
	
	public void CreateNew(JLabel[][] matrixGame){
		MatrixController = new MatrixTextColor();
		
		int i ,j;
		boolean flag = false;
		String str;
		
		while(!flag){
			i = random.nextInt(4);// Random 0 ~ 3
			j = random.nextInt(4);
			str = matrixGame[i][j].getText();
			
			if((str.compareTo("") == 0)){
				MatrixController.setMatrix(matrixGame, i, j, "2");

				flag = true;	
			}
		}
	}
}
