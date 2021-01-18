package main.java;

public class Task {
    protected String description;

    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); //return tick or X symbols
    }

    public String returnDescription(){
        return "[" + getStatusIcon() + "] " + description;
    }

    public void changeTaskToDone(){
        isDone = true;
    }
}
