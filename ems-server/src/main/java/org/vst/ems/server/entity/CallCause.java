package org.vst.ems.server.entity;

public enum CallCause {

    DEFAULT("default", 1);

    private String name;
    private int priority;

    CallCause(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }
}
