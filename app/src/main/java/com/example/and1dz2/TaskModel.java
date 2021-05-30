package com.example.and1dz2;

import java.util.Date;

public class TaskModel {

    private String title;
    private String description;
    private long data;

    public TaskModel() {
    }

    public TaskModel(String title, String description, long data) {
        this.title = title;
        this.description = description;
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }
}
