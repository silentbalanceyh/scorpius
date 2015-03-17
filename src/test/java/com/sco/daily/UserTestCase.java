package com.sco.daily;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.sco.daily._20141124to1130.User;

public class UserTestCase {
	@Test
	public void testSpeakEnglish(){
		User user = new User();
		boolean isEnglish = user.speakEnglish(1);
		assertTrue("User must speak english.",isEnglish);
	}
	@Test
	public void testSpeakOther(){
		User user = new User();
		boolean isOther = user.speakEnglish(2);
		assertFalse("User mustn't speak english.",isOther);
	}
}
