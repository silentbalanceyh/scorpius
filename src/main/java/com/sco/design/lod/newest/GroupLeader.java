package com.sco.design.lod.newest;

import java.util.List;

/**
 * 
 * @author Lang
 * @package com.sco.design.lod.old
 * @name GroupLeader
 * @class com.sco.design.lod.old.GroupLeader
 * @date Dec 1, 2014 7:38:35 AM
 * @see
 */
public class GroupLeader {
	private List<Girl> listGirls;
	
	public GroupLeader(List<Girl> listGirls){
		this.listGirls = listGirls;
	}
	
	public void countGirls() {
		System.out.println("女生数量：" + this.listGirls.size());
	}
}
