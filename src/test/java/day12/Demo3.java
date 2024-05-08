package day12;

import java.io.IOException;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Demo3 {

	public static void main(String[] args) throws Exception {

		Logger log4j = Logger.getRootLogger();		
		log4j.fatal("this is fatal msg");
		log4j.error("this is error");
		log4j.warn("This is warn");
		log4j.info("this is info");
		log4j.debug("this is debug");
		log4j.trace("this is trace");
		
		log4j.fatal("this is fatal msg2");
		log4j.error("this is error2");
		log4j.warn("This is warn2");
		log4j.info("this is info2");
		log4j.debug("this is debug2");
		log4j.trace("this is trace2");
		System.out.println("Done");
	}

}
