package com.sco.daily._201501;
import static java.lang.System.out; 
public class TestSingleton {
	public static void main(String args[]){
		TestSingleton objSinglOne = TestSingleton.newSingleton();
		TestSingleton objSinglTwo = TestSingleton.newSingleton();
		
		if(objSinglOne == objSinglTwo){
			out.println("objSinglOne = objSinglTwo");
		}else{
			out.println("objSinglOne != objSinglTwo");
		}
	} 
	
	public static TestSingleton objSingleton;
	public static TestSingleton newSingleton(){
		if(objSingleton == null){
			objSingleton = new TestSingleton();
		}
		return objSingleton;
	}
}
