package com.sco.design.oci.old;
/**
 * 
 * @author Lang
 * @package com.sco.design.oci.old
 * @name PettyGirl
 * @class com.sco.design.oci.old.PettyGirl
 * @date Dec 1, 2014 7:28:39 AM
 * @see
 */
public class PettyGirl implements IPettyGirl{

	private String name;
	
	public PettyGirl(String name){
		this.name = name;
	}
	
	@Override
	public void goodLooking() {
		System.out.println(this.name + "--脸蛋很漂亮");
	}

	@Override
	public void nichFigure() {
		System.out.println(this.name + "--气质非常好");
	}

	@Override
	public void greatTemperament() {
		System.out.println(this.name + "--身材非常棒");
	}
}
