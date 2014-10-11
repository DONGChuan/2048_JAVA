package org.game.model;

/**
 *Title: Score
 *Description: This class is a bean to save and load the best score of game
 *Copyright: Copyright(c)2014
 *@author DONG Chuan
 *@version 1.0
 */
public class BestScore {
	
	private int score;
	
	public BestScore(){}
	
	public BestScore(int score){
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
