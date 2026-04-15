package com.workflow.tasks;

import com.workflow.model.Task;

public class FileProcessTask extends Task {
    public FileProcessTask(String name, int priority) {
        super(name, priority);
    }

    @Override
    public void execute() {
        System.out.println("Executing " + getName() + ": Processing files and generating reports...");
        try { Thread.sleep(800); } catch (InterruptedException e) {}
        setStatus("COMPLETED");
        System.out.println(">> File processing finished.");
    }
}
