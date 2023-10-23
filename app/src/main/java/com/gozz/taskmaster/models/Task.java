package com.gozz.taskmaster.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

// create a data class. seems like a 'schema' to me
@Entity
public class Task {
  @PrimaryKey(autoGenerate = true)
          public Long id;
  String name;
  String description;
  java.util.Date dateCreated;
  TaskStatusEnum status;
  
  public Task(String name) {
    
    this.name = name;
    this.description = description;
    this.dateCreated = dateCreated;
    this.status = status;
  }
  
  public String getName() {
    
    return name;
  }
  
  public void setName(String name) {
    
    this.name = name;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public Date getDateCreated() {
    return dateCreated;
  }
  
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }
  
  public TaskStatusEnum getStatus() {
    return status;
  }
  
  public void setStatus(TaskStatusEnum status) {
    this.status = status;
  }
}
