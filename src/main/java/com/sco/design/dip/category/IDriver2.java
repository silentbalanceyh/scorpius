package com.sco.design.dip.category;

import com.sco.design.dip.newest.ICar;

/**
 * 
 * @author Lang
 * @package com.sco.design.dip.category
 * @name IDriver2
 * @class com.sco.design.dip.category.IDriver2
 * @date Nov 30, 2014 8:07:18 PM
 * @see
 */
public interface IDriver2{
	// 车辆型号
	public void setCar(ICar car);
	// 是司机就应该会开车
	public void drive();
}
