package com.sco.java2s.jdk6.activation;

import javax.activation.CommandInfo;
import javax.activation.MailcapCommandMap;

/**
 * 
 * @author Lang
 * @package com.sco.java2s.jdk6.activation
 * @name MailcapComanndMapDemo1
 * @class com.sco.java2s.jdk6.activation.MailcapComanndMapDemo1
 * @date Nov 26, 2014 10:01:00 PM
 * @see
 */
public class MailcapComanndMapDemo1 {
	public static void main(String args[]) {
		MailcapCommandMap mailcapMap = new MailcapCommandMap();
		String[] mimeTypes = mailcapMap.getMimeTypes();
		for (String mimeType : mimeTypes) {
			System.out.println(mimeType);
			CommandInfo[] commandInfo = mailcapMap.getAllCommands(mimeType);
			for (CommandInfo info : commandInfo) {
				System.out.println(" " + info.getCommandName() + ": "
						+ info.getCommandClass());
			}
		}
	}
}
