package org.ivance.antibat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Antibat {
	public static final String MOD_ID = "antibat";

	public static void init() {
		// get logger
		Logger logger = (Logger) LogManager.getLogger();
		logger.info("Antibat enabled");
	}
}