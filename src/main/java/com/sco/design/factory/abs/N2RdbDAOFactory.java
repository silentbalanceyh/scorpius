package com.sco.design.factory.abs;

public class N2RdbDAOFactory extends N2DAOFactory{

	@Override
	public N2OrderDetailDAO createOrderDetailDAO() {
		return new N2RdbDetailDAOImpl();
	}

	@Override
	public N2OrderMainDAO createOrderMainDAO() {
		return new N2RdbMainDAOImpl();
	}

}
