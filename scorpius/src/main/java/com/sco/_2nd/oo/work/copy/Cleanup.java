package com.sco._2nd.oo.work.copy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Cleanup {
	public static void main(String args[]){
		try{
			InputFile inputFile = new InputFile("C:/Users/Public/Pictures/Sample Pictures/Chrysanthemum.jpg");
			@SuppressWarnings("unused")
			String s;
			@SuppressWarnings("unused")
			int i = 1;
			while((s = inputFile.getLine()) != null){
				;
			}
			inputFile.dispose();
		}catch(Exception ex){
			System.err.println("Caugh Exception in main");
			ex.printStackTrace();
		}
	}
}

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