package com.sco._2nd.oo.classes.finalclass;

class Gizmo{
	public void spin(){
		
	}
}

public class FinalArguments {
	
	void with(final Gizmo g){
		
	}
	
	void without(Gizmo g){
		g = new Gizmo();
		g.spin();
	}
	
	int g(final int i){
		return i +1;
	}
	
	public static void main(String args[]){
		FinalArguments bFinalArguments = new FinalArguments();
		bFinalArguments.without(null);
		bFinalArguments.with(null);
	}

}
