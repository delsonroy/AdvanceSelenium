package day12;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		//%C - for the FQCN
		//%d - for the date and time
		//%L only the line num
		//%M - provides the details of the method name
		//Example for Singleton class since we can create the Objecct only once and if we create another object it will just reuse the same
		Logger log4j = Logger.getRootLogger();
		//Layout provide the details of file layout
		PatternLayout layout= new PatternLayout(" %C  %F- %m %d  %p %n ");
		//Appender means where we can write, we can write to a file, console and HTML doc
		//below line provides the details of the file
		FileAppender appender= new FileAppender(layout, "del.log");
		log4j.addAppender(appender);
		
		log4j.info("Hi this is loggin");
		log4j.warn("This is warning");

	}

}
