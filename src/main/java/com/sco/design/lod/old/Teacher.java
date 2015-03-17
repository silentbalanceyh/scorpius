package com.sco.design.lod.old;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Lang
 * @package com.sco.design.lod.old
 * @name Teacher
 * @class com.sco.design.lod.old.Teacher
 * @date Dec 1, 2014 7:40:36 AM
 * @see
 */
public class Teacher {
	public void commond(GroupLeader groupLeader){
		List<Girl> listGirls = new ArrayList<>();
		// 初始化女生
		for(int i = 0; i < 20; i++){
			listGirls.add(new Girl());
		}
		// 告诉体育委员开始清查
		groupLeader.countGirls(listGirls);
	}
}
