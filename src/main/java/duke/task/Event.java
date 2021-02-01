package main.java.duke.task;

public class Event extends Task {
    private String eventAt;
    public Event(String description, String eventAt) {
        super(description);
        this.eventAt = eventAt;
    }

    public Event(String description, String eventAt, int doneInt) {
        super(description, doneInt);
        this.eventAt = eventAt;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + eventAt + ")";
    }

    @Override
    public String toSaveFormat() {
        return "E|" + super.toSaveFormat() + "|" + eventAt;
    }
}