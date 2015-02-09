package com.sco.design.builder;

public class N1InsuranceContract {
	private String contractId;
	
	@SuppressWarnings("unused")
	private String personName;
	
	@SuppressWarnings("unused")
	private String companyName;
	
	@SuppressWarnings("unused")
	private long beginDate;
	
	@SuppressWarnings("unused")
	private long endDate;
	
	@SuppressWarnings("unused")
	private String otherDate;
	
	public N1InsuranceContract(N1ConcreteBuilder builder){
		this.contractId = builder.getContractId();
		this.personName = builder.getPersonName();
		this.companyName = builder.getCompanyName();
		this.beginDate = builder.getBeginDate();
		this.endDate = builder.getEndDate();
		this.otherDate = builder.getOtherDate();
	}
	
	public void someOperation(){
		System.out.println("Now in Insurance Contract someOperation==" + this.contractId);
	}
}
