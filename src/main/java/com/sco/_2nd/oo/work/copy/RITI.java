package com.sco._2nd.oo.work.copy;

public class RITI {
	public static void main(String args[]){
		Useful[] xObject = {new Useful(), new MoreUseful()};
		xObject[0].f();
		xObject[1].g();
		((MoreUseful)xObject[1]).u();
	//	((MoreUseful)xObject[0]).u();	//	运行时错误
	}
}

class Useful{
	public void f(){
		
	}
	
	public void g(){
		
	}
}

class MoreUseful extends Useful{
	public void f(){
		
	}
	public void g(){
		
	}
	
	public void u(){
		
	}
	
	public void v(){
		
	}
	
	public void w(){
		
	}
	
}

