package org.camunda.bpm.getstarted.compensation;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class RollbackActivityA implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("ROLLBACK_ACTIVITY-A");

	@Override
	public void execute(DelegateExecution arg0) throws Exception {
		LOGGER.info("Inside Class Rollback Activity A");

	}

}
