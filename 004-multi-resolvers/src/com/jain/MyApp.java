package com.jain;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class MyApp {
	static Logger logger = Logger.getLogger(MyApp.class);
	public static void main(String[] args){
		System.out.println("MyApp is running...."); 

		BasicConfigurator.configure();
        logger.info("Hello World"); 
	}
}
