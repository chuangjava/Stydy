package com.dc.test;
import org.apache.log4j.Logger;

public class Testzz {
	private static final Logger LOGGER = Logger.getLogger(Testzz.class);

	public static void main(String[] args) {
		try {
			int ss = 100;
			int zz = ss/0;
			System.out.println(zz);
		} catch (Exception e) {
			LOGGER.error("run error.", e);
		}
	}
}
