package com.sco.design.lsp.p2;

import com.sco.design.lsp.p1.Rifle;

/**
 * 
 * @author Lang
 * @package com.sco.design.lsp.p2
 * @name AUG
 * @class com.sco.design.lsp.p2.AUG
 * @date Nov 29, 2014 11:42:18 AM
 * @see
 */
public class AUG extends Rifle{
	// �ѻ�ǹ��Я��һ����׼����Զ��
	public void zoomOut(){
		System.out.println("ͨ����Զ�������ˡ���");
	}
	
	public void shoot(){
		System.out.println("AUG�������");
	}
}
