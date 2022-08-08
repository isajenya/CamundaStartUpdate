package com.gmail.jenya.isa;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;


public class LoggerDelegate implements JavaDelegate {

    private final Logger LOGGER = Logger.getLogger(LoggerDelegate.class.getName());

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String question = (String) delegateExecution.getVariable("question");

        LOGGER.info("\n\n ___ LOGGER DELEGETE BY " +
                "processDefinitionId " + delegateExecution.getProcessDefinitionId() +
                " activityId " + delegateExecution.getCurrentActivityId() +
                ", activityName " + delegateExecution.getCurrentActivityName() +
                "\nQuestion is: " + question);

    }
}
