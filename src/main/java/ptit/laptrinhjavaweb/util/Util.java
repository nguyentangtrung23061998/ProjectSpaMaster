package ptit.laptrinhjavaweb.util;

import org.apache.log4j.Logger;


public class Util {
	
	private static final Logger log = Logger.getLogger(Util.class);
	
	public Util() {
	}
	
	public static String convertExceptionToString(Exception e) {
		e.printStackTrace();
		StackTraceElement[] traces = e.getStackTrace();
		StringBuilder message = new StringBuilder();
		message.append(e.toString() + "\n");
		for (StackTraceElement element : traces)
			message.append(element).append("\n");

		return message.toString();
	}
}
