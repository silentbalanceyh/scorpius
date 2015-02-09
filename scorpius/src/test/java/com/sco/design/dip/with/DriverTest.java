package com.sco.design.dip.with;

import junit.framework.TestCase;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;

import com.sco.design.dip.newest.Driver;
import com.sco.design.dip.newest.ICar;
import com.sco.design.dip.newest.IDriver;

/**
 * 
 * @author Lang
 * @package com.sco.design.dip.newest
 * @name DriverTest
 * @class com.sco.design.dip.newest.DriverTest
 * @date Nov 30, 2014 7:54:04 PM
 * @see
 */
public class DriverTest extends TestCase{
	Mockery context = new JUnit4Mockery();
	@Test
	public void testDriver(){
		// 根据接口虚拟一个对象
		final ICar car = context.mock(ICar.class);
		IDriver driver = new Driver();
		// 内部类
		context.checking(new Expectations(){
			{
				oneOf (car).run();
			}
		});
		driver.drive(car);
	}
}
