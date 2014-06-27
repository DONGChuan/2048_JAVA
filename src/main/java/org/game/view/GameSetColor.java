package org.game.view;

import java.awt.Color;

import javax.swing.JLabel;

public class GameSetColor {
	
	public GameSetColor(){}
	
	public Color getColor(String str){
		switch(str){
		case "2":
			return Color.yellow;
		case "4":
			return Color.red;
		case "8":
			return Color.pink;
		case "16":
			return Color.orange;
		case "32":
			return Color.magenta;
		case "64":
			return Color.LIGHT_GRAY;
		case "128":
			return Color.green;
		case "256":
			return Color.GRAY;
		case "512":
			return Color.DARK_GRAY;
		case "1024":
			return Color.cyan;
		case "2048":
			return Color.blue;
		case "":
		case "4096":
			return Color.white;
		default:
			break;
		}
		return null;
	}
}
