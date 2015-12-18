package com.sco.lyra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Lang
 * @package com.sco.lyra
 * @name FileFormat
 * @class com.sco.lyra.FileFormat
 * @date Dec 21, 2014 2:21:45 PM
 * @see
 */
public class FileFormat {
	public static void main(String args[]) {
		final StringBuilder content = new StringBuilder();
		try (final BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File(
						"data/data.txt")), "UTF-8"))) {
			String line = reader.readLine();
			while (null != line) {
				if(line.trim().equals("")){
					content.append("\n");
					line = reader.readLine();
					continue;
				}
				// Ignore line comments;
				int space = getSpace(line);
				// content.append("\t" + line + "\n");
				content.append(getLine(line,space) + "\n");
				line = reader.readLine();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println(content);
	}

	private static String getLine(final String line, final int space) {
		System.out.println(space + ":" + line);
		StringBuilder retLine = new StringBuilder();
		switch (space) {
		case 0:
		case 1:
			retLine.append("\t").append(line.trim());
			break;
		case 2:
		case 6:
			retLine.append("\t\t").append(line.trim());
			break;
		case 4:
		case 5:
		case 8:
			retLine.append("\t\t\t").append(line.trim());
			break;
		case 10:
			retLine.append("\t\t\t\t").append(line.trim());
			break;
		case 12:
			retLine.append("\t\t\t\t\t").append(line.trim());
			break;
		case 14:
			retLine.append("\t\t\t\t\t\t").append(line.trim());
			break;
		case 16:
			retLine.append("\t\t\t\t\t\t\t").append(line.trim());
			break;
		case 18:
			retLine.append("\t\t\t\t\t\t\t\t").append(line.trim());
			break;
		}
		return retLine.toString();
	}

	private static int getSpace(final String line) {
		int i = 0;
		char space = '$';
		do {
			space = line.charAt(i);
			i++;
		} while (space == ' ');
		return (i - 1);
	}
}
