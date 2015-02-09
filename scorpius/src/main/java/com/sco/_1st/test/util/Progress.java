package com.sco._1st.test.util;

/**
 * 
 * @author Lang
 * @package com.sco._1st.test.util
 * @name Progress
 * @class com.sco._1st.test.util.Progress
 * @date Dec 2, 2014 8:04:49 PM
 * @see
 */
public class Progress {
	private Progress() {
	}

	/** 
	 * 
	 * **/
	public static <T extends Object> T NOT_START() {
		return null;
	}

	/**
	 * 
	 * @param obj
	 * @return
	 */
	public static <T extends Object> boolean STARTED(final T obj) {
		return (obj == NOT_START()) ? false : true;
	}
}
