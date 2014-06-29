package org.game.view;

import javax.swing.JLabel;

public class GameKeyEvent {
	
	private MatrixTextColor MatrixController;
	private GameCreatNew CreatNewController;
	private int edgeLimit;
	private String str;
	private String strNeighboour;
	
	public GameKeyEvent(){
		CreatNewController = new GameCreatNew();
		MatrixController = new MatrixTextColor();
	}
	
	public void do_Left(JLabel[][] matrixGame){
							
		int num;
		for(int i = 0; i < 4; i++){	
			edgeLimit = 5;
			for(int k = 0; k < 3; k++){
				for(int j = 1; j < 4; j++){					
					str = matrixGame[i][j].getText();			
					strNeighboour = matrixGame[i][j-1].getText();			
					
					if(strNeighboour.compareTo("") == 0){
						MatrixController.setMatrix(matrixGame, i, j-1, str);
						MatrixController.setMatrix(matrixGame, i, j, "");
					}else if((str.compareTo(strNeighboour) == 0) && (j !=edgeLimit) && (j != edgeLimit-1)){			
						num  = Integer.parseInt(str);
						str = String.valueOf(2 * num);
						MatrixController.setMatrix(matrixGame, i, j-1, str);
						MatrixController.setMatrix(matrixGame, i, j, "");
						edgeLimit = j;
					}
				}	
			}
		}
		CreatNewController.CreateNew(matrixGame);
	}
		
	public void do_Right(JLabel[][] matrixGame){	
							
		int num;
		for(int i = 0; i < 4; i ++){
			edgeLimit = 5;
			for(int k = 0; k < 3; k++){
				for(int j = 2; j >= 0; j--){
					str = matrixGame[i][j].getText();
					strNeighboour = matrixGame[i][j + 1].getText();
					
					if(strNeighboour.compareTo("") == 0){
						MatrixController.setMatrix(matrixGame, i, j+1, str);
						MatrixController.setMatrix(matrixGame, i, j, "");
					}
					else if(str.compareTo(strNeighboour) == 0 && j !=edgeLimit && j != edgeLimit+ 1){
						num  = Integer.parseInt(str);
						str = String.valueOf(2 * num);
						MatrixController.setMatrix(matrixGame, i, j+1, str);
						MatrixController.setMatrix(matrixGame, i, j, "");
						edgeLimit = j;
					}
				}
			}
		}
		CreatNewController.CreateNew(matrixGame);
	}
		
	public void do_Up(JLabel[][] matrixGame){	
						
		int num;
		for(int j = 0; j < 4; j++){
			edgeLimit = 5;
			for(int k = 0; k < 3; k++){
				for(int i = 1; i < 4; i++){
					str = matrixGame[i][j].getText();
					strNeighboour = matrixGame[i - 1][j].getText();
				
					if(strNeighboour.compareTo("") == 0){
						MatrixController.setMatrix(matrixGame, i-1, j, str);
						MatrixController.setMatrix(matrixGame, i, j, "");
					}
					else if(str.compareTo(strNeighboour) == 0 && i != edgeLimit && i != edgeLimit -1){
						num  = Integer.parseInt(str);
						str = String.valueOf(2 * num);
						MatrixController.setMatrix(matrixGame, i-1, j, str);
						MatrixController.setMatrix(matrixGame, i, j, "");
						edgeLimit = i;
					}
				}
			}
		}
		CreatNewController.CreateNew(matrixGame);
	}
		
	public void do_Down(JLabel[][] matrixGame){	
							
		int num;
		
		for(int j = 0; j < 4; j ++){
			edgeLimit = 5;
			for(int k = 0; k < 5; k++){
				for(int i = 2; i >= 0; i--){
					str = matrixGame[i][j].getText();
					strNeighboour = matrixGame[i + 1][j].getText();
					
					if(strNeighboour.compareTo("") == 0){
						MatrixController.setMatrix(matrixGame, i+1, j, str);
						MatrixController.setMatrix(matrixGame, i, j, "");
					}
					else if(str.compareTo(strNeighboour) == 0 && i != edgeLimit && i != edgeLimit + 1){
						num  = Integer.parseInt(str);
						str = String.valueOf(2 * num);
						MatrixController.setMatrix(matrixGame, i+1, j, str);
						MatrixController.setMatrix(matrixGame, i, j, "");
						edgeLimit = i;
					}
				}
			}
		}
		CreatNewController.CreateNew(matrixGame);
	}
}
	

