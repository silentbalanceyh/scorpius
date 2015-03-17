package com.sco.design.oci.old;
/**
 * 
 * @author Lang
 * @package com.sco.design.oci.old
 * @name Client
 * @class com.sco.design.oci.old.Client
 * @date Dec 1, 2014 7:33:23 AM
 * @see
 */
public class Client {
	public static void main(String args[]){
		IPettyGirl yanYan = new PettyGirl("嫣嫣");
		AbstractSearcher searcher = new Searcher(yanYan);
		searcher.show();
	}
}
