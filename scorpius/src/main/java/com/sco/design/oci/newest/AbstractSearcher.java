package com.sco.design.oci.newest;
/**
 * 
 * @author Lang
 * @package com.sco.design.oci.old
 * @name AbstractSearcher
 * @class com.sco.design.oci.old.AbstractSearcher
 * @date Dec 1, 2014 7:30:46 AM
 * @see
 */
public abstract class AbstractSearcher {
	protected IGoodBodyGirl pettyGirl;
	
	public AbstractSearcher(IGoodBodyGirl _pettyGirl){
		this.pettyGirl = _pettyGirl;
	}
	// 搜索美女
	public abstract void show();
}
