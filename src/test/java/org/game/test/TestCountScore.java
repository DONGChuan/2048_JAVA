package org.game.test;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.game.model.BestScore;
import org.game.view.CountScore;
import org.junit.Test;
import org.xml.sax.SAXException;

public class TestCountScore {

	@Test
	public void testGetScoreXML() throws ParserConfigurationException, SAXException, IOException {
		
		// Before test, set score in Game.xml to 1000 
		CountScore a = new CountScore();
		a.setScore(a.getScoreXML());

		assertEquals(1000, a.getScore().getScore());
	}
	
	@Test
	public void testSetScoreXML() throws ParserConfigurationException, SAXException, IOException {
		
		CountScore a = new CountScore();
		BestScore tmp = new BestScore();
		tmp.setScore(2000);
		
		a.setScore(a.getScoreXML());

		assertEquals(2000, a.getScore().getScore());
	}

}
