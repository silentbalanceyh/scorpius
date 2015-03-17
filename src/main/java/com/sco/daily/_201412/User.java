package com.sco.daily._201412;
import static java.lang.System.out;

public class User {
	
	public boolean speakEnglish(final int language){
		boolean ret = false;
		if(language == 1){
			out.println("Hello English");
			ret = true;
		}else{
			ret = false;
			out.println("Hello Others");
		}
		return ret;
	}
}
