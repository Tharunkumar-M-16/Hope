package com.workflow.core;

import com.workflow.model.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class WorkflowManager {
    private List<Task> taskQueue;

    public WorkflowManager() {
        this.taskQueue = new ArrayList<>();
    }

    public void addTask(Task task) {
        taskQueue.add(task);
    }

    public void sortTasksByPriority() {
        // Uses Comparable implementation (priority)
        Collections.sort(taskQueue);
    }

    public void sortTasksByName() {
        // Uses a custom Comparator
        taskQueue.sort(new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                return t1.getName().compareToIgnoreCase(t2.getName());
            }
        });
    }

    public void runWorkflow() {
        System.out.println("--- Starting Workflow Execution ---");
        
        // Using Iterator to traverse the tasks
        Iterator<Task> iterator = taskQueue.iterator();
        while (iterator.hasNext()) {
            Task currentTask = iterator.next();
            System.out.println("Queue Item: " + currentTask);
            currentTask.execute();
            System.out.println("--------------------------------");
        }
        
        System.out.println("--- Workflow Completed Successfully ---");
    }

    public void displayQueue() {
        System.out.println("Current Task Queue:");
        for (Task t : taskQueue) {
            System.out.println(t);
        }
    }
}
