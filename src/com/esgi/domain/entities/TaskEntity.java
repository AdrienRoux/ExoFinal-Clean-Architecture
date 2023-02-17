package com.esgi.domain.entities;

import com.esgi.domain.enums.TaskState;

import java.util.Date;

public class TaskEntity {
    private Date creationDate;
    private Date dueDate;
    private Date closeDate;
    private String description;
    private Enum<TaskState> state;
    private TaskEntity[] subTasks;

    public TaskEntity(Date creationDate, Date dueDate, Date closeDate, String description, Enum<TaskState> state, TaskEntity[] subTasks) {
        this.creationDate = creationDate;
        this.dueDate = dueDate;
        this.closeDate = closeDate;
        this.description = description;
        this.state = state;
        this.subTasks = subTasks;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Enum<TaskState> getState() {
        return state;
    }

    public void setState(Enum<TaskState> state) {
        this.state = state;
    }

    public TaskEntity[] getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(TaskEntity[] subTasks) {
        this.subTasks = subTasks;
    }

    @Override
    public String toString() {
        return String.format("Task: %s, State: %s, Created: %s, Due: %s, Closed: %s",
                description,
                state,
                creationDate.toString(),
                dueDate == null ? "N/A" : dueDate.toString(),
                closeDate == null ? "N/A" : closeDate.toString());
    }
}
