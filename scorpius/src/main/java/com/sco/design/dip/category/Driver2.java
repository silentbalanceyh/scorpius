package com.sco.design.dip.category;

import com.sco.design.dip.newest.ICar;

/**
 * 
 * @author Lang
 * @package com.sco.design.dip.category
 * @name Driver2
 * @class com.sco.design.dip.category.Driver2
 * @date Nov 30, 2014 8:08:44 PM
 * @see
 */
public class Driver2 implements IDriver2{
	
	private ICar car;

	@Override
	public void setCar(ICar car) {
		this.car = car;
	}

	@Override
	public void drive() {
		this.car.run();
	}
	
}
