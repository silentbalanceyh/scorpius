package com.sco.design.oci.old;
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
	protected IPettyGirl pettyGirl;
	
	public AbstractSearcher(IPettyGirl _pettyGirl){
		this.pettyGirl = _pettyGirl;
	}
	// 搜索美女
	public abstract void show();
}
