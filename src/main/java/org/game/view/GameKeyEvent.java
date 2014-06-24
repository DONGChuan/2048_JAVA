package org.game.view;

import java.awt.event.KeyEvent;

import javax.swing.JLabel;

public class GameKeyEvent {
	
	private JLabel[][] matrixGame;
	private GameSetColor ColorController;
	private GameCreatNew CreatNewController;
	
	public GameKeyEvent(){}
	
	public GameKeyEvent(JLabel[][] matrixGame){
		this.matrixGame = matrixGame;
	}
	
	protected void do_Left(final KeyEvent e){
		int code = e.getKeyCode();	//Returns the integer keyCode associated with the key in this event
		int a ;						
		String str ;								
		String str1;
		int num;
		switch(code){
		case KeyEvent.VK_LEFT:
		case KeyEvent.VK_A:		    //Left
			for(int i = 0; i < 4; i++){	
				a = 5;
				for(int k = 0; k < 3; k++){
					for(int j = 1; j < 4; j++){					
						str = matrixGame[i][j].getText();			
						str1 = matrixGame[i][j-1].getText();			
						
						if(str1.compareTo("") == 0){			
							matrixGame[i][j-1].setText(str);			
							ColorController.setColor(matrixGame, i, j-1,str);
							matrixGame[i][j].setText("");				
							ColorController.setColor(matrixGame, i, j, "");
						}else if((str.compareTo(str1) == 0) && (j !=a) && (j != a-1)){			
							num  = Integer.parseInt(str);
							//scores += num;
							//times ++;
							str = String.valueOf(2 * num);
							matrixGame[i][j-1].setText(str);		//左1方块文本字符变为两方块之和
							ColorController.setColor(matrixGame, i, j-1, str);
							matrixGame[i][j].setText("");				//当前方块字符置空
							ColorController.setColor(matrixGame, i, j, "");
							a = j;
						}
					}	
				}
			}
			//l1 = 1;				//用于判断游戏是否失败
			CreatNewController.CreateNew(matrixGame);
			break;
		case KeyEvent.VK_RIGHT:
		case KeyEvent.VK_D:
			for(int i = 0; i < 4; i ++){
				a = 5;
				for(int k = 0; k < 3; k++){
					for(int j = 2; j >= 0; j--){
						str = matrixGame[i][j].getText();
						str1 = matrixGame[i][j + 1].getText();
						
						if(str1.compareTo("") == 0){
							matrixGame[i][j + 1].setText(str);
							ColorController.setColor(matrixGame, i, j+1, str);
							matrixGame[i][j].setText("");
							ColorController.setColor(matrixGame, i, j, "");
						}
						else if(str.compareTo(str1) == 0 && j !=a && j != a+ 1){
							num  = Integer.parseInt(str);
							//scores += num ;
							//times ++;
							str = String.valueOf(2 * num);
							matrixGame[i][j + 1].setText(str);
							ColorController.setColor(matrixGame, i, j+1, str);
							matrixGame[i][j].setText("");
							ColorController.setColor(matrixGame, i, j, "");
							a = j;
						}
					}
				}
			}
			//l2 = 1;
			CreatNewController.CreateNew(matrixGame);
			break;
		case KeyEvent.VK_UP:
		case KeyEvent.VK_W:
			for(int j = 0; j < 4; j++){
				a = 5;
				for(int k = 0; k < 3; k++){
					for(int i = 1; i < 4; i++){
						str = matrixGame[i][j].getText();
						str1 = matrixGame[i - 1][j].getText();
					
						if(str1.compareTo("") == 0){
							matrixGame[i - 1][j].setText(str);
							ColorController.setColor(matrixGame, i-1, j, str);
							matrixGame[i][j].setText("");
							ColorController.setColor(matrixGame, i, j, "");
						}
						else if(str.compareTo(str1) == 0 && i != a && i != a -1){
							num  = Integer.parseInt(str);
							//scores += num ;
							//times ++;
							str = String.valueOf(2 * num);
							matrixGame[i - 1][j].setText(str);
							ColorController.setColor(matrixGame, i-1, j, str);
							matrixGame[i][j].setText("");
							ColorController.setColor(matrixGame, i, j, "");
							a = i;
						}
					}
				}
			}
			//l3 =1;
			CreatNewController.CreateNew(matrixGame);
			break;
		case KeyEvent.VK_DOWN:
		case KeyEvent.VK_S:
			for(int j = 0; j < 4; j ++){
				a = 5;
				for(int k = 0; k < 5; k++){
					for(int i = 2; i >= 0; i--){
						str = matrixGame[i][j].getText();
						str1 = matrixGame[i + 1][j].getText();
						
						if(str1.compareTo("") == 0){
							matrixGame[i + 1][j].setText(str);
							ColorController.setColor(matrixGame, i+1, j, str);
							matrixGame[i][j].setText("");
							ColorController.setColor(matrixGame, i, j, "");
						}
						else if(str.compareTo(str1) == 0 && i != a && i != a + 1){
							num  = Integer.parseInt(str);
							//scores += num ;
							//times ++;
							str = String.valueOf(2 * num);
							matrixGame[i + 1][j].setText(str );
							ColorController.setColor(matrixGame, i+1, j, str);
							matrixGame[i][j].setText("");
							ColorController.setColor(matrixGame, i, j, "");
							a = i;
						}
					}
				}
			}
			//l4 = 1;
			CreatNewController.CreateNew(matrixGame);
			break;
			default:
				break;
		}
		//textScores.setText(String.valueOf(scores));
	}
	
}
