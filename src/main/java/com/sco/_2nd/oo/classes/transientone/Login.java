package com.sco._2nd.oo.classes.transientone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Login implements Serializable{
	private Date date = new Date();
	
	private String username;
	
	private transient String password;
	
	public Login(String name,String pwd){
		this.username = name;
		this.password = pwd;
	}
	
	public String toString(){
		String pwd = (password == null)?"(n/a)": password;
		return "login info:\n username:" + username + "\n date:" + date + "\n password:" + pwd;
	}
	
	@SuppressWarnings("resource")
	public static void main(String args[]) throws Exception{
		Login a = new Login("Hulk","myLittlePony");
		System.out.println("logon a = " + a);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Logon.out"));
		objectOutputStream.writeObject(a);
		objectOutputStream.close();
		
		Thread.sleep(3000);
		
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Logon.out"));
		System.out.println("Recovering object at " + new Date());
		a = (Login) inputStream.readObject();
		System.out.println("logon a = " + a);
	}
}
