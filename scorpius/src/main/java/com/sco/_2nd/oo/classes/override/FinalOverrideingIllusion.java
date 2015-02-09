package com.sco._2nd.oo.classes.override;

class WithFinals{
	@SuppressWarnings("unused")
	private final void f(){
		System.out.println("WithFinals.f()");
	}
	
	@SuppressWarnings("unused")
	private void g(){
		System.out.println("WithFinals.g()");
	}
}

class OverridingPrivate extends WithFinals{
	@SuppressWarnings("unused")
	private final void f(){
		System.out.println("OverridingPrivate.f()");
	}
	
	@SuppressWarnings("unused")
	private void g(){
		System.out.println("OverridingPrivate.g()");
	}
}

class OverridingPrivate1 extends WithFinals{
	public final void f(){
		System.out.println("OverridingPrivate1.f()");
	}
	
	public void g(){
		System.out.println("OverridingPrivate1.g()");
	}
}

public class FinalOverrideingIllusion {
	public static void main(String[] args){
		OverridingPrivate1 op2 = new OverridingPrivate1();
		op2.f();
		op2.g();
		
		//OverridingPrivate op = op2;
		@SuppressWarnings("unused")
		WithFinals wf = op2;
	}
}
