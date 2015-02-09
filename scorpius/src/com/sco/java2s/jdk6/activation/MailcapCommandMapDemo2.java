package com.sco.java2s.jdk6.activation;

import javax.activation.CommandInfo;
import javax.activation.MailcapCommandMap;

/**
 * 
 * @author Lang
 * @package com.sco.java2s.jdk6.activation
 * @name MailcapCommandMapDemo2
 * @class com.sco.java2s.jdk6.activation.MailcapCommandMapDemo2
 * @date Nov 26, 2014 10:03:43 PM
 * @see
 */
public class MailcapCommandMapDemo2 {
	public static void main(String args[]){
		MailcapCommandMap mailcapCommandMap = new MailcapCommandMap();
	    String mailcap = "text/plain;; " + "x-java-content-handler=beans.TextHandler;"
	        + "x-java-view=beans.TextViewer;" + "x-java-edit=beans.TextEditor";
	    mailcapCommandMap.addMailcap(mailcap);
	    // Get all MIME types
	    String[] mimeTypes = mailcapCommandMap.getMimeTypes();
	    for (String mimeType : mimeTypes) {
	      System.out.println(mimeType);
	      CommandInfo[] commandInfos = mailcapCommandMap.getAllCommands(mimeType);
	      for (CommandInfo info : commandInfos) {
	        System.out.println(" " + info.getCommandName() + " : "
	            + info.getCommandClass());
	      }
	    }
	}
}
