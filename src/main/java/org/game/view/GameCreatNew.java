package org.game.view;

import java.util.Random;

import javax.swing.JLabel;

public class GameCreatNew {
	
	private GameSetColor ColorController;
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
					ColorController.setColor(matrixGame, i, j, "2");
				
					times --;
					flag = true;	
				}
			}
		}
	}
}
