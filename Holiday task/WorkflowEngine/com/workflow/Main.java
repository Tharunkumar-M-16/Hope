package com.workflow;

import com.workflow.core.WorkflowManager;
import com.workflow.model.Task;
import com.workflow.tasks.DataValidationTask;
import com.workflow.tasks.FileProcessTask;

public class Main {
    public static void main(String[] args) {
        WorkflowManager engine = new WorkflowManager();

        // Adding tasks out of order to demonstrate sorting
        engine.addTask(new FileProcessTask("Monthly Report Generation", 2));
        engine.addTask(new DataValidationTask("Database Sync Validation", 1));
        engine.addTask(new DataValidationTask("User Permission Audit", 3));
        engine.addTask(new FileProcessTask("Backup Archive Creation", 1));

        System.out.println(">>> Initial Tasks (Unsorted):");
        engine.displayQueue();

        System.out.println("\n>>> Sorting by Priority (using Comparable - Natural Order):");
        engine.sortTasksByPriority();
        engine.displayQueue();

        System.out.println("\n>>> Sorting by Name (using custom Comparator):");
        engine.sortTasksByName();
        engine.displayQueue();

        System.out.println("\n>>> Executing Workflow (Sorted by Priority for final execution):");
        engine.sortTasksByPriority();
        engine.runWorkflow();
    }
}
