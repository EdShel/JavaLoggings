package ua.nure.sheliemietiev;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Calc {
	private static final Logger log = Logger.getLogger(Calc.class.getName());

	public static int add(int x, int y) {
		log.info("add");
		log.log(Level.FINEST, "x = {0}", x);
		log.log(Level.FINEST, "y = {0}", y);

		return x + y;
	}

	public static int sub(int x, int y) {
		log.config("sub");
		log.log(Level.FINEST, "x = {0}", x);
		log.log(Level.FINEST, "y = {0}", y);

		return x - y;
	}

	public static int div(int x, int y) {
		log.config("div");
		log.log(Level.FINEST, "x = {0}", x);
		log.log(Level.FINEST, "y = {0}", y);

		return x / y;
	}

	public static int mul(int x, int y) {
		log.config("mul");
		log.log(Level.FINEST, "x = {0}", x);
		log.log(Level.FINEST, "y = {0}", y);

		return x * y;
	}
}
