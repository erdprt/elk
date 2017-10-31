package fr.erdprt.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogGenerator {

	private static final Logger LOGGER	=	LoggerFactory.getLogger(LogGenerator.class);
	
	public static void main(String[] args) {
		new LogGenerator().proceed();

	}
	
	public void proceed() {
		
		for (int index=0;index<10;index++) {
			String firstName	=	"firstName-" + index;
			String lastName	=	"lastName-" + index;
			int age	=	index;
			
			LOGGER.info("{},{},{}", firstName, lastName, age);
			
		}
		
	}

}
