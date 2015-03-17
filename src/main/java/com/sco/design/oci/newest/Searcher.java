package com.sco.design.oci.newest;
/**
 * 
 * @author Lang
 * @package com.sco.design.oci.old
 * @name Searcher
 * @class com.sco.design.oci.old.Searcher
 * @date Dec 1, 2014 7:31:54 AM
 * @see
 */
public class Searcher extends AbstractSearcher{

	public Searcher(IGoodBodyGirl _pettyGirl){
		super(_pettyGirl);
	}
	@Override
	public void show() {
		System.out.println("-----美女信息：-----");
		super.pettyGirl.goodLooking();
		super.pettyGirl.nichFigure();
	}

}
