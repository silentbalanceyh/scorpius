package com.sco.daily._201501;


public class TestInnerInterface {
	public static void main(String args[]){
		User objUser = new User(){
			public String UserInfo(){
				System.out.println("Interface Information");
				return "My God";
			}
		};
		objUser.UserInfo();
		System.out.println(objUser.UserInfo());
		
		TestInnerInterface objUser1 = new TestInnerInterface();
		TestInnerInterface.UserInformation objUser2 = objUser1.new UserInformation();
		System.out.println(objUser2.UserInfo());
	}
	
	interface User{
		String UserInfo();
	}
	class UserInformation implements User{
		String strUserName = "StringName";
		public String UserInfo(){
			System.out.println("Just a test");
			return strUserName;
			
		}
	}

}
