package com.sco.design.builder;

public class N1ConcreteBuilder {
	private String contractId;
	private String personName;
	private String companyName;
	private long beginDate;
	private long endDate;
	private String otherDate;
	
	public N1ConcreteBuilder(String contractId,long beginDate,long endDate){
		this.contractId = contractId;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}
	
	public N1ConcreteBuilder setPersonName(String personName){
		this.personName = personName;
		return this;
	}
	
	public N1ConcreteBuilder setCompanyName(String companyName){
		this.companyName = companyName;
		return this;
	}
	
	public N1ConcreteBuilder setOtherData(String otherData){
		this.otherDate = otherData;
		return this;
	}
	
	public N1InsuranceContract build(){
		return new N1InsuranceContract(this);
	}

	public String getContractId() {
		return contractId;
	}

	public String getPersonName() {
		return personName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public long getBeginDate() {
		return beginDate;
	}

	public long getEndDate() {
		return endDate;
	}

	public String getOtherDate() {
		return otherDate;
	}
}
