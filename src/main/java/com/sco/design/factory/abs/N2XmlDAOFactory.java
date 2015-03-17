package com.sco.design.factory.abs;

public class N2XmlDAOFactory extends N2DAOFactory{

	@Override
	public N2OrderDetailDAO createOrderDetailDAO() {
		return new N2XmlDetailDAOImpl();
	}

	@Override
	public N2OrderMainDAO createOrderMainDAO() {
		return new N2XmlMainDAOImpl();
	}

}
