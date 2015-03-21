package com.sco._2nd.oo;

class User{
	private String name;
	private String email;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}

public class ComparedUse {
	public static void main(String args[]){
		// JVM equals
		String str1 = new String("Str");
		String str2 = new String("Str");
		System.out.println("JVM equals : " + str1.equals(str2));
		System.out.println("JVM == : " + (str1 == str2));
		System.out.println();
		// JVM ==
		String str3 = new String("Str");
		String str4 = str3;
		System.out.println("JVM equals : " + (str3.equals(str4)));
		System.out.println("JVM == :" + (str3 == str4));
		System.out.println();
		
		// Defined equals
		User user1 = new User();
		User user2 = new User();
		System.out.println("Defined equals : " + user1.equals(user2));
		System.out.println("Defined == : " + (user1 == user2));
		System.out.println();
		// Defined ==
		User user3 = new User();
		User user4 = user3;
		System.out.println("Defined equals : " + user3.equals(user4));
		System.out.println("Defined == : " + (user3 == user4));
		System.out.println();
	}
}
