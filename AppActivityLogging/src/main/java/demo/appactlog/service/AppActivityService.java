package demo.appactlog.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import demo.appactlog.dto.ApplicationActivity;
import demo.appactlog.dto.LogServiceMethod;

@Stateless
public class AppActivityService {

	static final Logger loggerAppA = LoggerFactory.getLogger("AppA");
	static final Logger loggerAppB = LoggerFactory.getLogger("AppB");

	final Map<String, LogServiceMethod> serviceMethodMap;

	public AppActivityService() {
		Map<String, LogServiceMethod> aMap = new HashMap<>();
		aMap.put("AppA", (act) -> logAppA(act));
		aMap.put("AppB", (act) -> logAppB(act));
		serviceMethodMap = Collections.unmodifiableMap(aMap);
	}

	public void log(ApplicationActivity act) {
		final LogServiceMethod serviceMethod = serviceMethodMap.get(act.getApplicationName());
		if (serviceMethod != null)
			serviceMethod.execute(act);
	}

	private void logAppA(ApplicationActivity act) {
		switch (act.getActivityType().toLowerCase()) {
		case "info":
			loggerAppA.info(act.getActivity());
			break;
		case "error":
			loggerAppA.error(act.getActivity());
			break;
		case "debug":
			loggerAppA.debug(act.getActivity());
			break;
		default:
			loggerAppA.info(act.getActivity());
			break;
		}
	}

	private void logAppB(ApplicationActivity act) {
		switch (act.getActivityType().toLowerCase()) {
		case "info":
			loggerAppB.info(act.getActivity());
			break;
		case "error":
			loggerAppB.error(act.getActivity());
			break;
		case "debug":
			loggerAppB.debug(act.getActivity());
			break;
		default:
			loggerAppB.info(act.getActivity());
			break;
		}
	}
}
