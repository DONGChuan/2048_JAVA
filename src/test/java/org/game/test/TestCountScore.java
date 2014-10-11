package org.game.test;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.game.model.BestScore;
import org.game.view.GameScore;
import org.junit.Test;
import org.xml.sax.SAXException;

public class TestCountScore {

	@Test
	public void testGetScoreXML() throws ParserConfigurationException, SAXException, IOException, TransformerException {
		
		BestScore tmp = new BestScore();
		tmp.setScore(100);
		
		GameScore a = new GameScore();
		a.setScoreXML(tmp);
		
		a.setScore(a.getScoreXML());

		assertEquals(100, a.getScore().getScore());
	}
	
	@Test
	public void testSetScoreXML() throws ParserConfigurationException, SAXException, IOException, TransformerException {
		
		BestScore tmp = new BestScore();
		tmp.setScore(2000);
		
		GameScore a = new GameScore();
		a.setScoreXML(tmp);
		
		System.out.println(a.getScoreXML().getScore());
		assertEquals(2000, a.getScoreXML().getScore());
	}

}
