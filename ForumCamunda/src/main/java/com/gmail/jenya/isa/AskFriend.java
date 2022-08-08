package com.gmail.jenya.isa;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class AskFriend implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String question = (String) delegateExecution.getVariable("question");

        delegateExecution.getProcessEngineServices().getRuntimeService()
                .createMessageCorrelation("AskFriend").setVariable("question", question)
                .correlate();



    }
}
