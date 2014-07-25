package org.game.test;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.game.model.BestScore;
import org.game.view.CountScore;
import org.junit.Test;
import org.xml.sax.SAXException;

public class TestCountScore {

	@Test
	public void testGetScoreXML() throws ParserConfigurationException, SAXException, IOException, TransformerException {
		
		BestScore tmp = new BestScore();
		tmp.setScore(100);
		
		CountScore a = new CountScore();
		a.setScoreXML(tmp);
		
		a.setScore(a.getScoreXML());

		assertEquals(100, a.getScore().getScore());
	}
	
	@Test
	public void testSetScoreXML() throws ParserConfigurationException, SAXException, IOException, TransformerException {
		
		BestScore tmp = new BestScore();
		tmp.setScore(2000);
		
		CountScore a = new CountScore();
		a.setScoreXML(tmp);
		
		System.out.println(a.getScoreXML().getScore());
		assertEquals(2000, a.getScoreXML().getScore());
	}

}
