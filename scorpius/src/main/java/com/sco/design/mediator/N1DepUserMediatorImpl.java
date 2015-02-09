package com.sco.design.mediator;

import java.util.ArrayList;
import java.util.Collection;

public class N1DepUserMediatorImpl {
	private static N1DepUserMediatorImpl mediator = new N1DepUserMediatorImpl();
	private N1DepUserMediatorImpl(){
		initTestData();
	}

	public static N1DepUserMediatorImpl getInstance(){
		return mediator;
	}
	
	private Collection<N1DepUserModel> depUserCol = new ArrayList<N1DepUserModel>();
	
	private void initTestData(){
		N1DepUserModel du1 = new N1DepUserModel();
		du1.setDepUserId("du1");
		du1.setDepId("d1");
		du1.setUserId("u1");
		depUserCol.add(du1);
		
		N1DepUserModel du2 = new N1DepUserModel();
		du2.setDepUserId("du2");
		du2.setDepId("d2");
		du2.setUserId("u2");
		depUserCol.add(du2);
		
		N1DepUserModel du3 = new N1DepUserModel();
		du3.setDepUserId("du3");
		du3.setDepId("d3");
		du3.setUserId("u3");
		depUserCol.add(du3);
		
		N1DepUserModel du4 = new N1DepUserModel();
		du4.setDepUserId("du4");
		du4.setDepId("d4");
		du4.setUserId("u4");
		depUserCol.add(du4);
		
		N1DepUserModel du5 = new N1DepUserModel();
		du5.setDepUserId("du5");
		du5.setDepId("d5");
		du5.setUserId("u5");
		depUserCol.add(du5);
	}
	
	public boolean deleteDep(String depId){
		Collection<N1DepUserModel> tempCol = 
			new ArrayList<N1DepUserModel>();
		for(N1DepUserModel du: tempCol){
			if(du.getDepId().equals(depId)){
				tempCol.add(du);
			}
		}
		depUserCol.removeAll(tempCol);
		return true;
	}
	
	public boolean deleteUser(String userId){
		Collection<N1DepUserModel> tempCol =
			new ArrayList<N1DepUserModel>();
		for(N1DepUserModel du: depUserCol){
			if(du.getUserId().equals(userId)){
				tempCol.add(du);
			}
		}
		depUserCol.removeAll(tempCol);
		return true;
	}
	
	public void showDepUsers(N1Dep dep){
		for(N1DepUserModel du: depUserCol){
			if(du.getDepId().equals(dep.getDepId())){
				System.out.println("部门编号=" + dep.getDepId() + " 下边拥有人员，其编号是：" + du.getUserId());
			}
		}
	}
	
	public void showUserDeps(N1User user){
		for(N1DepUserModel du: depUserCol){
			if(du.getUserId().equals(user.getUserId())){
				System.out.println("人员编号=" + user.getUserId() + " 属于部门编号是：" + du.getDepId());
			}
		}
	}
	
	public boolean changeDep(String userId,String oldDepId,String newDepId){
		return false;
	}
	
	public boolean joinDep(Collection<String> colDepIds,N1Dep newDep){
		return false;
	}
}
