package com.sco.lyra.util;

import java.util.Collection;
import java.util.Map;

import org.apache.log4j.Level;

/**
 * Debugging tools and it provide below features: 1. Debug current system; 2.
 * Provide logging feature
 * 
 * @author Lang
 *
 */
public final class Logger {
	private Logger(){}
	/**
	 * Print stack information of input exception, help to check details
	 * 
	 * @param inputEx
	 */
	public static void stack(final Class<?> clazz, final Exception inputEx) {
		if (null != inputEx) {
			final org.apache.log4j.Logger logger = getLogger(clazz);
			if (logger.isTraceEnabled()) {
				logger.trace(inputEx.getMessage(), inputEx);
			}
		}
	}

	/**
	 * Print basic information with System.out, help to do some small debugging
	 * works.
	 * 
	 * @param message
	 */
	public static void console(final Class<?> clazz, final Object message) {
		final org.apache.log4j.Logger logger = getLogger(clazz);
		if (logger.isInfoEnabled()) {
			logger.info(message);
		}
	}

	/**
	 * 
	 * @param clazz
	 * @param message
	 */
	public static void error(final Class<?> clazz, final Object message) {
		final org.apache.log4j.Logger logger = getLogger(clazz);
		if (logger.isTraceEnabled()) {
			logger.error(message);
		}
	}

	/**
	 * 
	 * @param clazz
	 * @param message
	 */
	public static void warn(final Class<?> clazz, final Object message) {
		final org.apache.log4j.Logger logger = getLogger(clazz);
		if (logger.getLevel() == Level.WARN) {
			logger.warn(message);
		}
	}

	/**
	 * Log basic information with Logger and write the information to log files;
	 * 
	 * @param clazz
	 * @param message
	 */
	public static void debug(final Class<?> clazz, final Object message) {
		final org.apache.log4j.Logger logger = getLogger(clazz);
		if (logger.isDebugEnabled()) {
			logger.debug(message);
		}
	}

	/**
	 * Print information of list data type, a method to capture list data;
	 * 
	 * @param list
	 */
	public static void outObject(final Class<?> clazz, final Collection<?> list) {
		final StringBuilder contentBuf = new StringBuilder(256);
		contentBuf.append("[Collection] : (").append(list.size())
				.append(") -> [");
		for (final Object item : list) {
			contentBuf.append(item).append(" ,");
		}
		contentBuf.delete(contentBuf.length() - 1, contentBuf.length());
		contentBuf.append(']');
		console(clazz, contentBuf);
	}

	/**
	 * 
	 * @param map
	 */
	public static void outObject(final Class<?> clazz, final Map<?, ?> map) {
		final StringBuilder contentBuf = new StringBuilder(256);
		contentBuf.append("[Map] : (").append(map.size()).append(") -> [");
		for (final Object key : map.keySet()) {
			contentBuf.append(key).append(" -> ").append(map.get(key))
					.append(" ,");
		}
		contentBuf.delete(contentBuf.length() - 1, contentBuf.length());
		contentBuf.append(']');
		console(clazz, contentBuf);
	}
	
	public static <T> void outObject(final Class<?> clazz, final T[] arr){
		final StringBuilder contentBuf = new StringBuilder(256);
		contentBuf.append("[Array] : (").append(arr.length)
				.append(") -> [");
		for (final T item : arr) {
			contentBuf.append(item).append(" ,");
		}
		contentBuf.delete(contentBuf.length() - 1, contentBuf.length());
		contentBuf.append(']');
		console(clazz, contentBuf);
	}
	
	private static org.apache.log4j.Logger getLogger(final Class<?> clazz) {
		return org.apache.log4j.Logger.getLogger(clazz);
	}
}
