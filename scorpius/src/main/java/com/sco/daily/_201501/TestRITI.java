package com.sco.daily._201501;

public class TestRITI {
	public static void main(String args[]){
		Useful[] objX = {new Useful(), new MoreUseful()};
		objX[0].UsefulOne();
		objX[0].UsefulTwo();
		objX[1].UsefulOne();
		objX[1].UsefulTwo();
		
		((MoreUseful) objX[1]).MoreUsefulOne();
		((MoreUseful) objX[1]).MoreUsefulTwo();
		//Useful 不能转换为 MoreUseful， 运行时错误. 转换后，Useful对象将受到影响。
	//	((MoreUseful) objX[0]).MoreUsefulOne();
	}

}

class Useful{
	public void UsefulOne(){
		System.out.println("Useful - UsefulOne");
	}
	
	public void UsefulTwo(){
		System.out.println("Useful - UsefulTwo");
	}
}

class MoreUseful extends Useful{
	public void UsefulOne(){
		System.out.println("MoreUseful - UsefulOne");
	}
	
	public void UsefulTwo(){
		System.out.println("MoreUseful - UsefulTwo");
	}
	
	public void MoreUsefulOne(){
		System.out.println("MoreUseful - MoreUsefulOne");
	}
	
	public void MoreUsefulTwo(){
		System.out.println("MoreUseful - MoreUsefulTwo");
	}
}





