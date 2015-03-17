package com.sco.design.dip.category;

import com.sco.design.dip.newest.ICar;

/**
 * 
 * @author Lang
 * @package com.sco.design.dip.category
 * @name Driver
 * @class com.sco.design.dip.category.Driver
 * @date Nov 30, 2014 8:06:21 PM
 * @see
 */
public class Driver implements IDriver{
	// 构造注入
	private ICar car;
	
	public Driver(ICar car){
		this.car = car;
	}
	
	@Override
	public void drive() {
		this.car.run();
	}

}
