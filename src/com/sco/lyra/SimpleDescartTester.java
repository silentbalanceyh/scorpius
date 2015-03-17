package com.sco.lyra;

import java.util.ArrayList;
import java.util.List;

public class SimpleDescartTester {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList l1 = new ArrayList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		ArrayList l2 = new ArrayList();
		l2.add("a");
		l2.add("b");

		ArrayList l3 = new ArrayList();
		l3.add("+");
		l3.add("-");

		ArrayList ls = new ArrayList();
		ls.add(l1);
		ls.add(l2);
		ls.add(l3);
		List list = Dikaerji0(ls);
		System.out.println(list.size());
		for (Object object : list) {
			System.out.println(object);
		}

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList Dikaerji0(ArrayList al0) {

		ArrayList a0 = (ArrayList) al0.get(0);// l1
		ArrayList result = new ArrayList();// 组合的结果
		for (int i = 1; i < al0.size(); i++) {
			ArrayList a1 = (ArrayList) al0.get(i);
			ArrayList temp = new ArrayList();
			// 每次先计算两个集合的笛卡尔积，然后用其结果再与下一个计算
			for (int j = 0; j < a0.size(); j++) {
				for (int k = 0; k < a1.size(); k++) {
					ArrayList cut = new ArrayList();

					if (a0.get(j) instanceof ArrayList) {
						cut.addAll((ArrayList) a0.get(j));
					} else {
						cut.add(a0.get(j));
					}
					if (a1.get(k) instanceof ArrayList) {
						cut.addAll((ArrayList) a1.get(k));
					} else {
						cut.add(a1.get(k));
					}
					temp.add(cut);
				}
			}
			a0 = temp;
			if (i == al0.size() - 1) {
				result = temp;
			}
		}
		return result;
	}

}
