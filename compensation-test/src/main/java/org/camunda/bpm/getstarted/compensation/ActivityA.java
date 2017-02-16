package org.camunda.bpm.getstarted.compensation;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ActivityA implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("ACTIVITY-A");

	@Override
	public void execute(DelegateExecution arg0) throws Exception {
		LOGGER.info("Inside Class A Activity");
		new Thread();
		Thread.sleep(10000);
		LOGGER.info("After 10 seconds inside A Activity");

	}

}
