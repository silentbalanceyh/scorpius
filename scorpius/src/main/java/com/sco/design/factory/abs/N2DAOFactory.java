package com.sco.design.factory.abs;

public abstract class N2DAOFactory {
	public abstract N2OrderMainDAO createOrderMainDAO();
	
	public abstract N2OrderDetailDAO createOrderDetailDAO();
}
