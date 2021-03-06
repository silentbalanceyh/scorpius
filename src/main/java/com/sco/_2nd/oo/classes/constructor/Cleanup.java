package com.sco._2nd.oo.classes.constructor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class InputFile{
	private BufferedReader inBufferedReader;
	
	public InputFile(String filename) throws Exception{
		try{
			inBufferedReader = new BufferedReader(new FileReader(filename));
		}catch(FileNotFoundException ex){
			System.err.println("Could not open " + filename);
			throw ex;
		}catch(Exception ex){
			try{
				inBufferedReader.close();
			}catch(IOException e){
				System.err.println("in.close() unsuccessful");
			}
			throw ex;
		}finally{
			
		}
	}
	
	public String getLine(){
		String s;
		try{
			s = inBufferedReader.readLine();
		}catch(IOException ex){
			throw new RuntimeException("readLine() failed");
		}
		return s;
	}
	
	public void dispose(){
		try{
			inBufferedReader.close();
			System.out.println("dispose() successful");
		}catch(IOException ex){
			throw new RuntimeException("in.close() failed");
		}
	}
}

public class Cleanup {
	public static void main(String [] args){
		try{
			InputFile inputFile = new InputFile("C:/Script/PHP/php.gif");
			@SuppressWarnings("unused")
			String s;
			@SuppressWarnings("unused")
			int i = 1;
			while((s = inputFile.getLine())!= null){
				;
			}
			inputFile.dispose();
		}catch(Exception ex){
			System.err.println("Caught Exception in main");
			ex.printStackTrace();
		}
	}
}
