package com.sco._1st;

/**
 * 
 * @author Lang
 * @package com.sco._1st
 * @name Hello
 * @class com.sco._1st.Hello
 * @date Nov 19, 2014 7:15:06 AM
 * @see
 */
class Hello {

}

/**
 * 主函数位于HelloJava中，该源文件中包含了main主函数入口，因为定义了public的class：HelloJava，
 * 所以源文件名称为HelloJava
 * .java，虽然这个源文件中包含了Hello的class，因为该类不带public修饰符，所以不能使用Hello.java。
 * *：如果出现了任何一个public的class，则源文件名称必须和public的类名一致
 * @author Lang
 * @package com.sco._1st
 * @name HelloJava
 * @class com.sco._1st.HelloJava
 * @date Nov 19, 2014 7:15:10 AM
 * @see
 */
public class HelloJava {
	public static void main(String args[]) {
		System.out.println("Hello Java 1.");
	}
}
