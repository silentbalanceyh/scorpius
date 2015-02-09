package com.sco.design.mediator;

public class N1Client {
	public static void main(String args[]){
		N1DepUserMediatorImpl mediator = N1DepUserMediatorImpl.getInstance();
		
		N1Dep dep = new N1Dep();
		dep.setDepId("d1");
		N1Dep dep2 = new N1Dep();
		dep2.setDepId("d2");
		
		N1User user = new N1User();
		user.setUserId("u1");
		
		System.out.println("撤销部门前----------------------------");
		mediator.showUserDeps(user);
		
		dep.deleteDep();
		
		System.out.println("部门撤销后————————————————————————————");
		mediator.showUserDeps(user);
		
		System.out.println("-------------------------------------");
		System.out.println("人员离职前----------------------------");
		mediator.showDepUsers(dep2);
		user.dimission();
		
		System.out.println("人员离职后----------------------------");
		mediator.showDepUsers(dep2);
	}
}
