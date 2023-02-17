package com.esgi.domain.services;

import com.esgi.domain.entities.TaskEntity;
import com.esgi.domain.enums.TaskState;

import java.util.*;

public class TaskService {
    private final List<TaskEntity> tasks = new ArrayList<>();


    public List<TaskEntity> getTasks() {
        return tasks;
    }

    public TaskEntity addTask(Date created, Date dueDate, Date closeDate, String description, TaskEntity[] subTasks) {
        TaskEntity task = new TaskEntity(created, dueDate, closeDate, description, TaskState.TODO, subTasks);
        tasks.add(task);
        return task;
    }

    public TaskEntity updateTask(TaskEntity task, Date created, Date dueDate, Date closeDate, TaskState state, TaskEntity[] subTasks) {
        task.setCreationDate(); = created;
        task.dueDate = dueDate;
        task.closeDate = closeDate;
        task.state = state;
        task.subTasks = subTasks;
        return task;
    }

    public TaskEntity updateTaskStatus(TaskEntity task, TaskState state) {
        task.state = state;
        return task;
    }

    public void deleteTask(TaskEntity task) {
        tasks.remove(task);
    }

    public List<TaskEntity> orderByCreationDate() {
        Collections.sort(tasks, new Comparator<TaskEntity>() {
            @Override
            public int compare(TaskEntity o1, TaskEntity o2) {
                return o2.getCreationDate().compareTo(o1.getCreationDate());
            }
        });
    }
}
