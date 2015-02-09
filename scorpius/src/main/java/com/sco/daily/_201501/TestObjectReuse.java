package com.sco.daily._201501;

public class TestObjectReuse {
	public static void main(String args[]){
	}
}

class UserInformation{
	private String strUserName;
	private String strPasswork;
	private String strEmail;
	private int intSalary;
	
	public void setUserName(String strUserName){
		this.strUserName = strUserName;
	}
	
	public void setPassword(String strPas){
		this.strPasswork = strPas;
	}
	public void setEmail(String strEmail){
		this.strEmail = strEmail;
	}
	public void setSalary(int intSalary){
		this.intSalary = intSalary;
	}
	
	public String getUserName(String strUserName){
		return this.strUserName;
	}
	
	public String getPasswork(String strPassword){
		return this.strPasswork;
	}
	
	public String getEmail(String strEmail){
		return this.strEmail;
	}
	
	public int getSalary(int intSalary){
		return this.intSalary;
	//	return dbprocess(this);			//dbprocess 是神马
	}
}

/*
 * 低效代码：每次迭代的时候都会创建一次UserInformation
 */
class UserServiceOne{
	public int computePayroll(String[] userName, String[] Password){
		int intSize = userName.length;
		int intPayroll = 0;
		
		for(int i = 0; i < intSize; i++){
			UserInformation objUser = new UserInformation();
			objUser.setUserName(userName[i]);
			objUser.setPassword(Password[i]);
		//	objUser.setEmail(strEmail);
			intPayroll += objUser.getSalary(i);
			
		}
		return intPayroll;
	}
}

/*
 * 高效代码
 */
class UserServiceTwo{
	public int computePayroll(String[] UserName, String[] Password){
		int intSize = UserName.length;
		int intPayroll = 0;
		
		UserInformation objUser = new UserInformation();
		for(int i = 0; i < intSize; i++){
			objUser.setUserName(UserName[i]);
			objUser.setPassword(Password[i]);
			intPayroll += objUser.getSalary(i);
		}
		
		return intPayroll;
	} 
}



