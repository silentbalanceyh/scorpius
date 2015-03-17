package com.sco.design.lod.old;
/**
 * 
 * @author Lang
 * @package com.sco.design.lod.old
 * @name Client
 * @class com.sco.design.lod.old.Client
 * @date Dec 1, 2014 7:40:48 AM
 * @see
 */
public class Client {
	public static void main(String args[]){
		Teacher teacher = new Teacher();
		teacher.commond(new GroupLeader());
	}
}
