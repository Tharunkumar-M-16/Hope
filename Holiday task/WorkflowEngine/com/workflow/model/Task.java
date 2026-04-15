package com.workflow.model;

public abstract class Task implements Comparable<Task> {
    private String name;
    private int priority; // Lower is higher priority
    private String status;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
        this.status = "PENDING";
    }

    // Encapsulation: getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getPriority() { return priority; }
    public void setPriority(int priority) { this.priority = priority; }
    public String getStatus() { return status; }
    protected void setStatus(String status) { this.status = status; }

    // Abstract method for overriding
    public abstract void execute();

    // Comparable implementation
    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return String.format("[%s] Task: %s (Priority: %d)", status, name, priority);
    }
}
