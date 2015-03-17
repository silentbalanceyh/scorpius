package com.sco.design.factory.abs;

public class N2BusinessObject {
	public static void main(String args[]){
		N2DAOFactory df = new N2RdbDAOFactory();
		N2OrderMainDAO mainDAO = df.createOrderMainDAO();
		N2OrderDetailDAO detailDAO = df.createOrderDetailDAO();
		
		mainDAO.saveOrderMain();
		detailDAO.saveOrderDetail();
	}
}
