package demo.appactlog.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import demo.appactlog.dto.LogServiceMethod;

public class AppActivityService {

	static final Logger loggerAppA = LoggerFactory.getLogger("AppA");
	static final Logger loggerAppB = LoggerFactory.getLogger("AppB");

	static final Map<String, LogServiceMethod> serviceMethodMap;

	static {
		Map<String, LogServiceMethod> aMap = new HashMap<>();
		aMap.put("AppA", (activity, activityType) -> logAppA(activity, activityType));
		aMap.put("AppB", (activity, activityType) -> logAppB(activity, activityType));
		serviceMethodMap = Collections.unmodifiableMap(aMap);
	}

	public static void log(String applicationName, String activity, String activityType) {
		final LogServiceMethod serviceMethod = serviceMethodMap.get(applicationName);
		if (serviceMethod != null)
			serviceMethod.execute(activity, activityType);
	}

	private static void logAppA(String activity, String activityType) {
		switch (activityType.toLowerCase()) {
		case "info":
			loggerAppA.info(activity);
			break;
		case "error":
			loggerAppA.error(activity);
			break;
		case "debug":
			loggerAppA.debug(activity);
			break;
		default:
			loggerAppA.info(activity);
			break;
		}
	}

	private static void logAppB(String activity, String activityType) {
		switch (activityType.toLowerCase()) {
		case "info":
			loggerAppB.info(activity);
			break;
		case "error":
			loggerAppB.error(activity);
			break;
		case "debug":
			loggerAppB.debug(activity);
			break;
		default:
			loggerAppB.info(activity);
			break;
		}
	}
}
