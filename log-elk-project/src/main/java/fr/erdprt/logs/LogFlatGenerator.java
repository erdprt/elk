package fr.erdprt.logs;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFlatGenerator {

	private static final Logger LOGGER	=	LoggerFactory.getLogger(LogFlatGenerator.class);
	
	private static SimpleDateFormat dateFormat	=	new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
	
	public static void main(String[] args) throws Exception {
		new LogFlatGenerator().proceed();

	}
	
	public void proceed() throws Exception {
		
		for (int index=0;index<100;index++) {
			String firstName	=	"firstName-" + index;
			String lastName	=	"lastName-" + index;
			int age	=	index;
			
			LOGGER.info("{},{},{},{}", dateFormat.format(Calendar.getInstance().getTime()) ,firstName, lastName, age);
			Thread.sleep(50);
			
		}
		
	}

}
