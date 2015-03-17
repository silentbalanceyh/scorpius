package com.sco.design.dip.newest;
/**
 * 
 * @author Lang
 * @package com.sco.design.dip.newest
 * @name Driver
 * @class com.sco.design.dip.newest.Driver
 * @date Nov 30, 2014 7:48:38 PM
 * @see
 */
public class Driver implements IDriver{
	// 司机的主要职责是驾驶汽车
	public void drive(ICar car){
		car.run();
	}
}
