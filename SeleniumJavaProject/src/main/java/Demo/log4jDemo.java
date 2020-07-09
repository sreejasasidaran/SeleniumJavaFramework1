package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jDemo {

	static Logger logger  = LogManager.getLogger(log4jDemo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		 System.out.println("Hellow world");
		 
		 logger.info("this is information message");
		 logger.error("this is an error message");
		 logger.warn("this ia warning message");
		 logger.fatal("this iss a fatal message");
		 
		 System.out.println("completed");
	}

}
