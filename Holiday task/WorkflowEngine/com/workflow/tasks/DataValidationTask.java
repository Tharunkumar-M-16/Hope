package com.workflow.tasks;

import com.workflow.model.Task;

public class DataValidationTask extends Task {
    public DataValidationTask(String name, int priority) {
        super(name, priority);
    }

    @Override
    public void execute() {
        System.out.println("Executing " + getName() + ": Validating input data integrity...");
        // Simulating work
        try { Thread.sleep(500); } catch (InterruptedException e) {}
        setStatus("COMPLETED");
        System.out.println(">> Data validation successful.");
    }
}
