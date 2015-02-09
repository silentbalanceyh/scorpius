package com.sco.lyra;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import com.sco.lyra.descart.A;
import com.sco.lyra.descart.A1;
import com.sco.lyra.descart.AA;
import com.sco.lyra.descart.B;
import com.sco.lyra.descart.B1;
import com.sco.lyra.descart.C;
import com.sco.lyra.descart.C1;
import com.sco.lyra.descart.CA2;
import com.sco.lyra.descart.D;
import com.sco.lyra.descart.E;
import com.sco.lyra.descart.E2;
import com.sco.lyra.descart.E3;

public class DescartTester {

	@SuppressWarnings("unused")
	public static void main(String args[]) throws Exception {
		String className = "com.sco.lyra.Descart";
		A1 a = new A();
		AA a1 = new A();
		B1 b = new B();
		C1 c = new C();
		CA2 c2 = new C();
		D d = new D();
		E3 e3 = new E();
		E2 e2 = new E();
		Descart cart1 = createInstance(className, a);
		Descart cart2 = createInstance(className, a1, b);
		Descart cart3 = createInstance(className, a, b, c2);
		Descart cart4 = createInstance(className, a, b, c, d);
		Descart cart5 = createInstance(className, e2, e3);
	}

	private static List<Class<?>> getTypes(final Class<?> inputT) {
		final List<Class<?>> retType = new ArrayList<>();
		if (null != inputT) {
			// Add current class;
			retType.add(inputT);
			// Add interfaces
			retType.addAll(getInterfaces(inputT));
			// Add Superclass
			retType.addAll(getSuperClasses(inputT));
		}
		return retType;
	}

	/**
	 * 
	 * @param inputT
	 * @return
	 */
	public static List<Class<?>> getInterfaces(final Class<?> inputT) {
		final List<Class<?>> retList = new ArrayList<>();
		if (null != inputT.getInterfaces() && 0 < inputT.getInterfaces().length) {
			for (final Class<?> interfaceClass : inputT.getInterfaces()) {
				retList.add(interfaceClass);
				retList.addAll(getInterfaces(interfaceClass));
			}
		}
		// Superclass interfaces
		if (null != inputT.getSuperclass()
				&& inputT.getSuperclass() != java.lang.Object.class) {
			retList.addAll(getInterfaces(inputT.getSuperclass()));
		}
		return retList;
	}

	/**
	 * 
	 * @param inputT
	 * @return
	 */
	public static List<Class<?>> getSuperClasses(final Class<?> inputT) {
		final List<Class<?>> retList = new ArrayList<>();
		if (null != inputT.getSuperclass()
				&& inputT.getSuperclass() != java.lang.Object.class) {
			retList.add(inputT.getSuperclass());
			retList.addAll(getSuperClasses(inputT.getSuperclass()));
		}
		return retList;
	}

	private static List<List<Class<?>>> genParamDim(final Object... params) {
		List<List<Class<?>>> dimValueList = new ArrayList<>();
		if (null != params) {
			for (final Object inputT : params) {
				dimValueList.add(getTypes(inputT.getClass()));
			}
		}
		return dimValueList;
	}

	private static void fillBySingle(final List<List<Class<?>>> retList,
			final List<Class<?>> preList, final List<Class<?>> nextLayer) {
		for (final Class<?> addedClass : nextLayer) {
			final List<Class<?>> tempList = new ArrayList<>();
			tempList.addAll(preList);
			tempList.add(addedClass);
			if (!retList.contains(tempList)) {
				retList.add(tempList);
			}
		}
	}

