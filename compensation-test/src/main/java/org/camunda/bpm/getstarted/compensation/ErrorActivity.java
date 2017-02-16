package org.camunda.bpm.getstarted.compensation;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ErrorActivity implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("ERROR-Activity");

	@Override
	public void execute(DelegateExecution arg0) throws Exception {
		LOGGER.info("Inside Class ERROR-Activity");
		LOGGER.info("Throwing an Exception!");

		throw new BpmnError("Exception in Error Activity!");

	}

}
