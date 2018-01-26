package fr.erdprt.logs;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoordinatesGenerator {

	private static final Logger LOGGER = LoggerFactory.getLogger(CoordinatesGenerator.class);

	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

	public static final String[] HTTP_CODES = new String[] { "200", "401", "500", "503" };
	
	public static final String[] METHODS = new String[] { "GET", "POST", "PUT", "DELETE" };
	
	//public static final String[] IPS = new String[] { "1.0.87.0", "81.0.87.0", "104.129.204.92", "178.251.73.228", "198.102.9.16","212.183.207.0" , "212.184.19.0" , "223.255.255.0"};
	
	public static final String[] IPS = new String[] { "1.0.87.0", "212.183.207.0" };

	public static final String[] PATHS = new String[] { "/product/", "/product/12/", "/product/45/", "/customer/",
			"/customer/5" };

	public static void main(String[] args) throws Exception {
		new CoordinatesGenerator().proceed();

	}

	public void proceed() throws Exception {

		for (int index = 0; index < 1000; index++) {
			// format: date method ip path httpcode
			LOGGER.info("{} {} {} {} {}", dateFormat.format(Calendar.getInstance().getTime()), getMethod(),	getIp(index), getPath(index), getCode(index));
			//LOGGER.info("{},{},{},{},{}", dateFormat.format(Calendar.getInstance().getTime()), getMethod(),	getIp(index), getPath(index), getCode(index));
			Thread.sleep(50);
		}

	}

	public String getIp(final int index) {
		//String ip = "1.0.87.0";
		int rnd = new Random().nextInt(IPS.length);
		return IPS[rnd];		
	}

	public String getPath(final int index) {
		int rnd = new Random().nextInt(PATHS.length);
		return PATHS[rnd];
	}

	public String getCode(final int index) {
		int rnd = new Random().nextInt(HTTP_CODES.length);
		return HTTP_CODES[rnd];
	}

	public String getMethod() {
		int rnd = new Random().nextInt(METHODS.length);
		return METHODS[rnd];
	}

}