	private static List<List<Class<?>>> genParamTypes(
			List<List<Class<?>>> dimValue) {
		final List<List<Class<?>>> retList = new ArrayList<>();
		final List<Class<?>> layer0 = dimValue.get(0);
		final List<List<Class<?>>> layer0Wrapper = new ArrayList<>();
		for (final Class<?> element : layer0) {
			final List<Class<?>> elementList = new ArrayList<>();
			elementList.add(element);
			layer0Wrapper.add(elementList);
		}
		if (dimValue.size() == 1) {
			retList.addAll(layer0Wrapper);
		} else {
			// 获取L1
			final List<List<Class<?>>> tempList = new ArrayList<>();
			final List<List<Class<?>>> tempRetList = new ArrayList<>();
			for (int i = 1; i < dimValue.size(); i++) {
				// 遍历第一层的所有Element元素
				for (final List<Class<?>> layer0Class : layer0Wrapper) {
					if (i == 1) {
						// 如果i为1表示直接计算第一层和第二层的值
						fillBySingle(tempRetList, layer0Class, dimValue.get(i));
					} else {
						// i不为1表示遍历下一层
						for (final List<Class<?>> tempClass : tempList) {
							fillBySingle(tempRetList, tempClass,
									dimValue.get(i));
						}
					}
				}
				tempList.addAll(tempRetList);
				if (i < dimValue.size() - 1) {
					tempRetList.clear();
				}
			}
			retList.addAll(tempRetList);
		}
		for (int i = retList.size() - 1; i >= 0; i--) {
			if (retList.get(i).size() != dimValue.size()) {
				retList.remove(i);
			}
		}
		return retList;
	}

	private static Constructor<?> getConn(final Class<?> clazz,
			final Object... params) {
		List<List<Class<?>>> dimValue = genParamDim(params);
		List<List<Class<?>>> paramList = genParamTypes(dimValue);
		Constructor<?> retConn = null;
		for (final List<Class<?>> param : paramList) {
			try {
				retConn = clazz
						.getConstructor(param.toArray(new Class<?>[] {}));
			} catch (NoSuchMethodException e) {
				continue;
			} catch (SecurityException e) {
				e.printStackTrace();
			}
			if (null != retConn) {
				break;
			}
		}
		return retConn;
	}

	@SuppressWarnings("unchecked")
	public static <T extends Object> T createInstance(final String className,
			final Object... params) {
		T ret = null;
		if (null != className && null != params) {
			try {
				final Class<?> clazz = Class.forName(className);
				final Constructor<?> constructor = getConn(clazz, params);
				if (null != constructor) {
					System.out.println("Success: " + constructor);
					// Open accessible modifier
					if (!constructor.isAccessible()) {
						constructor.setAccessible(true);
					}
					final Object instance = constructor.newInstance(params);
					if (null != instance) {
						ret = (T) instance;
					}
				}
				System.out.println("===============================");
			} catch (ClassNotFoundException | SecurityException
					| InstantiationException | IllegalAccessException
					| IllegalArgumentException | InvocationTargetException ex) {
				ex.printStackTrace();
			}
		}
		return ret;
	}
}

// if (dimValue.size() <= 1) {
// // 只有一个集合，集合中有元素，则笛卡尔集就是这个元素本身
// for (int i = 0; i < dimValue.get(layer).size(); i++) {
// Class<?>[] element = new Class<?>[dimValue.size()];
// element[layer] = dimValue.get(layer).get(i);
// result.add(element);
// }
// } else {
// if (layer < dimValue.size() - 1) {
// List<Class<?>> startLayer = new ArrayList<>();
// if(layer == dimValue.size() - 2){
// startLayer = dimValue.get(layer);
// }
// List<Class<?>> endLayer = dimValue.get(layer + 1);
// for (final Class<?> startCls : startLayer) {
// for (final Class<?> endCls : endLayer) {
// Class<?>[] element = new Class<?>[dimValue.size()];
// element[layer] = startCls;
// element[layer + 1] = endCls;
// result.add(element);
// }
// }
// genParamTypes(dimValue, result, layer + 1);
// for (final Class<?>[] item : result) {
// final StringBuilder builder = new StringBuilder();
// for (final Class<?> singleItem : item) {
// if (null != singleItem) {
// builder.append(singleItem.getSimpleName()).append(
// ",");
// }
// }
// System.out.println("Output: " + builder);
// }/*
// * System.out.println(layer + ": Expand Start"); for (int i = 0;
// * i < dimValue.get(layer).size(); i++) { Class<?>[] element =
// * new Class<?>[dimValue.size()]; element[layer] =
// * dimValue.get(layer).get(i); element[layer+1] =
// * dimValue.get(layer + 1).get(i); result.add(element);
// * System.out.println(layer + ": " + i + ":" +
// * dimValue.get(layer).get(i)); genParamTypes(dimValue, result,
// * layer + 1); } System.out.println(layer + ": Expand End");
// */
// }
// }
